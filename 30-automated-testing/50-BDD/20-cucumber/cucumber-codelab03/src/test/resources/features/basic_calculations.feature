Feature: Basic calculations

  Scenario: We can add two numbers together
    Given The numbers 1 and 2
    When Adding these together
    Then The result will be 3

  Scenario: We can subtract two numbers from each other
    Given The numbers 2 and 4
    When Subtracting one from the other
    Then The result will be 2

  Scenario: We can multiply two numbers with each other
    Given The numbers 4 and 5
    When Multiplying these with each other
    Then The result will be 20

  Scenario: We can divide two numbers by each other
    Given The numbers 34 and 17
    When Dividing one with the other
    Then The result will be 2

  Scenario: Persistent state
    Given The numbers 34 and 17
    When Multiplying these with each other
    Then The result will be 578
