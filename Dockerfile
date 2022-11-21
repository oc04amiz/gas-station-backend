FROM openjdk:8
EXPOSE 8080
ADD target/gas-station-backend.jar gas-station-backend.jar
ENTRYPOINT ["java","-jar","/gas-station-backend.jar"]