from openjdk:11
EXPOSE 9092
ADD target/03.SB-OrderService-0.0.1.jar OrderService.jar
ENTRYPOINT ["java","-jar","/OrderService.jar"]