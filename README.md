# collinson-group-qa-technical-test
====================================
This project has two maven modules:

* apiautomation
* vendingmachine

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [RunTestsFromTerminal](#RunTestsFromTerminal)
* [Contacts](#contacts)

## General info

This project is [collinsongroup](https://www.collinsongroup.com/) technical QA test.

## Technologies
Project is created with:

* Java
* Maven
* Cucumber
* Rest Assured
* AssertJ

## Setup

Note: When you specify clean, you make sure that Maven is going to remove old output before it compiles and packages an application.

```
$ mvn clean install -DskipTests=true
```
### RunTestsFromTerminal

> Run all tests and fail at the end.
 >> Run using Maven
```
$ mvn clean install -fn
```
> Run API tests against specifc environment
```
$ mvn -Dtest.env=prod clean install -fn
````

(or)

> If you are using Make

```
$ make test-all
```

## :postbox: Contacts

Owner: [marya.induri@gmail.com](marya.induri@gmail.com)