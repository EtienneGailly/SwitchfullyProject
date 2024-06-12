# It's person(al)

Create a `Person` class which provides the method `calculateAllowance()`. 
This is a method we can use to calculate the allowance a person should receive. 

The formula (to calculate the allowance) is described as follows: 
- When a person is between 0 and 12 (including 12) years old, they receive an allowance of 100 euro. 
- When a person is 13 year or older, but younger than 18, they receive an allowance of 100 euro +  
5 euro per year of age exceeding the age of 12.
- when a person is 18 years or older, he is considered an adult and does no longer receive an allowance (allowance should be 0)

For example:
- A person of age 10 will receive 100 euro allowance.
- A person of age 12 will receive 100 euro allowance.
- A person of age 13 will receive 105 euro allowance.
- A person of age 17 will receive 125 euro allowance.
- A person of age 18 will receive 0 euro allowance.
        
Method `calculateAllowance()` should not accept any parameters. 
Thus, if certain data is required to perform the calculation, make sure it is part of the state of `Person`.

