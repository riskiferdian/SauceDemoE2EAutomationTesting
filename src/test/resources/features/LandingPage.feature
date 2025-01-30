Feature: Landing Page
  Scenario: Buy produk
    When user input username standard_user
    And user input password secret_sauce
    And click login button
    Then user logged in successfully
    When user sort produk by Name (Z to A)
    And select sauce labs backpack