FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y wget unzip

RUN wget https://services.gradle.org/distributions/gradle-7.5.1-bin.zip -P /tmp
RUN unzip -d /opt/gradle /tmp/gradle-7.5.1-bin.zip
ENV GRADLE_HOME /opt/gradle/gradle-7.5.1
ENV PATH ${GRADLE_HOME}/bin:${PATH}

WORKDIR /app

COPY gradle /app/gradle
COPY gradlew /app/gradlew
COPY build.gradle /app/
COPY settings.gradle /app/
COPY src /app/src

RUN ./gradlew clean build -x test

COPY build/libs/spring-0.0.1-SNAPSHOT.jar /app/spring-h.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/spring-h.jar"]
