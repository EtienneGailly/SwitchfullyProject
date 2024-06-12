# All on your own

The goal of this codelab is to see if you can set up a project from scratch.

## Tasklist
Set up a Cucumber project so that you can test the following scenario

```gherkin
Scenario: I can look up a book on title
Given I go to the books page
And I fill in 'Slagschaduw' as title
When When I press the search button
Then I see one book with title 'Slagschaduw' and author 'Jo Claes'
```

1. Create a Feature file
2. Create a Suite definition
3. Create a Steps class
4. Configure Cucumber to run spring boot
5. Add a Spring configuration file
6. Make a Webdriver component
7. Create a Page Component

Only look at your previous codelabs if you're stuck!


## Expressing a list in gherkin
Looking back at the previous scenario, there is one more problem you might encounter.
Say that you want to run the same scenario but this time you search all the books of a certain author.
How can we express that we want to assert that a list of books is correct?

One book is easy to express, a list of books is harder. 
Since every time you need to change the length of the list, you'll need to adapt the whole step definition.
Can't we have a more flexible step definition?

Say that we want to run the following:
```gherkin
Scenario: I can look up a book on title
Given I go to the books page
And I fill in 'Dirck Bracke' as an author
When When I press the search button
Then I see the following list of books ???
```

## Datatable 
The recommended way to express this is with a datatable.

A datable in gherkin would look something like this:
```gherkin
Scenario: I can look up a book on title
Given I go to the books page
And I fill in 'Dirck Bracke' as an author
When When I press the search button
Then I see the following list of books
| title           | author               |
| Black           | Dirk Bracke          |
| Het engelenhuis | Dirk Bracke          |
| Rollercoaster   | Dirk Bracke          |
```

Notice that every line in this table represents a book.
The whole table thus represent a list of books.
Also notice that the first row is not a book but the headers for each column.

### Datatable in the steps
There are many ways you can use a datatable in a step.
The easiest way is to add a List in the parameters.
Like so:
```java
public void stepDefinition(List<Book> books) {
    //Code here
}
```
To make this work you'll need a transformation method (there are other ways but this is the easiest).
You write it like so:
```java
@DataTableType
public Book book(Map<String, String> row) {
    return new Book(row.get("title"), row.get("author"));
}
```
Just include it in one of your step classes, and you can start including datatables for books in every step you want.
Notice that the get functions use the headers of the datatable.

Remember you'll need a transformation method for every different type of datatable.
So if you want to represent a list of users in a datatable, you'll need a transformation method that transforms a datatable to a user.

## Doing it yourself
1. Try implementing the above scenario using a datatable.

