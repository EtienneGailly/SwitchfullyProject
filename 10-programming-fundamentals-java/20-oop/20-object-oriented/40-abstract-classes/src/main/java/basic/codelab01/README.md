# Employee

Create a class `Employee`, this class should contain a `name` and a `basic annual salary`.

We should be able to calculate the monthly salary (`calculateMonthlySalary`) for an `Employee` object.
- Calculating the monthly salary is highly dependent on the type of employee:
    - A normal employee gets 1/12 of the annual salary, as its monthly salary.
    - A manager gets 1/11 of the annual salary + a bonus, as its monthly salary.
        - The bonus ranges from 100 to 250 euro and is assigned to the manager upon creating the object.
        - The bonus of a manager can be changed (but still, it has to be between 100 - 250 euro). 
    
Additional technical requirement: **Use an abstract class and an abstract method**.



## Hints

**Warning: spoilers up ahead!**

*
*
*
*
*
*
*
*
*
*
*
*
*
1. Create a main method in a `Main` class.
1. Start creating your domain. You'll need 3 classes. `Employee`, `NormalEmployee` and `Manager`.
    1. First think about the `Employee` class. Which fields should it have? Which methods?
        1. Which fields and behaviour do `NormalEmployee` and `Manager` share? Add them to `Employee`
        1. Does it make sense to provide an implementation for the methods in `Employee`. Why (not)?
            1. Make a method abstract if it doesn't make sense to have an implementation.
    1. Create either the `NormalEmployee` or the `Manager` class.
        1. Test that it works as expected in your main method.
        1. Only start with the next part if you're 100% that this new class works as expected.
    1. Create the last class.
        1. Test this one as well.
