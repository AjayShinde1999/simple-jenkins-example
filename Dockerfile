FROM openjdk:11

EXPOSE 8080

ADD target/simple-jenkins-example.jar simple-jenkins-example.jar

ENTRYPOINT ["java","-jar","simple-jenkins-example.jar"]