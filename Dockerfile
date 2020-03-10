FROM openjdk:8-alpine
COPY target/spring-docker-kube-0.0.1-SNAPSHOT.jar /opt/lib/
EXPOSE 8080
CMD ["java","-jar","/opt/lib/spring-docker-kube-0.0.1-SNAPSHOT.jar"]