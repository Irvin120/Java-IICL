#!/bin/sh
mvn clean package && docker build -t mx.com.gm/ManejoParametros .
docker rm -f ManejoParametros || true && docker run -d -p 9080:9080 -p 9443:9443 --name ManejoParametros mx.com.gm/ManejoParametros