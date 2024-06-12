# Slot Machines

> Created by Level Up Lunch

A more fun and completely **optional** codelab...

A slot machine is a gambling device that the user inserts money into and then pulls a lever (or presses a button). 
The slot machine then displays a set of random images. 
If two or more of the images match, the user wins an amount of money that the slot machine dispenses back to the user.

Create a program that simulates a slot machine.
- Think about your design!
    - Which concepts will you create?

When the program runs, it should do the following:

- Ask the user to enter the amount of money he or she wants to enter into the slot machine.
- Instead of displaying images, the program will randomly select a word from the following list: 
Cherries, Oranges, Plums, Bells, Melons, Bars
- To select a word, the program can generate a random number in the range of 0 through 5. If the number is 0, 
the selected word is Cherries; if the number is 1, the selected word is Oranges; and so forth. 
The program should randomly select a word from the list three times and display all three of the words.
- If none of the randomly selected words match, the program will inform the user that he or she has won $0.
- If two of the words match, the program will inform the user that he or she was won two times the amount entered.
- If three of the words match, the program will inform the user that he or she has won three times the amount entered.
- The program will ask whether the user wants to play again. If so, these steps are repeated. If not, the program 
displays the total amount of money entered into the slot machine and the total amount won.

Example output:
```text
Welcome to the Slot Machine Simulation.

Enter the amount you would like to bet: $250

Bells--Bells--Bars

You win $500.00

Would you like to play again?
Enter Y for yes or N for no: y

Welcome to the Slot Machine Simulation.

Enter the amount you would like to bet: $500

Bells--Bells--Cherries

You win $1,000.00

Would you like to play again?
Enter Y for yes or N for no: n

You won a total of $1,500.00
```