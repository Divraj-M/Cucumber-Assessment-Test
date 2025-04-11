Feature: Register with required fields in the Application

@RegisterwithValidCredentials
Scenario: user enter the required field for registration
Given the user is on the WebApplication
When I click the My account and Register
And enter the required fields for registration
|Divraj |M |2k21csre027@kiot.ac.in |9025861027  |Divraj@123 |Divraj@123 |
And click continue button
Then the user should see the successful message as Your Account Has Been Created!.


