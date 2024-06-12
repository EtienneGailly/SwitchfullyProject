# MyRectangle

Start by creating a `MyRectangle` class.

## Requirement 1
I should be able to create a `MyRectangle` object without providing any arguments.

## Requirement 2
I should be able to create a `MyRectangle` object by providing an X and Y coordinate
- The dimensions should be `50` for `width` and `100` for `height` then

## Requirement 3
I should be able to create a `MyRectangle` object by providing a width and height
- The coordinates should be `5` for X and `10` for Y then

## Requirement 4
I should be able to create a `MyRectangle` object by providing the coordinates and dimensions
The order of the parameters should be `xCoordinate`, `yCoordinate`, `width`, `height`

## Requirement 5
Make sure no-one can directly access the instance variables outside your `MyRectangle` class

## Requirement 6
Create getters for all instance variables

## Requirement 7
Create a method that sets both the width and height to the provided new values

## Requirement 8
Create a method that calculates and returns the area

## Requirement 9
Create two new methods:
1. A method to set the name (or label) of the `MyRectangle` instance
2. A method to get the name (or label) of the `MyRectangle` instance

## Requirement 10
Create a method that, as an argument, takes a `MyRectangle` object and duplicates it.
- With duplicating, we mean a new `MyRectangle` object should be created with the values of the provided one
    - This new `MyRectangle` object should be returned
- Question: Should it be an instance method or a class method?

## Requirement 11
Create a way so that we can ask `MyRectangle` how many instances / objects have been created of `MyRectangle`.
- This means, that every time we create a new instance of MyRectangle, we have to keep count.
