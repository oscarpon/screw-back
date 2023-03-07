FROM openjdk:17.0.2
VOLUME /tmp
ADD .target/screw-0.0.1-SNAPSHOT.jar backend.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "backend.jar"]
