#!/bin/sh

#./mvnw package -DskipTests=true spring-boot:build-image

# Now push to docker hub

docker push benwilcock/spring-petclinic-config-server:2.3.4
docker push benwilcock/spring-petclinic-discovery-server:2.3.4
docker push benwilcock/spring-petclinic-admin-server:2.3.4
docker push benwilcock/spring-petclinic-vets-service:2.3.4
docker push benwilcock/spring-petclinic-visits-service:2.3.4
docker push benwilcock/spring-petclinic-customers-service:2.3.4
docker push benwilcock/spring-petclinic-api-gateway:2.3.4

echo 'done'
exit 0
