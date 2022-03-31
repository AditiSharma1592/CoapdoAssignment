Feature: Registration

Background: 
Given I Open the browser
And Go to website "https://uk.tommy.com/"
And Click on register option
And Click on Create Account option


Scenario: Validate error message when email and password is blank
And I click on create an account button
Then Error message for blank field is displayed
And Close the browser


Scenario: Validate error message when email address is invalid
When I enter invalid email "test"
And I enter password "test@1234"
And I accept the terms and conditions
And I click on create an account button
Then Error message for invalid email address is displayed
And Close the browser


Scenario: Validate error message when password is invalid
When I enter valid email
And I enter password "1234"
And I accept the terms and conditions
And I click on create an account button
Then Error message for invalid password is displayed
And Close the browser


Scenario: Validate error message when terms and conditions is not accepted
When I enter valid email
And I enter password "test@1234"
And I click on create an account button
Then Error message for not accepting terms and condition is displayed
And Close the browser


Scenario: Validate user is registered successfully when valid data is given 
When I enter valid email
And I enter password "test@1234"
And I accept the terms and conditions
And I click on create an account button
Then User is succesfully registered and redirected to my account page
And Close the browser