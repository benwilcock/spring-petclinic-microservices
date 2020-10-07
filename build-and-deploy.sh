#!/bin/sh

# Clean, build, and package the JARs
echo 'Building the code'
mvn clean package

echo 'pushing bens-discovery-server'
# Remove and push the
cd spring-petclinic-discovery-server
cf push -f manifest.yml
cd ..

#echo 'pushing bens-discovery-checker'
## Remove and push the
#cd discovery-checker
#cf push -f manifest.yml
#cd ..

echo 'pushing bens-config-server'
# Remove and push the
cd spring-petclinic-config-server
cf push -f manifest.yml
cd ..

#echo 'pushing bens-config-checker'
## Remove and push the
#cd config-checker
#cf push -f manifest.yml
#cd ..

#echo 'sleeping for 30s'
#sleep 30s
#
#echo 'testing...'
#http bens-discovery-checker.apps.tas.workload.tkglab.tanzu-demo.net/services
#http bens-config-checker.apps.tas.workload.tkglab.tanzu-demo.net/message

echo 'done'
exit 0
