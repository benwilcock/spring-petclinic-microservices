# Spring-Petclinic-Microservices

A version of [spring-petclinic-microservices](https://github.com/spring-petclinic/spring-petclinic-microservices) using Spring Native Microservices (where possible).

## Native Demo

Native images are built using the 'buildpacks' technique bundled as part of the Spring Boot Maven Plugin. As part of the build process, the buildpack will download GraalVM CE and use it to produce a native executable which is then bundled into a Docker image. 

> Note: The build process Requires Docker, Docker Daemon, and Docker Compose

```bash
./mvnw clean package -P native-image spring-boot:build-image
```

To run...

```bash
docker-compose -f docker-compose.yml
```

Note: Discovery Server and API Gateway are not native (yet)

## Regular (non-native) Demo

```bash
./mvnw clean package spring-boot:build-image
```

To run...

```bash
docker-compose -f docker-compose-regular.yml
```

## Testing Your Build

* All services depend on Config server in order to start. 
* Some services may need to be re-started after Docker-compose (try Portainer.io if you prefer a dash)
* API Gateway needas all services to be available and registered in discovery-server
* Services need time to register with discovery-server, so patience required
* Petclinic UI will be at http://localhost:8080

> When testing, check that you can browse the Vets, create and update Customers, and create and update Visits by Pets.

## Issues

* Builds aren't fully reproducible at the moment.
* Customers, Vets, and Visits crash with errors (although working builds have been possible in the past).


