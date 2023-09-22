@echo off
call mvn clean package
call docker build -t gm.com.mx/HolaMundoJavaWeb .
call docker rm -f HolaMundoJavaWeb
call docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoJavaWeb gm.com.mx/HolaMundoJavaWeb