@echo off
call mvn clean package
call docker build -t mx.com.gm/HolaMundoServlets .
call docker rm -f HolaMundoServlets
call docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoServlets mx.com.gm/HolaMundoServlets