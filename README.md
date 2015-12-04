# About

This archetype generates a REST service project based on Maven. The service is capable of CRUD and query operations over a particular domain object.

The Maven project structure which it generates for a hypothetical `moo-user` service is:

    moo-user/pom.xml
    moo-user/moo-user-client/pom.xml
    moo-user/moo-user-domain/pom.xml
    moo-user/moo-user-service/pom.xml

The packages and code it generates within those modules is also appropriately named according to the inputs given to the `mvn archetype:generate` goal.

The code which it generates is minimal as it is based on the abstractions inside the [`jersey-rest-service`](https://github.com/edinhodzic/jersey-rest-service) library.

[![Build Status](https://travis-ci.org/edinhodzic/jersey-rest-service-archetype.svg?branch=master)](https://travis-ci.org/edinhodzic/jersey-rest-service-archetype)

# What's under the hood?

- [Maven archetype plugin](http://maven.apache.org/archetype/maven-archetype-plugin/)

# Quick start usage

This shouldn't even take a couple of minutes. Suppose we were implementing a user REST service.

## Step 1 - create a REST web service project

We begin generating the project by specifying an archetype to use:

    mvn archetype:generate \
    -DarchetypeGroupId=com.edinhodzic.archetype \
    -DarchetypeArtifactId=jersey-rest-service-archetype \
    -DarchetypeVersion=0.1.0-SNAPSHOT \

Furthermore, we then provide details about the new project/service which we are generating:

    -DgroupId=com.somecompany.service \
    -DartifactId=moo-user \
    -Dversion=0.1.0-SNAPSHOT \
    -DpackageDomain=user \
    -DdomainObject=User \

That creates a project in a `moo-user` directory.

## <a name="step2-start-the-service"></a>Step 2 - start the service

The aforementioned `dods-user` directory is the top level Maven project for this service. It contains three modules; domain, client and server. From the server module we can invoke a Maven command to start the service up locally.

    cd moo-user/moo-user-service/
    mvn spring-boot:run

The above will invoke the `main` function in the `com.somecompany.service.user.config.SomecompanyUserRestService` class and the service should be available at `http://localhost:9001/user`.

## Step 3 - do stuff with the service

Please see the [`jersey-rest-service`](https://github.com/edinhodzic/jersey-rest-service) documentation for details on the REST conventions and CRUD and query operations which you can now perform on this newly built service.

# Configuration

Configuration is in [YAML](http://www.yaml.org/spec/1.2/spec.html). Environment specific configuration is also available. The following list of files which are included by this archetype, should already be familiar and self explanatory.
 
     application.yml
     application-development.yml
     application-integration.yml
     application-test.yml
     application-production.yml

To use an environment specific configuration for instance the development configuration, supply a `-Dspring.profiles.active=development` on startup.

# What's next?

Actually implement the above :)