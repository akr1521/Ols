FROM openjdk:20-jdk
LABEL maintainer ="Akash Roy"
WORKDIR /src
ENV SPRING_DATA_MONGODB_HOST=mongo
ENV SPRING_DATA_MONGODB_PORT=27017
COPY . /src
ADD target/app-0.0.1-SNAPSHOT.jar app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java" ,"-jar", "app-0.0.1-SNAPSHOT.jar"]