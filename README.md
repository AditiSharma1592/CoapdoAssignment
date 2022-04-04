## Fedex Assignment

This is a basic Java selenium cucumber framework for testing the registration for new user on  https://uk.tommy.com/. Tests are written in combination of selenium,
java, Cucumber, & Maven. Test scenarios that are covered are written in Feature files available in Features folder.

## Scenarios covered

I have covered the following positive and negative scenarios for registering new user:

1.Validating error Message if email and password is blank when registering new user.
2.Validating error message when email address is invalid when registering new user .
3.Validating error message when password is invalid when registering new user.
4.Validating error message when terms and conditions is not accepted by the user while registering.
5.Validating user is registered successfully when all valid data is given.
6.Validating user is able to add new address after registering. 


## FRAMEWORK DESIGN
* The scenarios are defined using gherkin language within the features folder.
* In the stepDefination package , steps for each feature step is defined
* In Pages package , separate file for each page is created to follow Page Object Model
* In testRunner package , test runner file is available which defines the run config for this project.

## ENVIRONMENT SETUP
* 
* java version "17.0.1,"

## DEPENDENCIES
* Cucumber 6.10.3
* selenium version 4.0.0-beta-3
* Junit 4.13.2
* Maven version 3.8.4


## How to run

* Can be run through test runner file
* mvn test 


## Reports
The test results will be saved here target/Test-output <date and time stamp>/Reports.html




