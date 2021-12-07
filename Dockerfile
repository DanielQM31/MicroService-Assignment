FROM openjdk:11
COPY "./target/assignment-0.0.1-SNAPSHOT.jar" "assignment-0.0.1-SNAPSHOT.jar"
EXPOSE 8013
ENTRYPOINT ["java","-jar","assignment-0.0.1-SNAPSHOT.jar"]