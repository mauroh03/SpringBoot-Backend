# SPRING-BOOT
Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".

This project is a base backend app based on spring boot microservices.

### Tech

I also use anothers open source projects to make this backedn work properly:

* [swagger-ui] - to visualize and interact with the API resources without having any of the implementation logic in place.
* [mockito] - mocking framework for unit testing
* [spring tool suite] - best IDE for spring projects

### How to start
* i hope you have JAVA installed if you don't. [install JAVA]
* [install maven]

**just run:**
```sh
$ mvn clean install
$ java -jar project-starter/target/project-starter-*-SNAPSHOT.jar
```
and open: http://localhost:8083/backend/swagger-ui.html

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [spring-boot]: <http://spring.io/projects/spring-boot>
   [swagger-ui]: <https://swagger.io/tools/swagger-ui/>
   [mockito]: <https://site.mockito.org>
   [spring tool suite]: <https://spring.io/tools>
   [install maven]: <https://maven.apache.org/install.html>
   [install JAVA]: https://www.java.com/es/download/
