# docker build -t a3ammari/idealo-robot:latest .
# docker run -e SERVICE_HTTP_PORT=80 -p 8080:80 -ti a3ammari/idealo-robot

FROM maven

RUN mkdir -p /build
WORKDIR /build

COPY . .

RUN mvn package

RUN mkdir -p /app
WORKDIR /app

RUN cp -R /build/target/*.jar .

ENTRYPOINT ["java","-jar","idealo-robot-1.0-SNAPSHOT.jar"]

