# Bank Account - Types of accounts

We're going to add some additional functionality to the existing code of basic/codelab03. 
Make sure to have finished that codelab before starting.

## Account types

Up until this point, it's possible to create a bank account with an owner, 
balance and an account number. It's possible to withdraw or deposit money from those accounts. 

Currently, there's only one way for withdrawing money, the way it's implemented in the `withdraw(...)` of `BankAccount`.

That's about to change.

It turns out that there are 4 different types of bank accounts, which all have different rules for withdrawing money:

- Free type: You may only withdraw 100 euro a day, you can never have a negative balance.
- Basic type: You may withdraw up to 1000 euro a day, but you can never have a negative balance.
- Premium: You may withdraw up to 2000 euro a day, you can have a negative balance but if you start the withdrawal transaction negative you cannot do the withdrawal.
- Platinum: You have no limits.

## Questions

Questions (after implementing): 
- Which parts are implemented using composition, 
- which part are implemented using inheritance?
