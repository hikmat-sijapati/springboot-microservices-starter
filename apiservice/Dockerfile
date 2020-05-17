FROM openjdk:8-jre-alpine
ARG SERVICE_NAME=apiservice
ENV APP_FILE ${SERVICE_NAME}-0.0.1-SNAPSHOT.jar
ENV APP_HOME /app
COPY /target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]