FROM frolvlad/alpine-oraclejdk8
MAINTAINER Kerem Kaynar
ENTRYPOINT ["/usr/lib/jvm/java-8-oracle/bin/java", "-jar", "/microservices/sregservice.jar"]
RUN mkdir /microservices
ARG JAR_FILE
COPY target/${JAR_FILE} /microservices/sregservice.jar