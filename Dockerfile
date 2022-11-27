FROM openjdk:17-oracle
ARG JAR_FILE=build/libs/*SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
CMD ["java","-jar","/app.jar"]