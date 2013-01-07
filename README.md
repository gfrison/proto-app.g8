Proto App
=========

This is an archetype of any Java or Groovy standalone application based on Springframework and Gradle.

You can generate your customized project through g8. Install g8 running these commands:

    curl https://raw.github.com/n8han/conscript/master/setup.sh | sh

then:

    cs n8han/giter8

Installation
------------

    g8 gfrison/proto-app
    
    
Gradle
------

Dependencies and build management is delegated to Gradle

If you want to run it simply type: `gradle run`. Other tasks:

* compile java -- `gradle compileJava` 

* compile groovy -- `gradle compileGroovy` 

* test -- `gradle test` 

* run -- `gradle run`

* create launch script  -- `gradle installApp`

* create distribution (zip)   -- `gradle distZip` it creates a zip file according to the build.gradle's projectName and version


Spring
------

The project makes use of Springframework through the [Grails based DSL](https://github.com/gfrison/proto-app/blob/master/src/main/resources/conf/beans.groovy).

It's a very concise way to handle Spring configuration. For more information (http://www.grails.org/doc/latest/guide/spring.html#springdsl).

  
Eclipse
-------

In order to get the project dependencies in Eclipse just prompt `gradle eclipse` 


Environments
------------

It's possibile to customize configuration for any given environment such as development, integration, 
production (or whatever you want to define).

Add the folder `src/main/resources/conf/{environment name}/`.

Then set the proper environment's placeholer `config.properties` and `log4j.xml`.

In the deployment environment you have to set the 'APP_OPTS' system variable ex:

`export APP_OPTS="-Denvironment=<development/integration/production>"`






