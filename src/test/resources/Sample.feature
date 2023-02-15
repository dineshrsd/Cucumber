Feature: to validate the login functionallity of facebook application
Background:
    Given to launch chrome browser and maximise the window


  Scenario: to validate login with vaild usename and invalid password
    When to launch the application of facebook url
    And to pass the valid username on email field
    And to pass the invalid passowrd on password field
    And to click the login button
    And to check the navigate to home page or not
    Then to closed the browser

  Scenario Outline: to validate positive and negative combination of login functionality
    When user has to hit the facebook url
    And user has to pass the data "<Emaildatas>"in email textfield
    And user has to pass the data"<PasswordDattas>" in password textfield
    And user has to click on login button
    Then user has to close the browser

    Examples: 
      | Emaildatas      | passwordDattas |
      | Dinesgras@gmail |          12345 |
      | raj@gmail       |         122345 |
      | jaku@yhaoo      | mnjmkn         |
      | vuru@hot.com    |       98678976 |
      | janu@gmail.com  | jnjnj          |
