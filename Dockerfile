FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
# Give execute permission to mvnw
RUN chmod +x ./mvnw
RUN ./mvnw package -DskipTests
EXPOSE 8080
<<<<<<< HEAD
CMD ["java", "-jar", "target/weather-0.0.1-SNAPSHOT.jar"]
=======
CMD ["java", "-jar", "target/weather-0.0.1-SNAPSHOT.jar"]
>>>>>>> 633a0b8b8627ff9a1bd301920d7112708b0793dc
