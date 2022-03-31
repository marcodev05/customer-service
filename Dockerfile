FROM openjdk:8-alpine
EXPOSE 8081
ADD target/customer-service.jar customer-service.jar
ENTREPOINT ["java","-jar","/customer-service.jar"]

