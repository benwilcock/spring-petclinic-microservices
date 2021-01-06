#!/bin/sh

docker push benwilcock/spring-petclinic-config-server:2.4.1
docker push benwilcock/spring-petclinic-config-server-native:2.4.1
docker push benwilcock/spring-petclinic-discovery-server:2.4.1
docker push benwilcock/spring-petclinic-admin-server:2.4.1
docker push benwilcock/spring-petclinic-vets-service:2.4.1
docker push benwilcock/spring-petclinic-visits-service:2.4.1
docker push benwilcock/spring-petclinic-customers-service:2.4.1
docker push benwilcock/spring-petclinic-api-gateway:2.4.1

echo 'done'
exit 0
