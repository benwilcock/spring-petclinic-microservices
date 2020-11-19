#!/bin/sh

docker push benwilcock/spring-petclinic-config-server:2.3.6
docker push benwilcock/spring-petclinic-discovery-server:2.3.6
docker push benwilcock/spring-petclinic-admin-server:2.3.6
docker push benwilcock/spring-petclinic-vets-service:2.3.6
docker push benwilcock/spring-petclinic-visits-service:2.3.6
docker push benwilcock/spring-petclinic-customers-service:2.3.6
docker push benwilcock/spring-petclinic-api-gateway:2.3.6

echo 'done'
exit 0
