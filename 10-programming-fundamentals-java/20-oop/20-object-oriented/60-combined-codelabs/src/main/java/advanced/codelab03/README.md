# Connect four


A more fun and completely **optional** codelab...

Create a game of Connect Four (Four in a row).

Think about your design!
- Which concepts (classes) will you need?
- How will they work together?
- Think about responsibilities
    - Which class should know and do what?
- Provide a CLI (command line interface)
    - The players can provide input using the console
    - Always validate their input, players of the game shouldn't be able to crash your program.
        - When input is invalid, provide the player with feedback and allow him to try again.

A game of Connect Four is won when there are four disks 
of the same player on an uninterrupted horizontal, vertical or diagonal line.

Tip: Start by creating only a small part of the game: e.g. creating the board and printing it out.
Then, add more and more parts to your code until you have a fully working connect four game.

Below, we demonstrate how a fully implemented game should be played using the console / command line:

```text
Welcome to Connect Four.
Please specify player name 1
> Adam
Please specify player name 2
> Bert
Thank you, get ready to play!
Player 1: Adam (X), Please select a column in which you want to drop your disk (First row is number 0)
---------------------------
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
---------------------------
> 1
No winner yet!
Player 2: Bert (0), Please select a column in which you want to drop your disk (First row is number 0)
---------------------------
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [ ] [ ] [ ] [ ] [ ]
---------------------------
> 2
No winner yet!
Player 1: Adam (X), Please select a column in which you want to drop your disk (First row is number 0)
---------------------------
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [0] [ ] [ ] [ ] [ ]
---------------------------
> 1
No winner yet!
Player 2: Bert (0), Please select a column in which you want to drop your disk (First row is number 0)
---------------------------
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [0] [ ] [ ] [ ] [ ]
---------------------------
```

This goes on until a player makes a winning move (Four of a kind: horizontally, vertically or diagonally).
When this happens, a message and final state will be shown to indicate the winner.

```text
...
No winner yet!
Player 1: Adam (X), Please select a column in which you want to drop your disk (First row is number 0)
---------------------------
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [0] [0] [ ] [ ] [ ]
---------------------------
> 1
Player 1: Adam (X), YOU HAVE WON!
Final board situation:
---------------------------
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [ ] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [ ] [ ] [ ] [ ] [ ]
[ ] [X] [0] [0] [ ] [ ] [ ]
---------------------------
```

## Extra: Distribute your version of Connect Four
* How would you distribute your version of Connect Four to your colleagues?
* How would you distribute your version of Connect Four to non-technical people?
