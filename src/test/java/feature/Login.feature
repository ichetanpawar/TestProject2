Feature: Application Login

Scenario: Home page default login
Given User is on landing page
When User login into application with username "chetan" & password "test123"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on landing page
When User login into application with username "shiv" & password "test123"
Then Home page is populated
And Cards displayed are "false" 
