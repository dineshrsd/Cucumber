@Feature3
Feature: To validate the functionallity of bistobits application
Background:
Given that I am logged in as a user and on the home page.
When click the Account button.
When Click the search icon.

@1
Scenario: The user gives the invalid Username and password
Given The user enters the testing site.
And the wrong Username and Password.
And click the login button.
Then check the output Invalid Mobile No.

@2
Scenario: The User successfully add the Dosa
When i see the HOME button on the page and click it.
And I see a dropdown labeled Dosa.
And Click the dosa button.
And select the MasalaDosa option.
Then Enter the page and check the Available Time.

@3
Scenario: The user fills out the registration form and ignores the confirm password.
And Fill out the registration form with dummy data name, phone number and email.
And Skip the confirm password text label.
And click the register button.
Then Get the pop-up Please fill out the field

@4
Scenario: The user search for the Coke can and check the price
Then search Coke and check the can dollar is $ 1.50.

@5
Scenario: The user selects the Spanish Omelet.
Given Find out the Spanish Omelet and Click the icon.
When Select the option by probability.
Then  check the dollar probability.

@6
Scenario: The user read Our Story
Given Click the OurStory option.
Then Check the spelling mistake.