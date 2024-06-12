# Bank account

## Account

The class named Account should contain a definition for a simple bank account.

it has the following instance fields (state): 
- a balance (double)
- an account owner (AccountOwner)
- an account number (long)

Don't forget about Encapsulation!

`Account` has one constructor, which requires values for the `balance` and `account owner` fields to be given as arguments.
This constructor will initialize the balance and account owner with the arguments.
This constructor will generate a random account number (hint: java.util.Random) between 1 and 50.000.0000.

`Account` has instance methods to:
- `withdraw(double amount)`
    - an account's balance can never get below 0
    - There is a maximum withdrawal limit of 5000
        - for both criteria, print a message
- `deposit(double amount)`
    - There is a maximum deposit limit of 80000
        - Print a message
- a method to get the balance
- a method get the account number

Override the `toString` method so that the textual representation of `Account` is: "Account with number <accountNumber> and owner <accountOwner> has balance <balance>"
  
Account should contain a private class variable, `accountCounter`, 
which should hold the total amount of all the created Account objects. 
Create a class method (`getNumberOfAccounts`) to return the value of `accountCounter`.

## AccountOwner

`AccountOwner` has the following instance fields:
- a firstname (String)
- a lastname (String)
    
`AccountOwner` offers 2 public getter methods (instance methods):
- one for firstname
- one for lastname
    
Override the `toString` method so that the textual representation of `AccountOwner` is: 
"Mr. or Mrs. <firstname>, <lastname>"

## BankRunner

`BankRunner`already has some code available. More specifically, it's using the `Scanner` class. This class allows
 you to input (instead of output) text from the console.
 
Add code the to `BankRunner` class, so that an AccountOwner and an Account object are created based on the input 
entered into the console.

Make sure to also deposit or withdraw some money from that account.
    
