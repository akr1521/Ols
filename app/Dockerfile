FROM openjdk:8
LABEL maintainer ="Akash Roy"
COPY . /src
ADD target/app-0.0.1-SNAPSHOT.jar app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java" ,"-jar", "app-0.0.1-SNAPSHOT"]