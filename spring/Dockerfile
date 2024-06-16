FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/spring-0.0.1-SNAPSHOT.jar /app/spring-h.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/spring-h.jar"]
