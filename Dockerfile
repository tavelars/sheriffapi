FROM openjdk:8-jdk-alpine
MAINTAINER com.cloud.sheriff
COPY target/sheriffapi-1.0.0.jar sheriffapi-1.0.0.jar
ENTRYPOINT ["java","-jar","/sheriffapi-1.0.0.jar"]