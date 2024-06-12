Feature: Log in

  Scenario: I can log in
    Given I go to the login page
    And I fill in 'koen@mail.com' as username and 'passkoen' as password
    When When I press the login button
    Then I am navigated to the profile page
    And I can see that my inss is 1234567