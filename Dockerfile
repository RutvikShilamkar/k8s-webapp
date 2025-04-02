FROM openjdk:17
WORKDIR appcontainer
COPY /target/k8s-webapp.jar /appcontainer/k8s-webapp.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "/appcontainer/k8s-webapp.jar", "--server.address=0.0.0.0"]