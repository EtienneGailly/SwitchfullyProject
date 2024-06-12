# ATM
```text
|||||||||||||||
|             |
|   - ATM -   |
|             |
|  __€150__   |              "Such a great drawing"
|  ___   ___  |                 
|  |D|   |W|  |                          - Everyone
|             |
|||||||||||||||
||Dolla||Bill||
|||||||||||||||   
```

Inspect the code and execute it! 
Notice how we're creating a ATM window on which we have two buttons and an input field.
It represents a simple ATM terminal.

# ATM

The `AtmMachine` operates by delegating its actions to (an implementation of) the `BankingFacade` interface.
The `BankingFacade` defines the methods (the contract) for getting the balance, depositing and withdrawing money.

Currently, there is only one implementation of `BankingFacade`, a simple implementation (`SimpleBanking`) that is currently used by the `AtmMachine`.
`AtmMachine` can work, out of the box, with any implementation of `BankingFacade`.
- In `AtmApplication`, we provide the `AtmMachine` object with a concrete implementation of `BankingFacade` (currently, this is a `SimpleBanking` object)

Inspect the `AtmApplication` code and see how an instance of `SimpleBanking` is provided to `AtmMachine` upon its creation.

Your job is to create a new implementation of the `BankingFacade`. Call it `SmartBanking`.
This implementation should adhere to the following requirements:
1. The balance can never go below 0
2. The max withdrawal limit is 50% of the total balance
    - E.g. When the balance is 500, the max withdrawal limit is 250
3. The max deposit limit is 14500
4. When performing a deposit, the provided amount can not be negative
    - Otherwise I could simply use deposit to increase my balance (and circumvent any restrictions that exist on withdrawal, but not on deposit)
5. When performing a withdrawal, the provided amount can not be negative
    - Otherwise I could simply use withdrawal to decrease my balance (and circumvent any restrictions that exist on deposit, but not on withdrawal)
6. The entered amount is always of type String, so you'll have to transform it to a double.
    - This can go wrong, make sure you take that into account.
    - E.g. the user enters "forty-five" instead of "45"
    
# Done?

Great, now go to `AtmApplication` and change the following line
```java
new AtmMachine(new SimpleBanking(startingBalance));
```
with 
```java
new AtmMachine(new SmartBanking(startingBalance));
```
Now, when you execute the application, the ATM machine will use the rules as defined in your `SmartBanking` implementation. 

Do notice that we didn't have to change anything in class `AtmMachine` in order for it to work with our newly created `SmartBanking` class. 
That is because our `AtmMachine` class works with the interface `BankingFacade` and thus with any classes that implement it such as `SmartBanking` and `SimpleBanking` and 
any other future implementations. We call this: **programming against an interface** and it leads to flexible code! 