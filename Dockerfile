FROM eclipse-temurin:24-jdk

WORKDIR /app

COPY target/TaskManager-0.0.1-SNAPSHOT.jar /app/TaskManager-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "TaskManager-0.0.1-SNAPSHOT.jar"]