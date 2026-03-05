FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
# Give execute permission to mvnw
RUN chmod +x ./mvnw
RUN ./mvnw package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/weather-0.0.1-SNAPSHOT.jar"]
