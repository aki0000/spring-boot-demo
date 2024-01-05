# spring-boot-demo

This application is for beginer with Spring Boot. It shows employees list on the web applocation.

## How to run

### Run a demo application

After you run the app, you can access to localhost:9001.

``` shell
mvn spring-boot:run
```

### Run Unit Test

You can run Unit Test on the app.

``` shell
mvn test
```

### Run Unit Test and SAST

You can run Unit Test and SAST by Sonarqube if you already setup Sonarqube on your local environment.

``` shell
mvn test jacoco:prepare-agent jacoco:report sonar:sonar -Dsonar.host.url=<Sonarqube Host>:<Sonarqube Port>-Dsonar.token=<Sonarqube Token>
```
