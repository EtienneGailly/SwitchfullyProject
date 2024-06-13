Feature: Accesing the home page

  Scenario: As a visitor I will see the homepage when visiting the LMS application
    Given The homepage URL
    When I visit the homepage
    Then I see the homepage