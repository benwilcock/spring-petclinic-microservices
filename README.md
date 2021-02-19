# Spring Petclinic Microservices Sample for Tanzu Application Service (TAS)

> Building these microservices requires Java 11 and Maven. I use the excellent [SDKMan](sdkman.io) to install these tools.

This microservices branch was initially derived from [spring-petclinic-microservices](https://github.com/spring-petclinic/spring-petclinic-microservices) which cleverly demonstrates how to split the [Spring Petclinic](https://github.com/spring-projects/spring-petclinic) sample application into [microservices](http://www.martinfowler.com/articles/microservices.html). To achieve that goal, spring-petclinic-microservices uses Spring Cloud API Gateway, Spring Cloud Config, and the Eureka Service Discovery from the [Spring Cloud Netflix](https://github.com/spring-cloud/spring-cloud-netflix) technology stack.

This sample in this fork takes the work done already and provides these additional features:-

* Updates the sample code to Spring Boot 2.4.1
* Updates the sample code to Spring Cloud 2020.0.1
* Adds configuration to run on Docker using `docker-compose`
* Adds configuration to run on Kubernetes (minus Spring Cloud Netflix Eureka)
* Introduces [spring-native](https://github.com/spring-projects-experimental/spring-native) to reduce application startup times and memory footprint.

## Getting Started: Running the sample.

First, decide if you would like to run the sample locally on your machine, locally using docker-compose, or locally using Kubernetes.

Next, take a look at the following table of services. It contains details of where each service can be found once you have started the sample. In particular, note the PORT numbers and suggested boot order. When you run the sample, these are the ports where each service can be found. Remember that in Kubernetes, you'll need to use a *port forward* to map the kubernetes hostes services to your local network address (localhost).

| Service                                                     | Port | Boot Order | Optional? |
| ----------------------------------------------------------- |:----:|:----------:|:---------:|
| Spring Cloud Config Server                                               | 8888 | 1          | No        |
| Spring Cloud Discovery Server                                            | 8761 | 2          | No        |
| Petclinic Vets Microservice                                           | 8083 | 3          | No        |
| Petclinic Visits Microservice                                         | 8082 | 3          | No        |
| Petclinic Customers Microservice                                      | 8081 | 3          | No        |
| [Spring Boot Admin Server](http://localhost:9090)           | 9090 | 3          | Yes       |
| [Zipkin Tracing Server](http://localhost:9411)              | 9411 | 2          | Yes       |
| Petclinic [Api Gateway Service (UI & Routing)](http://localhost:8080) | 8080 | 4          | No        |

# Step 0 (Optional): Build The Docker Container Images

If you would prefer to use your own Docker images rather than the ones I've already created, you must build them and push them to your Docker Hub or your preferred docker repository. The steps are as follows.

Make sure the docker daemon is running in the background, that your docker system is working, and that you have logged in.

```bash
docker run hello-world
```

Override the property `<docker.library.name>` in the `pom.xml` with your docker hub library name.

```xml
...
<properties>
    <docker.library.name>your-docker-library-name</docker.library.name>
...
```

Now, build the docker images using the `spring-boot:build-image` tool as follows:
```bash
# In the folder spring-petclinic-microservices/
./mvnw clean package -DskipTests=true spring-boot:build-image
```

Finally, push your images to docker hub or your preferred docker image repository.

## Step 1: Fork The Configuration Repository

Spring Cloud Config Server is the source of most of the configuration properties used in this sample, and it takes its configuration from a GitHub repository. In order to control the configuration being served by the server, you need to control the repository. You can acheive this by forking the configuration repository. 

Fork the [https://github.com/benwilcock/spring-petclinic-microservices-config](https://github.com/benwilcock/spring-petclinic-microservices-config) to your GutHub user space using the 'Fork' button.

> When you make changes to the files in this repository, be sure to commit and push your changes back to your fork and restart any applications who's configuration has been modified by the changes you commit.

## Step 2: Run The Configuration Server Using Your Forked Configuration

To tell your Config Server where to find _your_ forked configuration, you will use an environment variable called `GIT_CONFIG_URI`. You must set this property to be the location of your fork. For example if your git username was 'bob' the url might be `https://github.com/bob/spring-petclinic-microservices-config`. The method you use to set this environment variable will depend on your personal preferences if you're running locally on your machine (bare-metal), or on settings contains in YAMl configuration files if you're using Docker or Kubernetes.

### Bare metal

You have many choices for setting the `GIT_CONFIG_URI` environment property to the URI of your forked configuration. You could use an application 'run configuration' in your IDE, an OS level configuration for you terminal, or by setting the value as you run the JAR application either using the `spring-boot:run` maven command or the Java `jar` command.

For example, if using environment variables with MacOS, Linux, or Windows Subsystem for Linux, your command line may look like this:

```bash
# In the folder spring-petclinic-microservices/spring-petclinic-config-server
export PORT=8888; export GIT_CONFIG_URI=https://github.com/benwilcock/spring-petclinic-microservices-config; mvn package spring-boot:run
```

### Docker

In the `docker-compose.yml` overwrite the `config-server:` `environment:` value for the entry `GIT_CONFIG_URI` to the URL of your forked configuration repository. Don't start the application yet, there's more work required to customise it for your environment.

```yaml
...
config-server:
    image: benwilcock/spring-petclinic-config-server-native:2.4.1
    container_name: config-server
    mem_limit: 1024M
    ports:
        - 8888:8888
    environment:
        - PORT=8888
        - SPRING_PROFILES_ACTIVE=docker
        - TRACING_SERVER_URI=http://tracing-server:9411
        - GIT_CONFIG_URI=https://github.com/benwilcock/spring-petclinic-microservices-config
```

### Kubernetes

In the `petclinic.k8s.yml` overwrite the `config-deployment:` spec's `env:` value for the entry `GIT_CONFIG_URI` to the URL of your forked configuration repository. Don't start the application yet, there's more work required to customise it for your environment.

```yaml
...
  spec:
      containers:
        - env:
            - name: "SPRING_PROFILES_ACTIVE"
              value: "kubernetes"
            - name: "PORT"
              value: "8888"
            - name: "GIT_CONFIG_URI"
              value: "https://github.com/<your-github-username>/spring-petclinic-microservices-config"
```

Because the config server is the primary location for all the application config, you'll notice that the other Spring Boot microservices have almost zero configuration within their `src/main/resources` folders. Generally, only a `application.properties` file has been provided, and its configuration is limited to the application name, and some settings that define how to communicate with the config server. 

For example, if you examine the Discovery Server's `src/main/resources/application.properties` file, you'll see only the following items:

```java
spring.application.name=discovery-server
spring.config.import=configserver:${CONFIG_SERVER_URI}
spring.cloud.config.fail-fast=true
spring.cloud.compatibility-verifier.enabled=true
management.endpoints.web.exposure.include=*
```

In this example, the config server uri is expected to be provided by an environment property named `CONFIG_SERVER_URI`. This must be provided to the microservice as an environment variable at runtime.

## Step 3: Run The Other Microservices

| Service                                                     | Port | Boot Priority | Optional? |
| ----------------------------------------------------------- |:----:|:----------:|:---------:|
| Spring Cloud Config Server                                  | 8888 | 1          | No        |
| [Zipkin Tracing Server](http://localhost:9411)              | 9411 | 2          | Yes       |
| Spring Cloud Discovery Server                               | 8761 | 2          | No        |
| Petclinic Vets Microservice                                 | 8083 | 3          | No        |
| Petclinic Visits Microservice                               | 8082 | 3          | No        |
| Petclinic Customers Microservice                            | 8081 | 3          | No        |
| [Spring Boot Admin Server](http://localhost:9090)           | 9090 | 3          | Yes       |
| Petclinic [Api Gateway Service (UI & Routing)](http://localhost:8080) | 8080 | 4          | No        |

### Bare Metal

These are the Environment properties


### Docker

### Kubernetes

## Running The Petclinic Microservices Locally

Every microservice in the sample is a Java application and therefore each can be run locally using your Java IDE or by building Docker images and starting them (using Docker).

#### Start The Applications (Boot Order)

Each application requires an environment variable named `PORT` to be set at runtime. Without a `PORT` setting, generally the applications will refuse to start or clash with others already running. Configuring your apps to run in the IDE is particularly convenient as most allow you to create a 'run' configuration that's specific to each application in the project. Each of these run configurations can include the correct PORT setting as shown in the table below:

| Service                                                     | Port | Boot Order | Optional? |
| ----------------------------------------------------------- |:----:|:----------:|:---------:|
| Config Server                                               | 8888 | 1          | No        |
| Discovery Server                                            | 8761 | 2          | No        |
| Vets Microservice                                           | 8083 | 3          | No        |
| Visits Microservice                                         | 8082 | 3          | No        |
| Customers Microservice                                      | 8081 | 3          | No        |
| [Spring Boot Admin Server](http://localhost:9090)           | 9090 | 3          | Yes       |
| Config Checker                                              | 9091 | 3          | Yes       |
| Discovery Checker                                           | 9092 | 3          | Yes       |
| [Zipkin Tracing Server](http://localhost:9411)              | 9411 | 2          | Yes       |
| [Api Gateway Service (Petclinic UI)](http://localhost:8080) | 8080 | 4          | No        |

The boot order specified in the table above is important. The Config Server must start first, followed by the Discovery Server. The API Gateway contains the UI code, so generally it's advisable to start this service last. All the other services can be started in between. Applications with the same boot order in the table can be started together if desired. Applications marked as 'optional' in the table above are not required.

> NOTE: The Config Server and the Zipkin Server do NOT require or use the Discovery Server or any other microservices.

#### Visit The Local Petclinic

When all the applications have started, point your browser to [http://localhost:8080](http://localhost:8080) to visit the homepage of the Petclinic Microservices application. If all is well, visiting the 'Veterinarians' page will show a list of their names. 

> Notice how the API Gateway provides a dual function - hosting the UI and routing REST requests to vets, visits, and customers.


#### Running The Petclinic Microservices

To run the services, a handy `docker-compose` configuration has been provided in the file `docker-compose.yml`. This means that you can start all the applications using the command `docker-compose up`. 

```bash
docker-compose up
```

However, even though the `depends_on` has been specified, this will rarely work. Docker's concept of an application being "started" is not the same as an application being "ready" to accept traffic. The sample expects a specific boot-order to be respected and when it's not, the applications fast-fail (usually because the Config server is unavailable). See [https://docs.docker.com/compose/startup-order/](https://docs.docker.com/compose/startup-order/).

To work around this issue, use `docker-compose up` to configure everything and then simply restart the containers in the order stated in the "Start The Applications" section above. You may do this however you like. 

I use the excellent Portainer.io for Docker to do this. Installing Portainer is easy, just a few commands. see: [https://www.portainer.io/installation/](https://www.portainer.io/installation/). Below is a snippet:

```bash
docker volume create portainer_data
docker run -d -p 8000:8000 -p 9000:9000 --name=portainer --restart=always -v /var/run/docker.sock:/var/run docker.sock -v portainer_data:/data portainer/portainer-ce
```

With Portainer in your system, you can use its handy browser interface to control your Petclinic 'Stack'. You can start, stop, and restart containers easily and do other things like view their logs or connect with them over ssh.

Start the microservices one at a time in the right order, checking the logs or the `/actuator/health` endpoint to ensure the app is running before moving on to the next. You can also monitor the [Admin Server](http://localhost:9090) in your browser to check which applications have started and registered with the Discovery service.

#### Visit The Local Petclinic

When the Admin server shows that all the applications have started, point your browser to [http://localhost:8080](http://localhost:8080) to visit the homepage of the Petclinic Microservices application. If all is well, visiting the 'Veterinarians' page will show a list of their names. 

## Running The Petclinic Microservices on TAS

Running the Petclinic Microservices demo on Tanzu Application Service requires some reconfiguration, re-packaging and "pushing" of the applications to your preferred Org and Space.

#### Specify the Config Server Location For Each Application

When running on TAS, the Config Server is no longer hosted locally and won't be found automatically by the applications that need it. This means that in each application's `src/main/resources/bootstrap.yml`, you must change the `spring.cloud.config.uri` property for the `tas` profile to correctly identify the location of your `spring-petclinic-config-server` application. For example:

```yaml
---
spring:
  profiles: tas
  cloud:
    config:
      uri: http://<your-config-server-uri>
```

If the configuration server can't be found, the applications tend not to start successfully.

> The only applications that don't require this change are the Config Server and the Zipkin Server which isn't a Spring Boot application.

#### Specify the Discovery Server Location For All Applications

When running on TAS, the Discovery Server is no longer hosted locally and won't be found automatically. As this configuration is shared with all applications via the Config Server, you only have to make a single change and it will affect all the apps.

In the `application-tas.yml` file in your fork of the configuration repository, change the `eureka.client.serviceUrl.defaultZone` property in the `tas` profile to the location of your discovery server as follows:

```yaml
eureka:
  client:
    serviceUrl:
      defaultZone: http://<your-discovery-server-uri>/eureka
```

> If the apps are running, you should restart them so that they can pick up their new configuration.

#### [Optional] Specify the Zipkin Server Location For All Applications

When running on TAS, the Zipkin Server is no longer hosted locally and won't be found automatically. As this configuration is shared by all applications via the Config Server, you only have to make a single change.

In the `application-tas.yml` file in your fork of the configuration repository, change the `spring.zipkin.baseUrl` property in the `tas` profile to the location of your discovery server as follows:

```yaml
spring:
  profiles: tas
  zipkin:
    baseUrl: http://<your-zipkin-uri>:80
```

> If the apps are running, you should restart them so that they can pick up their new configuration.

#### Rebuild, Package, And "push" The Petclinic Microservices

To simplify this process bash scripts and manifests have been provided. It's recommended that you use these scripts, or at least make yourself familiar with their contents. These scripts are intended to automate the process of building and running the Petclinic Microservices on TAS. They scripts rely heavily on the `cf` command line tool. You must install the `cf` tool before proceeding.

> [Docs: Installing the CF Cli](https://github.com/cloudfoundry/cli/wiki/V6-CLI-Installation-Guide)

| Script                         | Purpose                                                                                               |
|:------------------------------ |:----------------------------------------------------------------------------------------------------- |
| build-and-deploy-all-to-tas.sh | Uses Maven Wrapper to build the code, then pushes each component to TAS using the Manifests provided. |
| restart-all-on-tas.sh          | Stops and starts all the applications in an orderly fashion.                                          |
| stop-all-on-tas.sh             | Stops all the Petclinic applications but does not delete them.                                        |
| delete-all-on-tas.sh           | Deletes all the applications from TAS.                                                                |

The manifest for each application tells TAS where to find the local code package bundle and which environment properties to set. The environment properties are important - they set the `SPRING_PROFILES_ACTIVE` to `tas`. This profile ensures that the correct configuration gets downloaded from the Config Server. Without this profile, the apps in TAS won't be correctly configured.

#### Visit The Petclinic On TAS

When all the applications have started, use the URL of the `spring-petclinic-api-gateway` application in your browser to visit the homepage of the Petclinic Microservices application. If all is well, visiting the 'Veterinarians' page will show a list of their names. If your unsure of the URL, use the `cf apps` command to obtain a list of all the running applications, their status, and their URL's.

## How Cloud Based Configuration Works

In your forked and cloned [configuration repository][Configuration repository] you'll notice the file `application-tas.yml`. When the `tas` profile is active, the configuration in this file is layered over the configuration in the `application.yml` and any application specific configuration is also added (such as `customers-service.yml` for example). It is the combination of these three files which ultimately provide the configuration used by the application at runtime. The following table clarifies what happens during the configuration process.

| Configuration File  | Location            | Description                                                                                           |
|:------------------- |:-------------------:|:----------------------------------------------------------------------------------------------------- |
| bootstrap.yml       | packaged in the JAR | Contains the application's given name and the location of the config server for each profile.         |
| application.yml     | configuration repo  | Common properties used by all the Spring Boot applications in the demo.                               |
| application-tas.yml | configuration repo  | Configuration overrides that should be used by all applications when running under the `tas` profile. |
| vets-service.yml    | configuration repo  | Configuration that is exclusive the the Vets microservice.                                            |

## In-Memory Petclinic Databases (Default In All Cases)

In its default configuration, the Petclinic applications use an in-memory database (HSQLDB). The database gets populated at startup with sample data, so the applications are ready to use.

## MySQL Petclinic Databases (Optional, In All Cases)

A similar setup is provided for MySql in case a persistent database configuration is needed.
Dependency for Connector/J, the MySQL JDBC driver is already included in the `pom.xml` files.

#### Start a MySql Database

You may start a MySql database with docker:

```
docker run -e MYSQL_ROOT_PASSWORD=petclinic -e MYSQL_DATABASE=petclinic -p 3306:3306 mysql:5.7.8
```

or download and install the MySQL database (e.g., MySQL Community Server 5.7 GA), which can be found here: https://dev.mysql.com/downloads/

#### Use the Spring 'mysql' profile

To use a MySQL database, you have to start 3 microservices (`visits-service`, `customers-service` and `vets-services`)
with the `mysql` Spring profile. Add the `--spring.profiles.active=mysql` as program argument.

By default, at startup, the database schema will be created and the sample data will be populated.
You may also manually create the PetClinic database and data by executing the `"db/mysql/{schema,data}.sql"` scripts of each 3 data driven microservices (vets, visits, and customers). In the `application.yml` of the [Configuration repository], set the `initialization-mode` to `never`.

If you are running the microservices with Docker, you have to add the `mysql` profile into the (Dockerfile)[docker/Dockerfile]:

```
ENV SPRING_PROFILES_ACTIVE docker,mysql
```

In the `mysql section` of the `application.yml` from the [Configuration repository], you have to change 
the host and port of your MySQL JDBC connection string. 

## The Original Spring Petclinic

The Spring Petclinic `main` branch in the main [spring-projects](https://github.com/spring-projects/spring-petclinic)
GitHub org is the "canonical" implementation, currently based on Spring Boot and Thymeleaf.

[Configuration repository]: https://github.com/benwilcock/spring-petclinic-microservices-config
