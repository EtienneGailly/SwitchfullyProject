Feature: Scenarios from scratch
  Scenario: I can look up a book on title
    Given I go to the books page
    And I fill in 'Dodendans' as title
    When When I press the search button
    Then I see one book with title 'Dodendans' and author 'Christian De Coninck'

  Scenario: I can look up books by author
    Given I go to the books page
    And I fill in 'Dirk Bracke' as author
    When When I press the search button
    Then I see the following list of books
      | title                            | author               |
      | Vuurmeisje                       | Dirk Bracke          |
      | Catwalk                          | Dirk Bracke          |
      | Rollercoaster                    | Dirk Bracke          |
      | Back                             | Dirk Bracke          |
      | Straks doet het geen pijn meer   | Dirk Bracke          |