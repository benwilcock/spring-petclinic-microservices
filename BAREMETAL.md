# Running The Sample on Bare Metal (Local PC)

> This guide assumes that you have already performed the "Getting Started" tasks in the [README](README.md) and have decided to run the Petclinic Microservices sample on your local PC (a.k.a. 'bare metal'.) This is a very common development scenario as it makes debugging applications that little-bit easier.

Take a look at the following tables. The first is a list of microservices. It contains details of the `PORT` numbers, and boot order to use when running the sample. The secomd table contains a list of the environment variables expected by the microservices. Without these environment variables, the sample will not function correctly. The instructions below describe how to use these tables when starting the various microservices in the sample.

### Table 1: Service `PORT` and Boot Order

| Service                                                               | Project Folder Name | Port | Boot Order | Optional? |
| --------------------------------------------------------------------- | :------------------ |:----:|:----------:|:---------:|
| Spring Cloud Config Server                                            | `spring-petclinic-config-server` | `8888` | 1          | No        |
| Spring Cloud Discovery Server                                         | `spring-petclinic-discovery-server` | `8761` | 2          | No        |
| Spring Petclinic Vets Microservice                                    | `spring-petclinic-vets-service` | `8083` | 3          | No        |
| Spring Petclinic Visits Microservice                                  | `spring-petclinic-visits-service` | `8082` | 3          | No        |
| Spring Petclinic Customers Microservice                               | `spring-petclinic-customers-service` | `8081` | 3          | No        |
| [Spring Boot Admin Server](http://localhost:9090)                     | `spring-petclinic-admin-server` | `9090` | 3          | **Yes**       |
| [Zipkin Tracing Server](http://localhost:9411)                        | `spring-petclinic-zipkin-server` | `9411` | 2          | **Yes**       |
| [Spring Petclinic User Interface](http://localhost:8080)              | `spring-petclinic-api-gateway` | `8080` | 4          | No        |

### Table 2: Environment Variables

| Envitonment Variables                 | Value | Notes      |
| ------------------------------------- |:----- |:---------- |
| `PORT`                                | -- | Depends on the service, see Table 1 above |
| `GIT_CONFIG_URI`                      | The URL of your config fork. | If you didn't follow the setup steps, [go back](README.md). |
| `CONFIG_SERVER_URI`                   | `http://localhost:8888`             | Use correct IP address/DNS entry. Assumed to be on port 8888 |
| `DISCOVERY_SERVER_URI`                | `http://localhost:8761/eureka`      | Use correct IP address/DNS entry. Assumed to be on port 8761 |
| `TRACING_SERVER_URI`                  | `http://localhost:9411`             | Use correct IP address/DNS entry. Assumed to be on port 9411 |

## Step 1: Start The Spring Cloud Config Server Using _Your_ Forked Configuration

To tell your Config Server where to find _your_ forked configuration, you set the `GIT_CONFIG_URI` environment variable with the URL of your configuration. For example, your url might be `https://github.com/bob/spring-petclinic-microservices-config`. The method you'll use to set environment variables will depend on your personal preference for running the server. You may prefer to use an application 'run configuration' in your favourite IDE, or an OS level ENV variable for you terminal, or even set the value as you run the JAR application using the `spring-boot:run` maven command or the Java `jar` command.

For example, if using the `spring-boot:run` method with MacOS, Linux, or Windows Subsystem for Linux, your command line may look like something like the one shown below. Notice how the values used for the `PORT` and the `GIT_CONFIG_URI` match the instructions given in the tables above.

```bash
# In the folder spring-petclinic-microservices/spring-petclinic-config-server
> export PORT=8888; export GIT_CONFIG_URI=https://github.com/benwilcock/spring-petclinic-microservices-config; mvn package spring-boot:run
```

Choose your preferred method and start your configuration server. You'll see output similar to that shown below.

```bash
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.1)

2021-02-23 15:37:21.883  INFO 70290 --- [           main] o.s.s.p.c.NativeConfigServerApplication  : Starting NativeConfigServerApplication using Java 11.0.10 on nuc-pop-os with PID 70290
2021-02-23 15:37:21.885  INFO 70290 --- [           main] o.s.s.p.c.NativeConfigServerApplication  : No active profile set, falling back to default profiles: default
2021-02-23 15:37:22.479  INFO 70290 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8888 (http)
2021-02-23 15:37:22.484  INFO 70290 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-02-23 15:37:22.485  INFO 70290 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.41]
2021-02-23 15:37:22.992  INFO 70290 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2021-02-23 15:37:23.017  INFO 70290 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8888 (http) with context path ''
2021-02-23 15:37:23.044  INFO 70290 --- [           main] o.s.s.p.c.NativeConfigServerApplication  : Started NativeConfigServerApplication in 1.409 seconds (JVM running for 1.611)
```

Test the health of the server by calling the Spring Boot Actuator.

```bash
> curl http://localhost:8888/actuator/health
```

If the server is healthy, you should see the JSON message `{"status":"UP"}`. Further test the config server by asking for some configuration in the same way that a microservice would, using it's REST API.

```bash
> curl http://localhost:8888/discovery-server/default/master | cat
```

The server will respond with a JSON formatted String similar to the one shown below. This string can be used by a microservice to configure itself at runtime.

```bash
{"name":"discovery-server","profiles":["default"],"label":"master","version":"dc238242bc68e1f3de2ab9c17e71f4a2db139925","state":null,"propertySources":[{"name":"https://github.com/benwilcock/spring-petclinic-microservices-config/discovery-server.yml","source":{"eureka.instance.hostname":"localhost","eureka.client.registerWithEureka":false,"eureka.client.fetchRegistry":false,"eureka.client.serviceUrl.defaultZone":"http://${eureka.instance.hostname}:${server.port}/eureka/"}},{"name":"https://github.com/benwilcock/spring-petclinic-microservices-config/application.yml","source":{"server.port":"${PORT}","server.shutdown":"graceful","eureka.client.serviceUrl.defaultZone":"${DISCOVERY_SERVER_URI}","eureka.client.healthcheck.enabled":true,"eureka.instance.preferIpAddress":true,"spring.zipkin.enabled":true,"spring.zipkin.baseUrl":"${TRACING_SERVER_URI}","spring.datasource.schema":"classpath*:db/hsqldb/schema.sql","spring.datasource.data":"classpath*:db/hsqldb/data.sql","spring.cloud.refresh.refreshable":false,"spring.jpa.open-in-view":false,"spring.jpa.hibernate.ddl-auto":"none","management.port":"${PORT}","management.security.enabled":false,"management.endpoints.web.exposure.include":"*","management.endpoint.health.show-details":"ALWAYS","management.endpoint.metrics.enabled":true,"management.endpoint.prometheus.enabled":true}}]}
```

If you saw a similar string to the one shown above, your forked configuration is being served, and your configuration server is ready.

## Step 2: Start The Other Microservices

Now the Config Server is ready, proceed to start the other microservices in the sample using the following hints:

1. Use the 'Boot Order' from Table 1 above to help prevent race conditions.
1. Set the correct `PORT` value from Table 1 for each microservice. 
1. If using the terminal to start your microservices, start a new terminal for each service.
1. Pass the correct additional environment variables as shown in Table 2.

### Step 5: Admire Your Work!

Once all the microservices have started, you can begin to use the Petclinic Microservices sample by navigating your browser to the addresses below and trying out the various links you find there. Spring Petclinic is a mock Veterinarian admin system. Spring Boot Admin talks to the Spring Cloud Discovery server and gathers information on the services it discovers. Zipkin allows you to search tracing information to see how services calls relate to each other.

| Web Browser Address                                                   | Value                 | Notes       |
|:--------------------------------------------------------------------- |:---------------------:|:----------- |
| [Spring Petclinic Microservices](http://localhost:8080)               | http://localhost:8080 | Spring Petclinic is a mock Veterinarian admin system. |
| [Spring Boot Admin Server](http://localhost:9090)                     | http://localhost:9090 | Talks to the Spring Cloud Discovery server and gathers information on the services it discovers |
| [Zipkin Tracing Server](http://localhost:9411)                        | http://localhost:9411 | Zipkin allows you to search tracing information to see how services calls relate to each other. |

