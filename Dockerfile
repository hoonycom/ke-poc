# Dockerfile
FROM openjdk:17-jdk-slim
COPY build/libs/ke-poc-0.0.1-SNAPSHOT.jar ke-poc-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "ke-poc-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["./run.sh", "-Dspring.profiles.active=prod"]
#ENTRYPOINT ["java", "-jar -Dspring.profiles.active=prod"]
