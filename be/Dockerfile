# docker build -t a3ammari/idealo-robot:latest .
FROM maven

RUN mkdir -p /build
WORKDIR /build

COPY . .

RUN mvn package

RUN mkdir -p /app
WORKDIR /app

RUN cp -R /build/target/*.jar .

ENTRYPOINT ["java","-jar","idealo-robot-1.0-SNAPSHOT.jar"]

