FROM adoptopenjdk/openjdk8-openj9:alpine-slim
VOLUME /tmp
ADD openJ9DockerTest-0.0.1-SNAPSHOT.jar openJ9DockerTest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","openJ9DockerTest-0.0.1-SNAPSHOT.jar"]
