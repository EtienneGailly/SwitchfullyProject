Feature: Add a professor
  Scenario: Add a professor
  Given I have access to the application and want to add a professor
  When I send the request to add the professor
  Then The professor is added to the list