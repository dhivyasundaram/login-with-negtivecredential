Feature: Leaftaps login functionality
Scenario: Test login functionality with positive credential
Given Open the chrome browser
And Load the application url
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When click on login button
Then Home page should be displayed


Scenario: Test login functionality with negative credential
Given Open the chrome browser
And Load the application url
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When click on login button
But Error message should be displayed
