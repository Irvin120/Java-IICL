#!/bin/sh
mvn clean package && docker build -t gm.com.mx/hola-mundo-web .
docker rm -f hola-mundo-web || true && docker run -d -p 9080:9080 -p 9443:9443 --name hola-mundo-web gm.com.mx/hola-mundo-web