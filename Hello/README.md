# Hello World!

## 1. Pure-Java
```Bash:
$ cd 1_Pure-Java
$ javac hello.java
$ java Hello
```

## 2. Gradle
```Bash:
cd 2_Gradle
gradle init
gradle run
```

## 3. IntelliJ
```Bash:
cd 3_IntelliJ
./gradlew build
./gradlew run
```
or
```Bash:
cd 3_IntelliJ
gradle build
gradle run
```

## 4. Spring Boot
```Bash:
cd 4_Spring-Boot
./gradlew bootRun
```

## 5. Web
```Bash:
cd 5_Web
./gradlew bootRun &
start http://localhost:8080/hello
start http://localhost:8080//hello?name=Amy
kill %1
```
or
```Bash:
cd 5_Web
./gradlew bootRun &
curl http://localhost:8080/hello
curl http://localhost:8080/hello?name=Amy
kill %1
```

## 関連記事
* [Java + Gradle + IntelliJ + SpringbootでHello World!](https://qiita.com/tomtkg/items/89b9c65929215cdd5a10)