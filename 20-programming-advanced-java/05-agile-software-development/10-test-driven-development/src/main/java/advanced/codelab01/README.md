# Four in a row

For every requirement (you can even split requirements up into smaller bits):
1. Write a test
2. Run the test, see it fail
3. Let your pair implement a solution to fix that test (nothing more, quick and dirty!)
4. Run the test, it should succeed
5. Refactor (if needed)
6. Repeat step 1, but switch roles.

Repeat this process until the requirement is completely tested (happy path and boundary tests) and fully implemented.
Only then go to the next requirement

Remember to keep the XP practices in mind:
- Pair programming
- Good tests
- Incremental design
- Write clean code

# Assignment
You'll have to develop the (domain) of the game Four-in-a-row. All the normal rules of the game apply.
The game is played by 2 players (who each are represented by a different kind of disc). The board is 7 columns wide and
6 rows deep. Develop this game by going through the requirements. Do them in order. Only go to the next requirement
when the previous requirement is completely finished.

# Requirement 1
Create a method to place a new disc inside the board. This method that takes in the following arguments:
- The current (state of) the board (contains the already played discs placed in the correct cells)
- The disc of the current player
- The selected column (to drop the disc in)

The method should return the new (state of the) board (contains the already played discs + the newly dropped disc)

The following business rules apply:
- The disc should drop to the lowest row, but never on top or over an already existing disc of that row.
- A chosen column can never be a negative value, nor can it be larger than the max column.

# Requirement 2
Create a (void) method (in another class?) that calls the method from **requirement #1**, but each time,
it should alternate between the 2 players.
- The first time it should call the method from **requirement #1** with the disc of player 1.
- The second time it should call the method from **requirement #1** with the disc of player 2.
- The third time it should call the method from **requirement #1** with the disc of player 1.
- ...

This new method should have just one parameter, the row in which to drop a disc.

# Requirement 3
Extend the method from **Requirement #2**. Now, each time after calling the method from **requirement #1**, validate the
received (state of the) board to decide if a player has won the game.

A player wins if-and-only-if a row of 4 connected discs exists (both horizontally, vertically or diagonally)

The method from **Requirement #2** should no longer have return-type void.
It should return the board + if the game is won / finished + which player has won the game (if any).

# (Optional) Requirement 4
Create a CLI that asks input from the user and calls the method from **Requirement #2** and **Requirement #3**.
- It should print the board after each turn.
- It should stop asking for input when the game is won by a player.
    - It should then also print the player who has won.
