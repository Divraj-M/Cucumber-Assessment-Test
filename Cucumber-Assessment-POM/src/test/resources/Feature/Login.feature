
Feature: Log in the Application 

@LoginValidCredentials
Scenario Outline: Log in the application with valid credentials

Given the user is on the WebApplication 
When I click the Myaccount 
And Click the log in button
And Enter the valid emailid "<email>" and password "<password>"
And click login
Then the user should see the My account page 

Examples:
|email                |password  |
|2k21cse022@kiot.ac.in|Divraj@123|
|2k21cse021@kiot.ac.in|Divraj@123|

@LoginInvalidCredentials
Scenario Outline: Log in the application with Invalid credentials

Given the user is on the webApplication
When I click the Myaccount 
And Click the log in button
And Enter the Invalid emailid "<emailid>" and Inpassword "<Password>"
And click login
Then the user should see the warning message as No match


Examples:
|emailid              |Password |
|2k21cse022@kiot.ac.in|Divraj@12|
|2k21cse021@kiot.ac.in|         |
|2k21                 |hello    |


