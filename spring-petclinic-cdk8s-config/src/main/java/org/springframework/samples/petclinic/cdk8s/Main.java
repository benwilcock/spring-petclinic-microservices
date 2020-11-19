package org.springframework.samples.petclinic.cdk8s;

import imports.k8s.*;
import org.cdk8s.plus.EnvValue;
import org.jetbrains.annotations.NotNull;
import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main extends Chart
{
    private static final String VERSION = "2.3.6";
    private static final String LIBRARY_NAME = "benwilcock";

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartOptions options) {
        super(scope, id, options);

        // Defining a service
        addService(8888, "config-server-service", "config-server");
        addService(8761, "discovery-server-service", "discovery-server");
        addService(9090, "admin-server-service", "admin-server");
        addService(8083, "vets-service-service", "vets-service");
        addService(8082, "visits-service-service", "visits-service");
        addService(8081, "customers-service-service", "customers-service");
        addService(8080, "api-gateway-service", "api-gateway");

        addDeployment(8888, "config-server", LIBRARY_NAME + "/spring-petclinic-config-server:" + VERSION);
        addDeployment(8761, "discovery-server", LIBRARY_NAME + "/spring-petclinic-discovery-server:" + VERSION);
        addDeployment(9090, "admin-server", LIBRARY_NAME + "/spring-petclinic-admin-server:" + VERSION);
        addDeployment(8083, "vets-service", LIBRARY_NAME + "/spring-petclinic-vets-service:" + VERSION);
        addDeployment(8082, "visits-service", LIBRARY_NAME + "/spring-petclinic-visits-service:" + VERSION);
        addDeployment(8081, "customers-service", LIBRARY_NAME + "/spring-petclinic-customers-service:" + VERSION);
        addDeployment(8080, "api-gateway", LIBRARY_NAME + "/spring-petclinic-api-gateway:" + VERSION);
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

    private void addDeployment(final Number PORT, final String APP_NAME, final String IMAGE_NAME) {

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

        final List<Container> containers = new ArrayList<>();
        final Container container = new Container.Builder()
            .name(APP_NAME)
            .image(IMAGE_NAME)
            .ports(containerPorts)
            .imagePullPolicy("Always")
            .env(envVars)
            .livenessProbe(Probe.builder().initialDelaySeconds(60).periodSeconds(2).httpGet(HttpGetAction.builder().path("/actuator/health").port(IntOrString.fromNumber(PORT)).build()).build())
            .readinessProbe(Probe.builder().initialDelaySeconds(15).httpGet(HttpGetAction.builder().path("/actuator/health").port(IntOrString.fromNumber(PORT)).build()).build())
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
        final DeploymentOptions deploymentOptions = new DeploymentOptions.Builder()
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
