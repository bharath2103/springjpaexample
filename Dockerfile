FROM openjdk:8
VOLUME /tmp
ADD target/sampleaws-0.0.1-SNAPSHOT.jar sampleaws-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","sampleaws-0.0.1-SNAPSHOT.jar"]