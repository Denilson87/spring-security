FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y

FROM openjdk:17-jdk-slim

ADD target/patients-api.jar patients-api.jar
ENTRYPOINT ["java","-jar","/patients-api.jar"]
EXPOSE 8080
