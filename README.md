# mysql-connector-java-check

## Make a project

```sh
mvn archetype:generate \
    -DgroupId=jp.co.opentone \
    -DartifactId=mysql-connector-java-check \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false
```

## Config

_src/main/resources/jdbc.properties_

```properties
# e.g.)
jdbc.url=jdbc:mysql://<HOST>:<PORT>/<DATABASE>?useSSL=false&serverTimezone=Asia/Tokyo&useUnicode=true&characterEncoding=utf8
jdbc.username=<USER>
jdbc.password=<PASS>
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

## Test

```sh
mvn test
```