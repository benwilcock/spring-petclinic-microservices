#!/bin/sh

# Native vvvv ------------------------------------------
docker push benwilcock/spring-petclinic-config-server-native:2.4.4
docker push benwilcock/spring-petclinic-config-checker-native:2.4.4
docker push benwilcock/spring-petclinic-vets-service-native:2.4.4
docker push benwilcock/spring-petclinic-visits-service-native:2.4.4
docker push benwilcock/spring-petclinic-customers-service-native:2.4.4

# Not Native vvvv ------------------------------------------
docker push benwilcock/spring-petclinic-config-server:2.4.4
docker push benwilcock/spring-petclinic-discovery-server:2.4.4
docker push benwilcock/spring-petclinic-admin-server:2.4.4
docker push benwilcock/spring-petclinic-api-gateway:2.4.4
docker push benwilcock/spring-petclinic-vets-service:2.4.4
docker push benwilcock/spring-petclinic-visits-service:2.4.4
docker push benwilcock/spring-petclinic-customers-service:2.4.4

echo 'done'
exit 0
