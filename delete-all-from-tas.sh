#!/bin/sh

echo 'deleting all apps.'
cf delete bens-api-gateway-service -f
cf delete bens-visits-service -f
cf delete bens-customers-service -f
cf delete bens-vets-service -f
cf delete bens-admin-server -f
cf delete bens-discovery-server -f
cf delete bens-discovery-checker -f
cf delete bens-config-server -f
cf delete bens-config-checker -f
echo 'all apps deleted.'
exit 0
