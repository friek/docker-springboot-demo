FROM maven:3-jdk-8 as build
WORKDIR .
COPY . .
RUN mvn package

FROM openjdk:8-jre-alpine as run
RUN mkdir /app
WORKDIR /app
COPY --from=build target/dockerdemo-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
USER nobody
ENTRYPOINT java -jar dockerdemo-0.0.1-SNAPSHOT.jar