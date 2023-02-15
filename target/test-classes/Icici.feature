@Feature2
Feature: To validate the login functionallity of icicibank application

Scenario: To validate login with invalid user id and password

Given launch the chrome browser and maximize window
When To launch the application icici url
And to pass the invalid data userid text field
And to pass the invalid data password text field'
And to click on login button
Then To the chrome browser


