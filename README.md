# Spring Petclinic Microservices Sample for Tanzu Application Service (TAS)

> Building these microservices requires Java 11 and Maven. I use the excellent [SDKMan](sdkman.io) to install these tools.

This microservices branch was initially derived from [spring-petclinic-microservices](https://github.com/spring-petclinic/spring-petclinic-microservices) to demonstrate how to split sample Spring application into [microservices](http://www.martinfowler.com/articles/microservices.html). To achieve that goal we use Spring Cloud API Gateway, Spring Cloud Config, Spring Cloud Sleuth, and the Eureka Service Discovery from the [Spring Cloud Netflix](https://github.com/spring-cloud/spring-cloud-netflix) technology stack.

Decide if you want to run locally on your PC (bare or Docker) or remotely on [Tanzu Application Service](https://tanzu.vmware.com/application-service) and then follow the relevant instructions below.

## In All Cases: Configure The Config Server

The Config Server is the source of most of the configuration properties used in this Petclinic Microservices demo. 

Step one is to get a copy of the configuration files that you can modify. To do this you must fork the configuration repository at [https://github.com/benwilcock/spring-petclinic-microservices-config](https://github.com/benwilcock/spring-petclinic-microservices-config). 

To tell your Config Server to use _your_ forked configuration, change the `spring.cloud.config.server.git.uri` property in the `bootstrap.yml` file located in the `src/main/resources` folder of the `spring-petclinic-config-server`. Change this setting to use the URI of your forked configuration repository, for example: `https://github.com/<your-github-username>/spring-petclinic-microservices-config`

> When you make changes to the files in this repository, be sure to commit and push your changes back to your fork and restart any applications who's configuration has been modified.

Because the config server is the primary location for all the application config, you'll notice that the Spring Boot applications themselves have exceptionally light configuration files within their `src/main/resources` folders. Generally, only a `bootstrap.yml` file has been provided, and its configuration limited to the application name property, and the location of the config server for each possible Spring profile. 

For example, if you examine the Discovery Server's `src/main/resources/bootstrap.yml` file, you'll see only the following items:

```yaml
spring:
  application:
    name: discovery-server
  cloud:
    config:
      uri: http://localhost:8888

---
spring:
  profiles: tas
  cloud:
    config:
      uri: http://bens-config-server.apps.tas.tanzu-demo.net
```

In this example, the config server uri is expected to be hosted locally at `http://localhost:8888`, but when the `tas` profile is active, the config server is expected to be hosted remotely at `http://bens-config-server.apps.tas.tanzu-demo.net`. 

> NOTE: When running locally, no change to this configuration is required - the default setting of http://localhost:8888 should work if the Config Server is running on the correct port. When running on TAS a small change to this configuration is required and is detailed later in the 'Running The Petclinic Microservices on TAS' instructions.

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

#### [Optional] Run The Config Server Locally Using A Clone Of The Configuration Repository

A `native` profile exists which allows you to set the local filesystem as the location of the configuration repository. This means that you don't have to rely on GitHub being available or files being pushed when testing. You can activate and control the location of the configuration folder with the following VM options. Use these options when starting the config server:

```
-Dspring.profiles.active=native
-DGIT_REPO=/<path-to-forked-and-cloned-folder-location>/spring-petclinic-microservices-config
```

#### Visit The Local Petclinic

When all the applications have started, point your browser to [http://localhost:8080](http://localhost:8080) to visit the homepage of the Petclinic Microservices application. If all is well, visiting the 'Veterinarians' page will show a list of their names. 

> Notice how the API Gateway provides a dual function - hosting the UI and routing REST requests to vets, visits, and customers.

## Running The Petclinic Microservices on Docker

Running this sample on Docker works well, but you need to build docker images, and be prepared to get your hands dirty in order to control the start order of the applications in Docker.

> Note: A `docker` profile has been added to control the configuration in this mode.

#### Build The Petclinic Microservice Docker Images

Before building the Docker images, set the property `docker.library.name` in the `properties` section of the `pom.xml` file. By default, this is set to `benwilcock`.

Spring Boot's Maven plugin can build your images for you, you just need to have the Docker demon running in the background. To start the build process, run the following command in the project root folder.

```bash
./mvnw package -DskipTests=true spring-boot:build-image
```

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
