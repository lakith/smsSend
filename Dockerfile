FROM openjdk:8-jre-alpine

ADD target/demo2sms-0.0.1-SNAPSHOT.jar demo2sms-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","demo2sms-0.0.1-SNAPSHOT.jar"]
