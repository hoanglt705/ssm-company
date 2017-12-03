FROM tomcat:8.0.20-jre8
ENV CATALINA_HOME /usr/local/tomcat
COPY ssm-comapy.war $CATALINA_HOME/webapps
