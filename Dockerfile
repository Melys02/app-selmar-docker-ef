FROM eclipse-temurin:21-jdk-alpine



#Crear directorio para la aplicacion
VOLUME /tmp

ARG JAR_FILE=target/app-selmar-docker-ef-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]