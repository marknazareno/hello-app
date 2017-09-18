# Hello App
A simple web application using Spring WebMVC.

The app features:
* use of Tomcat Maven Plugin to run a web application
* adding Swagger API Documentation to a Spring WebMVC (non-Spring Boot) application

To run the app, just cd to the hello-app directory and execute the following command
```bash
mvn -pl :hello-app-web -am tomcat7:run -DadditionalClasspathDir="config/dev"
```

To test, launch the following url on your browser: 

http://localhost:8080/swagger-ui.html