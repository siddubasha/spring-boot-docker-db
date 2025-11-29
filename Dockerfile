# stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
RUN git clone https://github.com/siddubasha/spring-boot-docker-db.git
WORKDIR /app/spring-boot-docker-db
RUN mvn clean package -DskipTests


#stage 2: Run the application
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/spring-boot-docker-db/target/hello-docker-db.jar /app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]

