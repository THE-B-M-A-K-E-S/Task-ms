FROM openjdk:17
EXPOSE 8083
ADD target/task-ms.jar task-ms.jar
ENTRYPOINT ["java", "-jar", "task-ms.jar"]