FROM openjdk:20
COPY target/MS1_funcionaporfa-0.0.1-SNAPSHOT.jar prueba.jar
CMD ["java", "-jar", "prueba.jar"]