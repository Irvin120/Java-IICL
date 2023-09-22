@echo off
call mvn clean package
call docker build -t gm.com.mx/hola-mundo-web .
call docker rm -f hola-mundo-web
call docker run -d -p 9080:9080 -p 9443:9443 --name hola-mundo-web gm.com.mx/hola-mundo-web