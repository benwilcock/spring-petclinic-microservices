# Spring Petclinic Microservices Sample 

> Building these microservices requires Java 11 and Maven. I use the excellent [SDKMan](sdkman.io) to install these tools.

This microservices branch was initially derived from [spring-petclinic-microservices](https://github.com/spring-petclinic/spring-petclinic-microservices) which cleverly demonstrates how to split the [Spring Petclinic](https://github.com/spring-projects/spring-petclinic) sample application into [microservices](http://www.martinfowler.com/articles/microservices.html). To achieve that goal, spring-petclinic-microservices uses Spring Cloud API Gateway, Spring Cloud Config, and the Eureka Service Discovery from the [Spring Cloud Netflix](https://github.com/spring-cloud/spring-cloud-netflix) technology stack.

This sample in this fork takes the work done already and provides these additional features:-

* Updates the Petclinic Microservices sample code to use [Spring Boot 2.4.3](https://spring.io/projects/spring-boot#learn)
* Updates the Petclinic Microservices sample code to [Spring Cloud 2020.0.1](https://spring.io/projects/spring-cloud#learn)
* Allows for the Spring microservice Docker containers to be built using `spring-boot:build-image`.  
* Adds configuration to run containers on Docker using `docker-compose`
* Adds configuration to run on containers on Kubernetes using `kubectl` and K8s native discovery (e.g. without Spring Cloud Eureka)
* Introduces [spring-native](https://github.com/spring-projects-experimental/spring-native) to reduce some application startup times and memory footprint.

# Getting Started

Before running this Petclinic Microservices sample application for the first time, you must prepare the application configuration by following the steps below.

## Step 1: Clone The Sample Code

Clone the sample code to your machine using the following Git command:

```bash
> git clone git@github.com:benwilcock/spring-petclinic-microservices.git
```

Test that you can compile and package the microservices:

```bash
> cd spring-petclinic-microservices
> ./mvnw package
```

If the build is successful, you will see output like that shown below:

```bash
[INFO] Reactor Summary:
[INFO]
[INFO] spring-petclinic-microservices 2.4.3 ............... SUCCESS [  0.361 s]
[INFO] spring-petclinic-admin-server ...................... SUCCESS [  2.658 s]
[INFO] spring-petclinic-customers-service ................. SUCCESS [  4.990 s]
[INFO] spring-petclinic-vets-service ...................... SUCCESS [  4.365 s]
[INFO] spring-petclinic-visits-service .................... SUCCESS [  4.372 s]
[INFO] spring-petclinic-config-server ..................... SUCCESS [  4.464 s]
[INFO] spring-petclinic-discovery-server .................. SUCCESS [  1.067 s]
[INFO] spring-petclinic-api-gateway ....................... SUCCESS [ 58.462 s]
[INFO] spring-petclinic-discovery-checker ................. SUCCESS [  1.145 s]
[INFO] spring-petclinic-config-checker 2.4.3 .............. SUCCESS [  0.885 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 01:23 min
[INFO] Finished at: 2021-02-23T16:42:46Z
[INFO] ------------------------------------------------------------------------
```

## Step 2: (Optional) Build The Docker Container Images

If you prefer to use your own Docker images rather than the ones I've already created and uploaded to [Docker Hub](https://hub.docker.com/u/benwilcock), you must build them and push them to your Docker Hub library (or your preferred local Docker repository such as [Harbour](https://goharbor.io/)). The steps to perform are as follows.

Make sure the docker daemon is running in the background, that your docker system is working, and that you have logged in.

```bash
> docker run hello-world
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
> ./mvnw package -DskipTests=true spring-boot:build-image
```

This may take some time as Docker image downloads are required. When complete, Maven will report the build status as `BUILD SUCCESS` as shown in the earlier step. A call to `docker images` will confirm that you have a new set of ready built docker images, similar to those shown in the table below:

```bash
> docker images

REPOSITORY                                                TAG        IMAGE ID       CREATED         SIZE
your-library-name/spring-petclinic-discovery-server       2.4.3      12fe39c7ecd0   41 years ago    289MB
your-library-name/spring-petclinic-vets-service           2.4.3      65e273c1e81a   41 years ago    309MB
your-library-name/spring-petclinic-config-server          2.4.3      80744530a792   41 years ago    273MB
your-library-name/spring-petclinic-config-checker         2.4.3      dc3874ff468d   41 years ago    282MB
your-library-name/spring-petclinic-api-gateway            2.4.3      662559354fe7   41 years ago    295MB
your-library-name/spring-petclinic-admin-server           2.4.3      6665982ae691   41 years ago    294MB
your-library-name/spring-petclinic-discovery-checker      2.4.3      d5dfe2e8f742   41 years ago    288MB
your-library-name/spring-petclinic-config-server-native   2.4.3      154ee77e64ab   41 years ago    223MB
your-library-name/spring-petclinic-visits-service         2.4.3      ba5c9d1f7f2f   41 years ago    307MB
your-library-name/spring-petclinic-customers-service      2.4.3      6cb5dda7460e   41 years ago    307MB
```

Finally, push your images to [Docker Hub](https://hub.docker.com/) or your preferred docker image repository using the `docker push` command like the one shown in the example below:

```bash
> docker push your-library-name/spring-petclinic-discovery-server:2.4.3
```

## Step 3: Fork The Sample Configuration Code Repository

Spring Cloud Config Server is the source of most of the application configuration used by the microservices in this sample. It takes its configuration from a GitHub repository. In order to control the configuration being served by your Spring Cloud Config Server, you need to control the configuration code repository. You can acheive this by forking the configuration repository.

Fork the [https://github.com/benwilcock/spring-petclinic-microservices-config](https://github.com/benwilcock/spring-petclinic-microservices-config) to your GutHub user space using the 'Fork' button.

> When you make changes to the files in this repository, be sure to commit and push your changes back to your fork and restart any applications who's configuration has been modified by the changes you commit.

## Step 4: Choose Your Application Runtime Platform

The sample supports three runtimes. Follow the links provided to see the instructions required to run the sample for each supported runtime environment.

1. [Localy (on bare metal)](BAREMETAL.md)
1. [Docker](DOCKER.md) - using `docker-compose` and the provided YAML configuration file.
1. [Kubernetes](KUBERNETES.md) - using `kubectl` and the provided YAML configuration file.

Follow the instructions in the links above to bring up the Petclinic Microservices sample application in your preferred runtime environment.

## Step 5: Admire Your Work!

Once all the microservices have started, you can begin to use the Petclinic Microservices sample by navigating your browser to the addresses below and trying out the various links you find there. Spring Petclinic is a mock Veterinarian admin system. Spring Boot Admin talks to the Spring Cloud Discovery server and gathers information on the services it discovers. Zipkin allows you to search tracing information to see how services calls relate to each other. 

| Web Browser Address                                                   | Value                 | Notes       |
| --------------------------------------------------------------------- |:---------------------:|:----------- |
| [Spring Petclinic Microservices](http://localhost:8080)               | http://localhost:8080 | Spring Petclinic is a mock Veterinarian admin system. |
| [Spring Boot Admin Server](http://localhost:9090)                     | http://localhost:9090 | Talks to the Spring Cloud Discovery server and gathers information on the services it discovers |
| [Zipkin Tracing Server](http://localhost:9411)                        | http://localhost:9411 | Zipkin allows you to search tracing information to see how services calls relate to each other. |


## Screenshots

Here's a sample of what you can look forward to:-

#### Spring Petclinic Microservices

<img src="https://github.com/benwilcock/spring-petclinic-microservices/blob/master/img/petclinic-home.png?raw=true" width="200">
<img src="https://github.com/benwilcock/spring-petclinic-microservices/blob/master/img/petclinic-owners.png?raw=true" width="200">
<img src="https://github.com/benwilcock/spring-petclinic-microservices/blob/master/img/petclinic-owner-info.png?raw=true" width="200">
<img src="https://github.com/benwilcock/spring-petclinic-microservices/blob/master/img/petclinic-owner-change.png?raw=true" width="200">
<img src="https://github.com/benwilcock/spring-petclinic-microservices/blob/master/img/petclinic-vets.png?raw=true" width="200">

#### Spring Boot Admin Server Screenshots

<img src="https://github.com/benwilcock/spring-petclinic-microservices/blob/master/img/admin-server-services.png?raw=true" width="200">
<img src="https://github.com/benwilcock/spring-petclinic-microservices/blob/master/img/admin-server-wallboard.png?raw=true" width="200">
<img src="https://github.com/benwilcock/spring-petclinic-microservices/blob/master/img/admin-server-details.png?raw=true" width="200">

#### Docker (Portainer)

#### Kubernetes (Octant)
