FROM openjdk:17-jdk-alpine
ARG JAR_FILE=C:\Users\AYUSH\.m2\repository\com\nunc\fs\0.0.1-SNAPSHOT\*.jar
COPY ./target/fs-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java","-jar","/app.jar" ]