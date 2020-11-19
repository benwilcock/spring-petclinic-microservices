#!/bin/sh

# Stop everything
sh tas-stop.sh

echo 'pushing bens-zipkin-server'
cd spring-petclinic-zipkin-server
cf push -f manifest.yml
cd ..

echo 'pushing bens-config-server'
cd spring-petclinic-config-server
cf push -f manifest.yml
cd ..

echo 'pushing bens-discovery-server'
cd spring-petclinic-discovery-server
cf push -f manifest.yml
cd ..

echo 'pushing bens-admin-server'
cd spring-petclinic-admin-server
cf push -f manifest.yml
cd ..

echo 'pushing bens-config-checker'
cd spring-petclinic-config-checker
cf push -f manifest.yml
cd ..

echo 'pushing bens-discovery-checker'
cd spring-petclinic-discovery-checker
cf push -f manifest.yml
cd ..

echo 'pushing bens-customers-service'
cd spring-petclinic-customers-service
cf push -f manifest.yml
cd ..

echo 'pushing bens-vets-service'
cd spring-petclinic-vets-service
cf push -f manifest.yml
cd ..

echo 'pushing bens-visits-service'
cd spring-petclinic-visits-service
cf push -f manifest.yml
cd ..

echo 'pushing bens-api-gateway-service'
cd spring-petclinic-api-gateway
cf push -f manifest.yml
cd ..

echo 'Sleeping for 30s so that services can finish registering...'
sleep 30s

echo 'Testing the Petclinic Homepage is responding...'
http bens-api-gateway-service.tas.tanzu-demo.net

echo 'done'
exit 0
