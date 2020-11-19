#!/bin/sh

echo 'Attempting to STOP all Petclinic apps in parrallel.'
cf stop bens-api-gateway-service &
cf stop bens-visits-service &
cf stop bens-customers-service &
cf stop bens-vets-service &
cf stop bens-discovery-checker &
cf stop bens-config-checker &
cf stop bens-admin-server &
cf stop bens-discovery-server &
cf stop bens-zipkin-server &
cf stop bens-config-server
wait
echo 'Finished.'
exit 0
