![](https://github.com/aimer-ai/restful-api-demo/workflows/Test/badge.svg)

# Deme of RESTful API

Java version: 11.0.1

gradle version: 6.0.1

gradle wrapper: `gradle wrapper --gradle-version 6.0.1`


#### Run Test

`./gradlew test`

Check test report under `./build/reports/tests/test/index.html`


#### Heartbeat

`curl localhost:8080/heartbeat`

### A web service build by spring MVC

#### run through gradlew
`./graglew bootRun` 

#### run through jar

**Build jar**

`./gradlew build`

Build result under `./build/libs/`


**Application Run**

Run `java -jar ./build/libs/restful-api-demo-1.0-SNAPSHOT.jar`


#### Check web service
visit `localhost:8080`

click here to redirect to `localhost:8080/greeting`
