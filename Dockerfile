FROM adoptopenjdk/openjdk11:latest
ADD target/cn-recipe-app-0.0.1-SNAPSHOT.jar cn-recipe-app-0.0.1.jar
ENTRYPOINT ["java","-jar","/cn-recipe-app-0.0.1.jar"]