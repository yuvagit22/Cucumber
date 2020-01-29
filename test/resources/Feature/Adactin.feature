Feature: Verifying Adactin details

Scenario: Verifying Adactin login page with valid details

Given user is on the Adactin page
When user enters the username and password 
Then user should click the login button
   