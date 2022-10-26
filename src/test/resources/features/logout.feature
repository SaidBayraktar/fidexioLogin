Feature: Log out Functionality

  Background:
    Given user is already logged in and is on the homepage

@wip
  Scenario: User can log out and ends up in login page
    When user clicks on the username module
    Then user clicks on the log out dropdown option
    And user lands on the login page


    Scenario: The user can not go to the home page again by clicking the step back button after successfully logged out
      When user clicks on the username module
      Then user clicks on the log out dropdown option
      When user lands on the login page
      Then user clicks on the goBack button
      And can not go to the home page again
