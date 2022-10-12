# Dockerfile
FROM openjdk:17-jdk-slim
ARG JAR_FILE=/home/runner/work/ke-poc/ke-poc/ke-poc-0.0.1-SNAPSHOT.jar
RUN pwd
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
#CMD ["java", "-jar", "ke-poc-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["./run.sh", "-Dspring.profiles.active=prod"]
#ENTRYPOINT ["java", "-jar -Dspring.profiles.active=prod"]
