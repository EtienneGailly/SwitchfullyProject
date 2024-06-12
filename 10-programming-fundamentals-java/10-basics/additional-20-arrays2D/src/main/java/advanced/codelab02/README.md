# Codelab02: TicTacToe

Create a program that checks if a player has won with tic tac toe.
Possible outcomes you should print:
- Player X has won the game.
- Player O has won the game.
- No one has won the game.

a player can win the game if he has 3 items in one row.

Run the tests!

If you want to take it up a notch try to check if it is a valid game.
- Validity of a TicTacToe game: https://www.geeksforgeeks.org/validity-of-a-given-tic-tac-toe-board-configuration/
 

## Still not satisfied?
Let's make it in a full multiplayer game!

---
The game starts with the 'X' player setting his/her first mark.
Ask that the player to provide the coordinate where he/she wants to place it.
A player provides a coordinate in the form (x,y). 
Coordinates start from 0 and go from left to right and from top to bottom.

    e.g., if the player inputs (0,0) you place an 'X' in the upper left corner

---

Print out the state of the board after every placed mark. 

    e.g.
        | X |   |   |
        |   |   |   |
        |   |   |   |

---

Now ask the 'O' player to provide an input

---

Keep asking for input until one of the players have won the game.
Then print out either
    
    Congratulations 'X' you've won the game!

or
    
    Congratulations 'O' you've won the game!

and end the program.

### Important

There are many ways that a player might break the game.
Provide the necessary input validation.
If a player provides bad input, keep asking for input until he provides something that is correct.

Afterwards ask a colleague to try and break the game to see if you haven't missed anything.
