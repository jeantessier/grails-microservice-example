# grails-microservice-example

An [InfoQ article](http://www.infoq.com/articles/Ratpack-and-Spring-Boot) was showing how to build a microservice in Java with [Ratpack](http://ratpack.io/) and [Spring Boot](http://projects.spring.io/spring-boot/).

I was surprised at how much boilerplate there was. The Gradle project file, the entity file with all the Hibernate annotations, and the Main class with all the crazy, custom, manual routing.

I was able to recreate it all just by creating an empty Grails 3 project and adding a single domain object that is much, much shorter. It duplicates the Ratpack app completely, down to using H2 for its in-memory database.

## Running the microservice

After you clone the repository, install Grails 3.  From the project's top folder, run `grails run-app`.

## Accessing the microservice

List users with:

    curl http://localhost:8080/users/

Create a user with:

    curl \
        -X POST \
        -H 'Content-Type: application/json' \
        http://localhost:8080/users/ \
        -d '{"username": "Jean Tessier", "email": "jean@jeantessier.com"}'

Show a user with:

    curl http://localhost:8080/users/1

Update a user with:

    curl \
        -X POST \
        -H 'Content-Type: application/json' \
        http://localhost:8080/users/1 \
        -d '{"email": "info@sanmateokendo.org"}'

Delete a user with:

    curl \
        -X DELETE \
        -H 'Content-Type: application/json' \
        http://localhost:8080/users/1
