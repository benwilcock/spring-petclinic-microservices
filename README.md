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
