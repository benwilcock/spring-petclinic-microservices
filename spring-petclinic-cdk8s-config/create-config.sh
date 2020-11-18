#!/bin/sh

kubectl delete -f ./dist
mvn compile
cdk8s synth
kubectl apply -f ./dist
