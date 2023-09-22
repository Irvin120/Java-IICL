@echo off
call mvn clean package
call docker build -t mx.com.gm/ManejoParametros .
call docker rm -f ManejoParametros
call docker run -d -p 9080:9080 -p 9443:9443 --name ManejoParametros mx.com.gm/ManejoParametros