Feature: As a coach I can log into my coach account

  Scenario: Login with a registered coach account
    Given A coach with an existing account
    When Going to the login page
    And Filling in their credentials
    And Pressing the login button
    Then Coach will be navigated to their profile page
    And The message 'Logged in as coach <coach_name>' will be visible.

  Scenario: Login with a non-existing coach account
    Given A coach with a non-existing account
    When Going to the login page
    And Filling in their credentials
    And Pressing the login button
    Then A warning message will appear: 'Invalid credentials'

  Scenario: Login with a coach account with the wrong password
    Given A coach with a existing account
    When Going to the login page
    And Filling in the wrong password
    Then A warning message will appear: 'Invalid credentials'