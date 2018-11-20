FROM Station

RUN apk --update add openjdk8-jre

RUN wget http://archive.apache.org/dist/maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.tar.gz && \
  tar -zxvf apache-maven-3.5.0-bin.tar.gz && \
  rm apache-maven-3.5.0-bin.tar.gz && \
  mv apache-maven-3.5.0 /usr/lib/mvn

VOLUME /tmp

ARG spring_profiles
ARG java_opts

ADD target/admin-0.0.1-SNAPSHOT.jar app.jar

ENV JAVA_OPTS=$java_opts
ENV SPRING_PROFILES_ACTIVE=$spring_profiles

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
