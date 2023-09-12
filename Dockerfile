FROM openjdk:17-jdk-slim
EXPOSE 5460
ADD target/patients-api.jar patients-api.jar
ENTRYPOINT ["java","-jar","/patients-api.jar"]