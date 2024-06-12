# Supermarket Racks

## The Domain

For your information: the domain as described here might not be complete.

### Grocery
Represents an individual supermarket grocery
- A Grocery has a name (e.g. "Bag of ships")

### Rack
Represents a supermarket rack
- A Rack has one or more shelves
- A shelf can hold groceries

## Expected behavior

### Rack

The following methods should be present on `Rack`, they define its public API:
- `getAmountOfShelves`
  - returns the amount of shelves the Rack has
- `fill(Groceries, IndexOfShelf)` (not actual types for parameters)
  - For a given shelf (IndexOfShelf), store the provided groceries in a one-by-one way (just like in real life)
  - If argument IndexOfShelf is not valid, throw an exception
- `takeGroceryFromShelf(IndexOfShelf)`
  - For a given shelf (IndexOfShelf), return the grocery that's sitting on that shelf
    - The grocery that was added last to the rack, should be the one that is taken first.
  - If argument IndexOfShelf is not valid, throw an exception

## Application

Write an executable program in which you create at least one `Rack` instance that has multiple shelfs.
Then add groceries to at least one shelf.

If you like, try make it a CLI application. The racks can be pre-populated with groceries, 
the CLI application simply offers a user to select a rack and a shelf to take a grocery from.
- If the user enters a wrong shelf, should we just let the exception from `takeGroceryFromShelf(IndexOfShelf)` be thrown? Or, can we simple detect the wrong input and request new, valid input?





