FROM openjdk:11-slim
EXPOSE 8080
ARG JAR_FILE=build/libs/toy-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]