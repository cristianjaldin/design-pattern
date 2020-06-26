# Multi stage build

FROM maven:3.5-alpine as builder 

COPY . /design-pattern

RUN cd /design-pattern && mvn package

FROM openjdk:8-alpine

COPY --from=builder /design-pattern/target/design-pattern-0.0.1-SNAPSHOT.jar /opt/patrones.jar

CMD java -jar /opt/patrones.jar
