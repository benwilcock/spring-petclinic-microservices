import imports.k8s.*;
import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;
import org.jetbrains.annotations.NotNull;
import software.constructs.Construct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main extends Chart {
    private static final String VERSION = "2.4.1";
    private static final String LIBRARY_NAME = "benwilcock";
    private static final String APP_NAMESPACE = "default";
    private static final String CONFIG_SERVER_URI = "http://config-server-service.default.svc.cluster.local:8888";
    private static final String GIT_CONFIG_URI = "https://github.com/benwilcock/spring-petclinic-microservices-config";
    private static final String DISCOVERY_SERVER_URI = "http://discovery-server-service.default.svc.cluster.local:8761/eureka";
    private static final String TRACING_SERVER_URI = "http://tracing-server-service.default.svc.cluster.local:9411";

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartOptions options) {
        super(scope, id, options);

        // Defining a service
        addService(9411, "tracing-server-service", "tracing-server");
        addService(8888, "config-server-service", "config-server");
        addService(8761, "discovery-server-service", "discovery-server");
        addService(9090, "admin-server-service", "admin-server");
        addService(8083, "vets-service-service", "vets-service");
        addService(8082, "visits-service-service", "visits-service");
        addService(8081, "customers-service-service", "customers-service");
        addService(8080, "api-gateway-service", "api-gateway");

        addRegularDeployment(9411, "tracing-server", "openzipkin/zipkin-slim:2");
        addSpringDeployment(8888, "config-server", LIBRARY_NAME + "/spring-petclinic-config-server:" + VERSION);
        addSpringDeployment(8761, "discovery-server", LIBRARY_NAME + "/spring-petclinic-discovery-server:" + VERSION);
        addSpringDeployment(9090, "admin-server", LIBRARY_NAME + "/spring-petclinic-admin-server:" + VERSION);
        addSpringDeployment(8083, "vets-service", LIBRARY_NAME + "/spring-petclinic-vets-service:" + VERSION);
        addSpringDeployment(8082, "visits-service", LIBRARY_NAME + "/spring-petclinic-visits-service:" + VERSION);
        addSpringDeployment(8081, "customers-service", LIBRARY_NAME + "/spring-petclinic-customers-service:" + VERSION);
        addSpringDeployment(8080, "api-gateway", LIBRARY_NAME + "/spring-petclinic-api-gateway:" + VERSION);
    }

    private void addService(final Number PORT, final String SERVICE_NAME, final String APP_NAME) {

        final String serviceType = "NodePort";

        final List<ServicePort> servicePorts = new ArrayList<>();
        final ServicePort servicePort = new ServicePort.Builder()
            .port(PORT)
            .targetPort(IntOrString.fromNumber(PORT))
            .build();
        servicePorts.add(servicePort);

        final Map<String, String> selector = new HashMap<>();
        selector.put("app", APP_NAME);
        final ServiceSpec serviceSpec = new ServiceSpec.Builder()
            .type(serviceType)
            .selector(selector)
            .ports(servicePorts)
            .build();

        final ServiceOptions serviceOptions = new ServiceOptions.Builder()
            .spec(serviceSpec)
            .metadata(ObjectMeta.builder().name(SERVICE_NAME).build())
            .build();

        new Service(this, SERVICE_NAME, serviceOptions);
    }

    @NotNull
    private imports.k8s.Probe getReadynessProbeSpec(Number PORT) {
        return Probe.builder()
            .initialDelaySeconds(15)
            .periodSeconds(30)
            .timeoutSeconds(15)
            .httpGet(HttpGetAction.builder().path("/actuator/health").port(IntOrString.fromNumber(PORT)).build())
            .build();
    }

    @NotNull
    private imports.k8s.Probe getLivenessProbeSpec(Number PORT) {
        return Probe.builder()
            .initialDelaySeconds(30)
            .periodSeconds(30)
            .timeoutSeconds(15)
            .failureThreshold(4)
            .httpGet(HttpGetAction.builder().path("/actuator/health").port(IntOrString.fromNumber(PORT)).build())
            .build();
    }

    private void addSpringDeployment(final Number PORT, final String APP_NAME, final String IMAGE_NAME) {

        final Map<String, String> selector = new HashMap<>();
        selector.put("app", APP_NAME);

        // Defining a Deployment
        final LabelSelector labelSelector = new LabelSelector.Builder().matchLabels(selector).build();
        final ObjectMeta objectMeta = new ObjectMeta.Builder().labels(selector).build();

        final List<ContainerPort> containerPorts = new ArrayList<>();
        final ContainerPort containerPort = new ContainerPort.Builder().containerPort(PORT).build();
        containerPorts.add(containerPort);

        final List<EnvVar> envVars = new ArrayList<>();
        envVars.add(EnvVar.builder().name("SPRING_PROFILES_ACTIVE").value("kubernetes").build());
        envVars.add(EnvVar.builder().name("PORT").value(String.valueOf(PORT)).build());
        envVars.add(EnvVar.builder().name("GIT_CONFIG_URI").value(String.valueOf(GIT_CONFIG_URI)).build());
        envVars.add(EnvVar.builder().name("CONFIG_SERVER_URI").value(String.valueOf(CONFIG_SERVER_URI)).build());
        envVars.add(EnvVar.builder().name("DISCOVERY_SERVER_URI").value(String.valueOf(DISCOVERY_SERVER_URI)).build());
        envVars.add(EnvVar.builder().name("TRACING_SERVER_URI").value(String.valueOf(TRACING_SERVER_URI)).build());


        final List<Container> containers = new ArrayList<>();
        final Container container = new Container.Builder()
            .name(APP_NAME)
            .image(IMAGE_NAME)
            .ports(containerPorts)
            .imagePullPolicy("Always")
            .env(envVars)
            .livenessProbe(getLivenessProbeSpec(PORT))
//            .readinessProbe(getReadynessProbeSpec(PORT))
            .build();
        containers.add(container);
        final PodSpec podSpec = new PodSpec.Builder()
            .containers(containers)
            .build();
        final PodTemplateSpec podTemplateSpec = new PodTemplateSpec.Builder()
            .metadata(objectMeta)
            .spec(podSpec)
            .build();
        final DeploymentSpec deploymentSpec = new DeploymentSpec.Builder()
            .replicas(1)
            .selector(labelSelector)
            .template(podTemplateSpec)
            .build();
        final DeploymentOptions deploymentOptions = DeploymentOptions.builder()
            .spec(deploymentSpec)
            .metadata(ObjectMeta.builder().name(APP_NAME + "-deployment").build())
            .build();

        new Deployment(this, APP_NAME + "-deployment", deploymentOptions);
    }

    private void addRegularDeployment(final Number PORT, final String APP_NAME, final String IMAGE_NAME) {

        final Map<String, String> selector = new HashMap<>();
        selector.put("app", APP_NAME);

        // Defining a Deployment
        final LabelSelector labelSelector = new LabelSelector.Builder().matchLabels(selector).build();
        final ObjectMeta objectMeta = new ObjectMeta.Builder().labels(selector).build();

        final List<ContainerPort> containerPorts = new ArrayList<>();
        final ContainerPort containerPort = new ContainerPort.Builder().containerPort(PORT).build();
        containerPorts.add(containerPort);

        final List<Container> containers = new ArrayList<>();
        final Container container = new Container.Builder()
            .name(APP_NAME)
            .image(IMAGE_NAME)
            .ports(containerPorts)
            .imagePullPolicy("Always")
            .livenessProbe(getLivenessProbeSpec(PORT))
//            .readinessProbe(getReadynessProbeSpec(PORT))
            .build();
        containers.add(container);
        final PodSpec podSpec = new PodSpec.Builder()
            .containers(containers)
            .build();
        final PodTemplateSpec podTemplateSpec = new PodTemplateSpec.Builder()
            .metadata(objectMeta)
            .spec(podSpec)
            .build();
        final DeploymentSpec deploymentSpec = new DeploymentSpec.Builder()
            .replicas(1)
            .selector(labelSelector)
            .template(podTemplateSpec)
            .build();
        final DeploymentOptions deploymentOptions = DeploymentOptions.builder()
            .spec(deploymentSpec)
            .metadata(ObjectMeta.builder().name(APP_NAME + "-deployment").build())
            .build();

        new Deployment(this, APP_NAME + "-deployment", deploymentOptions);
    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "petclinic");
        app.synth();
    }
}
