# Dockerfile
FROM openjdk:17-jdk-slim

COPY build/libs/hoony-codecommit-0.0.1-SNAPSHOT hoony-codecommit-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "hoony-codecommit-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["./run.sh", "-Dspring.profiles.active=prod"]
#ENTRYPOINT ["java", "-jar -Dspring.profiles.active=prod"]
