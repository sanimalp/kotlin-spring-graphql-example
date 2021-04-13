# kotlin-spring-graphql-example
A quick repo using kotlin and GQL for to expose an endpoint via graphql.

The schema is basic and the endpoint is hardcoded to respond with a fixed
result.

This project uses the great com.graphql-java-kickstart:graphql-spring-boot-starter project. 

**To build this:**

`./gradlew build`

**To run this:** 

`./gradlew bootRun`

**To hit the enpoint, use the curl:** 

```
curl --request POST \
  --url http://localhost:9090/graphql \
  --header 'Content-Type: application/json' \
  --data '{"query":"{\n  racetrack(countryCode:\"usa\"){\n    name\n    countryCode\n    lapRecord\n    length\n  }\n}"}'
```
