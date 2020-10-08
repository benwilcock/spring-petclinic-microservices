#!/bin/sh

cf stop bens-config-checker
cf stop bens-discovery-checker
cf stop bens-admin-server
cf stop bens-discovery-server
cf stop bens-config-server

cf start bens-config-server
cf start bens-discovery-server
cf start bens-admin-server
cf start bens-config-checker
cf start bens-discovery-checker

echo 'done'
exit 0
