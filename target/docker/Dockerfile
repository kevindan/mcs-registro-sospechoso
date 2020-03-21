FROM openjdk:8-jdk-alpine
MAINTAINER arquitectura_innovacion@minsa.gob.pe
ADD mcs-registro-sospechoso-0.0.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
