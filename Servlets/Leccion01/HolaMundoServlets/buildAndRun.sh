#!/bin/sh
mvn clean package && docker build -t mx.com.gm/HolaMundoServlets .
docker rm -f HolaMundoServlets || true && docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoServlets mx.com.gm/HolaMundoServlets