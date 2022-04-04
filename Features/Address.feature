Feature: Adding Address

Scenario: Adding new address after registering new user
Given I Open the browser
And Go to website "https://uk.tommy.com/"
And Click on register option
And Click on Create Account option
When I enter valid email
And I enter password "test@1234"
And I accept the terms and conditions
And I click on create an account button
Then User is succesfully registered and redirected to my account page
When I click on Add new address option
And I enter AddressType
And I enter First Name as "John"
And I enter Last Name as "Louis"
And I enter Address1 as "Burg Stamplien, 1990"
And I enter Address2 as "Birmingham"
And I enter city as "Birmingham"
And I enter Postcode as "B1 1AA"
And I enter Country as "United Kingdom"
And I click on save Address button
Then new address is added 
And Close the browser


