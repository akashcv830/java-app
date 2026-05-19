FROM eclipse-temurin:17
WORKDIR /app
COPY target/java-app-1.0-SNAPSHOT.jar app.jar
CMD ["sh", "-c", "java -jar app.jar && tail -f /dev/null"]
