Feature: login
  Scenario: user login with valid data
    When user input username standard_user
    And user input password secret_sauce
    And click login button
    Then user logged in successfully