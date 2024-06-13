Feature: As a visitor I can register an account

  Scenario Outline: Register with an account
    Given a visitor is on the register page with display name "<display_name>", email "<email>", password "<password>", and repeat password "<repeat_password>"
    When Clicking the register button
    Then I can log into my account

    Examples:
      | display_name | email | password | repeat_password |
      | John Doe     |john@mail.com|hooray | hooray |
      | Jane Doe     |jane@mail.com|password | password |

  Scenario Outline: Register with a missing field
    Given As a visitor I forget to fill in a "<display_name>" field or "<email>" field or "<password>" field or "<repeat_password>" field
    When Clicking the register button
    Then I get a message the the field is required

    Examples:
      | display_name | email | password | repeat_password |
      |      |john@mail.com|hooray | hooray |
      | Phoebe Buffay     ||password | password |
      |Ross Geller        |ross@gmail.com| | password |
      |Rachel Green       |rachel@gmail.com|password |  |

  Scenario: Register with an already registered email address
    Given As a visitor I register with an already registered email address
    When Clicking the register button
    Then I get a message that the email address is already registered

  Scenario: Register with an two different passwords
    Given As a visitor I fill in two different passwords
    When Clicking the register button
    Then I get a message that the password do not match

  Scenario: Register with an invalid format e-mail
    Given As a visitor I fill an e-mail that is in the wrong format
    When Clicking the register button
    Then I get a message that the e-mail is not correctly formatted