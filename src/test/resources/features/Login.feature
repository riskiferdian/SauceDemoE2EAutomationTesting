Feature: login
  Scenario: user login with valid data
    Given user already open login page sauce demo website
    When user input username standard_user
    And user input password secret_sauce
    And click login button
    Then user logged in successfully

  Scenario: user login with invalid data
    Given user already open login page sauce demo website
    When user input invalid username testing
    And user input invalid password testing
    And click login button
    Then system will show pop up error message


  Scenario: already logged in
    Given user already logged in with username standard_user password secret_sauce and click login button