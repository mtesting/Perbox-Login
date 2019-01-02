Feature: Login
  As a user, I want the ability to select an account to login to

  Scenario: User account selection
    Given The user opens the page
    When The user enters the valid email address
    When The user is taken to account selection page
    When The user selects the account
    Then on the login page, the email field is pre-populated



