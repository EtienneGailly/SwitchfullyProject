Feature: As a visitor I can register an account
  Scenario: Registering with an account
    Given As a visitor, I have filled in my: display name, email, password and repeat password
    When Clicking the register button
    Then I can log into my account
  Scenario: Registering with a missing field
    Given As a visitor I forget to fill in a field
    When Clicking the register button
    Then I get a message the the field is required
  Scenario: Registering with an already registered email address
    Given As a visitor I register with an already registered email address
    When Clicking the register button
    Then I get a message that the email address is already registered
  Scenario: Registering with an two different passwords
    Given As a visitor I fill in two different passwords
    When Clicking the register button
    Then I get a message that the password do not match
  Scenario: Registering with an invalid format e-mail
    Given As a visitor I fill an e-mail that is in the wrong format
    When Clicking the register button
    Then I get a message that the e-mail is not correctly formatted