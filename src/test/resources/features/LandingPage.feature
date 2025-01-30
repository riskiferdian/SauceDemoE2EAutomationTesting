Feature: Landing Page
  Scenario: Buy produk
    Given user already logged in with username standard_user password secret_sauce and click login button
    When user sort produk by Name (Z to A)
    And select sauce labs backpack