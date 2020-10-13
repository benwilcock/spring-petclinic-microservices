#!/bin/sh

echo "Stopping traffic & restarting the Config server first..."
cf stop bens-api-gateway-service &
cf restart bens-zipkin-server
cf restart bens-config-server
wait

echo "Restarting everything else in parrallel..."
cf restart bens-config-checker &
cf restart bens-discovery-server &
cf restart bens-admin-server &
cf restart bens-discovery-checker &
cf restart bens-customers-service &
cf restart bens-vets-service &
cf restart bens-visits-service
wait
cf start bens-api-gateway-service

echo 'Restarted everything. Sleeping for 30s so that the services can finish registering...'
sleep 30s

echo 'Testing the the discovery service registry...'
http bens-discovery-checker.apps.tas.tanzu-demo.net/services

echo 'Testing the Petclinic Homepage is responding...'
http bens-api-gateway-service.apps.tas.tanzu-demo.net

echo 'All done.'
exit 0
