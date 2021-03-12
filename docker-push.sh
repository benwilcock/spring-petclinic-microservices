#!/bin/sh

docker push benwilcock/spring-petclinic-config-server:2.4.3
docker push benwilcock/spring-petclinic-config-server-native:2.4.3
docker push benwilcock/spring-petclinic-config-checker-native:2.4.3

docker push benwilcock/spring-petclinic-discovery-server:2.4.3
docker push benwilcock/spring-petclinic-discovery-checker:2.4.3
docker push benwilcock/spring-petclinic-discovery-checker-native:2.4.3

docker push benwilcock/spring-petclinic-admin-server:2.4.3
docker push benwilcock/spring-petclinic-admin-server-k8s:2.4.3

docker push benwilcock/spring-petclinic-vets-service:2.4.3
docker push benwilcock/spring-petclinic-visits-service:2.4.3
docker push benwilcock/spring-petclinic-customers-service:2.4.3
docker push benwilcock/spring-petclinic-api-gateway:2.4.3

echo 'done'
exit 0
