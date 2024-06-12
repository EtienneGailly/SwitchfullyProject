Feature: Basic calculations

  @commutative
  Scenario: We can add two numbers together
    Given The numbers 1 and 2
    When Adding these together
    Then The result will be 3

  Scenario: We can subtract one number to another
    Given The numbers 2 and 4
    When Subtracting the first from the second
    Then The result will be 2

  @commutative
  Scenario: We can multiply two numbers together
    Given The numbers 5 and 4
    When Multiplying these together
    Then The result will be 20

  Scenario: We can divide a number by another
    Given The numbers 34 and 17
    When Dividing the first by the second
    Then The result will be 2