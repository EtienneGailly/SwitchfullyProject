# Scrabble

We're going to program the logic of a simplified Scrabble game. 

## ScrabbleBoard
A `ScrabbleBoard` has a 2-dimensional array of `Square` objects.
- The dimensions of a scrabble board are 15x15 squares.
- Creating a `ScrabbleBoard` object should be possible by using a no-arg constructor. It will create a `ScrabbleBoard` that has 225 `Square` objects (15x15)
- Create a method that accepts a row and column index (as two arguments) and returns the corresponding `Square` object.
- Override the `toString` method so that it returns a textual representation of the board, something like this:
    ```text
    [  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ]
    [  ][  ][  ][  ][1H][2E][1L][1L][3O][  ][  ][  ][  ][  ][  ]
    [  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ][  ]
    ...
    ```

## Square
A `Square` has, as its state, a `multiplier` (2x, 3x or simply 1x) and a `Tile` object.
- A `Square` object's `Tile` object can be empty, as it's possible for a square not to have a tile on it.
- Write a method that returns the `points` of the `Tile` object multiplied by the `multiplier`.

## Tile 
A `Tile` has (as its state) a character named `letter` and an integer, named `points` (the value).  
- Write a constructor that takes parameters named letter and points, and initializes the instance fields.
- Implement the `toString` and `equals` methods for a `Tile`.

## Execute

- Create `ScrabbleRunner`, a class which can be executed. In it, a `ScrabbleBoard` object, and print out the board (using its `toString` method).
Feel free to do other things as well.

## Reflect on the design (of the code)

We created the concept of a `(Scrabble)Board`, a `Square` and a `Tile`. Would you have done it the same?
Do we need the `Square` class? Could we (or would it be better) do with just `ScrabbleBoard` and `Tile`?
- If so: why?
- If not: why? 