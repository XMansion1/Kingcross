FROM java:8
VOLUME /tmp
ADD Kingcross-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9091 5005
CMD java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,suspend=n,address=5005 -jar app.jar