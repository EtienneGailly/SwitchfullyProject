# Battleship

> You sank my battleship...

_This is an optional codelab for those who are ahead._

Battleship is a war-themed board game for two players in which the opponents try to guess the location of the other's 
various ships. In our version, one player tries to hit the ships of the computer.

## Rules
In this digital version, there is only one grid (owned by the Computer) and only one player (who tries to hit the computer's boats).
The ships of the computer are placed on the computer's grid (this should be done automatically before the game really starts).
- A player has no grid or ships of his/her own.
- If you like (not required), you can make it random, so that each time the grid contains a different setup of ships.
    - However, still all the rules (read below) should apply! 

Grid:
- Each grid consist of 10 rows and 10 columns.

Ships, there are 5 ships:
1. Carrier: 5 cells wide
2. Battleship: 4 cells wide
3. Destroyer: 3 cells wide
4. Submarine: 3 cells wide
5. Patrol Boat: 2 cells wide

Placement rules:
- Ships can not be placed diagonally
- Ships can not touch (at least one cell in between), they can also never overlap
- Ships can't hang off the grid
- After the game has started, the position of a ship can not be changed.

## Basic Gameplay

1. Using the command line, the player can provide the coordinates of the grid (row, column) cell he/she wants to target.
    - E.g.: `0,5` could specify ROW (index) = 0, COLUMN (index) 5.
2. The computer will validate if it was a hit or a miss.
    - If it was a hit it should output `"Ship on (row, column) was hit."`
    - If it was a hit, and the ship is completely destroyed, it should output `"Ship on (row, column) was hit and destroyed".`
    - If it was a hit, and the ship is completely destroyed and it was the last living ship, it should output `"You have Won the game!`
        - Furthermore, in this final scenario: it should output the entire grid, showing the boats and misses:
             ```text
            O  O  O  O  O  O  O  O  O  O
            X  O  O  X  O  O  O  X  O  O
            O  O  O  O  H  H  H  O  O  O
            ... (etc)
             ```
          - Where `X` is a miss, `O` is never targeted and `H` is a hit. 

TIP: you can read input from the console using the `Scanner` class:
```java
public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    System.out.println("You entered string "+s);
    int a = in.nextInt();
    System.out.println("You entered integer "+a);
    float b = in.nextFloat();
    System.out.println("You entered float "+b);
}
```
