#!/bin/sh
mvn clean package && docker build -t gm.com.mx/HolaMundoJavaWeb .
docker rm -f HolaMundoJavaWeb || true && docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoJavaWeb gm.com.mx/HolaMundoJavaWeb