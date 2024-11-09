FROM openjdk:17-slim

RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY . .

RUN mvn clean package -DskipTests

ENTRYPOINT ["java", "-jar", "/app/target/ems-backend-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
