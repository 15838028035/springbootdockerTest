FROM adoptopenjdk/openjdk8-openj9:alpine-slim
VOLUME /tmp
ADD openj9dockertest-0.0.1-SNAPSHOT.jar openj9dockertest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","openj9dockertest-0.0.1-SNAPSHOT.jar"]
