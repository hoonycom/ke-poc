# Dockerfile
FROM openjdk:17-jdk-slim
ARG JAR_FILE=build/libs/*.jar
RUN ls -al
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#CMD ["java", "-jar", "ke-poc-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["./run.sh", "-Dspring.profiles.active=prod"]
#ENTRYPOINT ["java", "-jar -Dspring.profiles.active=prod"]
