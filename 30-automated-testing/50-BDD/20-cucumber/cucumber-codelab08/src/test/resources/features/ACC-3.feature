Feature: As a student I can view my profile

  Scenario: Logging in with a student account and landing on profile page
    Given A student logs into their account
    When Login successful
    Then Student will be navigated to their profile page
    And Viewing their name and display name

  Scenario: Navigating to the profile page using the navigation bar
    Given A student is logged in
    When Navigating to their profile page using the navigation bar
    Then Student will be navigated to their profile page
    And Viewing their name and display name