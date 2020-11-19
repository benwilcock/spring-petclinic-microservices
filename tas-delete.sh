#!/bin/sh

echo 'Attempting to DELETE all Petclinic apps in parrallel.'
cf delete bens-api-gateway-service -f &
cf delete bens-visits-service -f &
cf delete bens-customers-service -f &
cf delete bens-vets-service -f &
cf delete bens-discovery-checker -f &
cf delete bens-config-checker -f &
cf delete bens-zipkin-server -f &
cf delete bens-admin-server -f &
cf delete bens-discovery-server -f &
cf delete bens-config-server -f
wait
echo 'Finished.'
exit 0
