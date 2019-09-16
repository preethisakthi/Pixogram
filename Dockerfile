FROM java:8
EXPOSE 8080
ADD pixo-server.jar server.jar
ENTRYPOINT ["java","jar","pixo-server.jar"]