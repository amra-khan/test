
@tag
Feature: Login Page
	

Scenario: Login into flipkart
When he clicks on login icon
Then he should be able to see the Login Page


Scenario: Login into flipkart
Given User is on the Login Page
When User enters Username as "8750152322" and Password as "telnet@123"
#And click the submit button
Then user should be on the home page

 