#!/bin/sh

mvn compile
cdk8s synth
echo "Done. Use 'kubectl apply -f dist/petclinic.k8s.yml' to start petclinic on your Kubernetes server in the 'default' namespace."
