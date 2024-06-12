# Pet shop

> Better one pet in the hand than ten pets in the air.

## Pet

Imagine we're writing code that will be part of a pet shop application.

In the **domain** of this pet shop, there exists a concept called **pet**. For this,create a class - named `Pet` - that represents that concept.

`Pet` has as its state the following fields:
- A name (e.g. Buster)
- A price in euro (e.g. 950)
- An isHealthy field (e.g. true)

provide a constructor that has 3 arguments (a value for `name`, `price` and `isHealthy`).

`Pet` has as its behavior the following methods:
- A method to get the `name` value
- A method to get the `price` value
- A method to get the `isHealthy` value 
    - (don't use the **get** prefix here, but name it `isHealthy()` because that name better reveals the naming of the actual returned value (e.g. `true`))
- A method to buy the Pet object: `buy(double offeredMoney)`. (which simply means returning value `true` or `false`):
    - The method will return value `true` if-and-only-if:
        - The `offeredMoney` argument is equal to (or higher) than the actual price of the pet
        - The pet is healthy
    - Otherwise, the method will return value `false`.
    
## Dog 

> Who's a good boy?

Create the `Dog` class, it's a child class of (parent) class `Pet`.

A `Dog` has, besides its inherited state of `Pet`, no additional state.

It should be possible to create a `Dog` object like this: `new Dog("Buster", 850, true);`.
   
    
## Cat

> Is Cat a pet? A Cat is a Pet!

Create the `Cat` class, it's a child class of (parent) class `Pet`.

A `Cat` has, besides its inherited state of `Pet`, one additional field: `isAggresive`.

It should be possible to create a `Cat` object like this: `new Cat("Garfield", 75, true, true);` 
(where the second `true` is the value for `isAggressive`).

### Override buy(...)
For `Cat`, override method `buy(double offeredMoney)`
- The method will return value `true` if-and-only-if:
    - The `offeredMoney` argument is equal to (or higher) than the actual price of the pet
    - The pet is healthy
    - **The cat is not aggressive** (which is the only thing that is different from the `buy(double offeredMoney)` method of `Pet`)
- Otherwise, the method will return value `false`.

When overriding this method, try to reuse the method of `Pet` (don't copy/paste the code), try to only write new code for the `The cat is not aggressive` requirement.
- Tip: you'll need to `super` keyword.

## Create some instances

Write a main method (in its dedicated class) in which you create some Cat and Dog objects. Then, try to buy them.  Experiment a bit, 'kay?



