Feature: Books feature

  Scenario: Finding books
    Given I am not logged in
    When I navigate to the books overview page
    Then I can find the following books
      | title           | author               |
      | Black           | Dirk Bracke          |
      | Het engelenhuis | Dirk Bracke          |
      | Slagschaduw     | Jo Claes             |
      | Dodenmarkt      | Christian De Coninck |
      | Rollercoaster   | Dirk Bracke          |
