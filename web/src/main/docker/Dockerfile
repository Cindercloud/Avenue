FROM openjdk:8-jre-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS

# add directly the war
ADD avenue.jar /avenue/avenue.jar
ADD application.yml /avenue/application.yml

EXPOSE 8083
CMD java -Dspring.config.location=/avenue/ -Djava.security.egd=file:/dev/./urandom -jar /avenue/avenue.jar
