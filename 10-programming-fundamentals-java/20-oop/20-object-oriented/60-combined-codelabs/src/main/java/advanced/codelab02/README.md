# Swappable Bonus calculators (during runtime)

We provided you with an `Employee` class, a `BonusCalculator` interface, 
a `BonusService` and an `Application` with an executor method.

With this application, we can create employees and calculate their bonuses.
Thoroughly analyze the code:
- Notice how `Employee` has a `BonusCalculator` object 
    - `BonusCalculator` is an interface, so the actual value will be an object of one of `BonusCalculator`'s implementors.
- Notice how `BonusService` has an unfinished method
- Make sure you fully understand all the code
- Try to run the `Application` class, inspect why you're getting the message you received!
    - Again, make sure you fully understand.
    
We now want to extend our code so that it is able to select a `BonusCalculator` 
based on the year for which we want to calculate bonuses.
There should be 3 different BonusCalculators:
- One for a good year: `yearlySalary / 12 * 1.4`
- One for a bad year: `yearlySalary / 12 * 1.1`
- One for exceptional employees: `yearlySalary / 12 * 1.8`
    
Complete the `setBonusCalculatorBasedOnYear` method in BonusService using following psuedo-code:
```text
// if bonusYear is a bad year
// then
    // For every employee in employees
    //      set its bonusCalculator to the bonusCalculator for a bad year
// else
    // For every employee in employees
    //      set its bonusCalculator to the bonusCalculator for a good year
```

In `Application`, right before you call the `calculateBonuses` method on the `BonusService` object,
swap / set the `bonusCalculator` for employee `employeeDavidWhoIsExceptional` 
to the bonus calculator for 'exceptional employees'.

Run the `Application` class, inspect the result.
We've created a flexible application which can swap calculating mechanism / algorithms during runtime.
Pretty neat, right?

## CLI

This is an optional addition to this codelab. Only implement this addition of you're confident you have 
time left to - and thus will - finish the other remaining codelabs. 

To further demonstrate how flexible our bonus application is and that you can swap the calculators during runtime,
we're going to alter the `Application` class.

Hint: You'll have to use the Java `Scanner` class to read input from the console

If an Application is launched:
- It should ask the user for an employee name
- It should ask the user for an yearly salary for the employee
- Based on this data, it should create an employee
- It should then ask the user for a bonus calculator:
    
    ```text
    Dear user, please choose a bonus calculator:
    Option [1]: Good Year Bonus Calculator
    Option [2]: Bad Year Bonus Calculator
    Option [3]: Exceptional Employee Bonus Calculator
    ``` 
- Based on the option (digit 1, 2 or 3), the correct bonus calculator should be created and added to the employee
- It should then calculate the bonus of that employee and print out the result to the user.
- It should then again start with asking the user for an employee name
    - In other words, it should repeat the whole process
    - It should repeat this process infinitely until the user provides the text "QUIT" as the employee name!
    
Make the application as user-friendly as possible for the user (good feedback, clear instructions)
- Validate all the input the user provides!
    - Always validate user-input! Not all users have good intentions, and even if they have the best intentions, 
        you don't want them to crash your program by accident!
    - Let your neighbour try and crash your program (by providing unexpected input)
