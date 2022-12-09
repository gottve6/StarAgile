from openjdk:11
EXPOSE 9091
ADD target/eureka-server-0.0.1-SNAPSHOT.jar eureka-service.jar
ENTRYPOINT ["java","-jar","/eureka-service.jar"]