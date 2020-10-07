#!/bin/sh

echo 'deleting all apps.'
cf delete bens-discovery-server -f
cf delete bens-discovery-checker -f
cf delete bens-config-server -f
cf delete bens-config-checker -f
echo 'all apps deleted.'
exit 0
