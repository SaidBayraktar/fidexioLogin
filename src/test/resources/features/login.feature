@FIDE-1441
Feature:Login Functionality


  Background:
    Given user is on the login page

@FIDE-1432
  Scenario Outline: Users can log in with valid credentials
    When user enters valid username "<username>"
    Then user enters valid password "<password>"
    When user click on the Login button
    And user can see their "<userID>"
    Examples:
      | username                | password     | userID         |
      | posmanager18@info.com   | posmanager   | POSManager18   |
      | salesmanager18@info.com | salesmanager | SalesManager18 |


  @FIDE-1433
  Scenario: "Wrong login/password" should be displayed for invalid  credentials (valid username-invalid password)
    When posmanager enters valid username and invalid password
    When user click on the Login button
    And Wrong Login password message is displayed

  @FIDE-1434
  Scenario: "Wrong login/password" should be displayed for invalid  credentials (invalid username-valid password)
    When salesmanager enters invalid username and valid password
    When user click on the Login button
    And Wrong Login password message is displayed

  @FIDE-1435
  Scenario: "Please fill out this field" message should be displayed if the password or username is empty
    When user enters valid username
    When user click on the Login button
    And Please fill out this field message is displayed

  @FIDE-1436
  Scenario: User should see the password in bullet signs by default
    Then user enters valid password
    And user sees the password in bullet sign

  @FIDE-1437
  Scenario: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
    When user enters valid username
    Then user enters valid password and user presses Enter key on the keyboard
    And user is on the home page



