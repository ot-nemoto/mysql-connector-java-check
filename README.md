# mysql-connector-java-check

## Make a project

```sh
mvn archetype:generate \
    -DgroupId=jp.co.opentone \
    -DartifactId=mysql-connector-java-check \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false
```

## Build

```sh
mvn clean package
```

## Run

```sh
java -jar target/mysql-connector-java-check-1.0-SNAPSHOT.jar
# java -cp target/mysql-connector-java-check-1.0-SNAPSHOT.jar jp.co.opentone.App
```
