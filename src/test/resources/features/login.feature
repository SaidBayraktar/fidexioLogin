
Feature:Login Functionality


  Background:
    Given user is on the login page

@wip
  Scenario Outline: Users can log in with valid credentials
    When user enters valid username "<username>"
    Then user enters valid password "<password>"
    When user click on the Login button
    And user can see their "<userID>"
    Examples:
      | username                | password     | userID
      | posmanager18@info.com   | posmanager   | posmanager18
      | salesmanager18.info.com | salesmanager | salesmanager18



