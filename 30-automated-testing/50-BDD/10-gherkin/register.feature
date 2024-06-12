Feature: Register as a Digibooky member
  As a user
  I want to be able to register myself as a new Digibooky member
  So I can perform additional actions

  Background: a user has no account
    Given a user wants to register

  Scenario: Successful registration
    When the user provides their INSS, last name, first name, email, street name, street number, postal code and city
      | INSS        | last name | first name | email                         | street name    | street number | postal code | city      |
      | 12345678901 | Vanhoutte | Laurens    | laurens.vanhoutte@mail.com    | The Street     | 123           | 1000        | Brugge    |
    And the INSS is unique and filled in
    And the email is unique, filled in and of the form `x@x.x`
    And the last name and city are filled in
    Then the system should register the user as a new Digibooky member
    And assign a unique user identification number to the member

  Scenario: Unsuccessful registration due to duplicate INSS
    Given there is already an account with INSS 12345678901
    When the user provides an INSS that is already in use
      | INSS        | last name | first name | email                         | street name    | street number | postal code | city      |
      | 12345678901 | Vanhoutte | Laurens    | laurens.vanhoutte@mail.com    | The Street     | 123           | 1000        | Brugge    |
    Then the system should not register the user
    And inform the user that the INSS is already in use

  Scenario: Unsuccessful registration due to duplicate email
    Given there is already an account with email laurens.vanhoutte@mail.com
    When the user provides an email that is already in use
      | INSS        | last name | first name | email                         | street name    | street number | postal code | city      |
      | 12345678901 | Vanhoutte | Laurens    | laurens.vanhoutte@mail.com    | The Street     | 123           | 1000        | Brugge    |
    Then the system should not register the user
    And inform the user that the email is already in use

  Scenario: Unsuccessful registration due to invalid email format
    When the user provides an email that does not follow the `x@x.x` format
      | INSS        | last name | first name | email                         | street name    | street number | postal code | city      |
      | 12345678901 | Vanhoutte | Laurens    | laurens.vanhoutte@com         | The Street     | 123           | 1000        | Brugge    |
      | 12345678901 | Vanhoutte | Laurens    | laurens.vanhoutte@mail        | The Street     | 123           | 1000        | Brugge    |
      | 12345678901 | Vanhoutte | Laurens    | @mail.com                     | The Street     | 123           | 1000        | Brugge    |
    Then the system should not register the user
    And inform the user that the email format is invalid

  Scenario: Not filling in last name
    When the user doesn't provides a last name
      | INSS        | last name | first name | email                         | street name    | street number | postal code | city      |
      | 12345678901 |           | Laurens    | laurens.vanhoutte@mail.com    | The Street     | 123           | 1000        | Brugge    |
    Then the system should not register the user
    And inform the user that the last name is not provided

  Scenario: Not filling in the city
    When the user doesn't provides a city
      | INSS        | last name | first name | email                         | street name    | street number | postal code | city      |
      | 12345678901 | Vanhoutte | Laurens    | laurens.vanhoutte@mail.com    | The Street     | 123           | 1000        |           |
    Then the system should not register the user
    And inform the user that the last name is not provided