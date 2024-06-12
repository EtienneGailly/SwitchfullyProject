# TDD FizzBuzz

For every requirement (you can even split requirements up into smaller bits):
1. Write a test
2. Run the test, see it fail
3. Let your pair implement a solution to fix that test (nothing more, quick and dirty!)
4. Run the test, it should succeed
5. Refactor (if needed)
6. Repeat step 1, but switch roles. 

Repeat this process until the requirement is completely tested (happy path & boundary tests) and fully implemented.
Only then go to the next requirement

Remember to keep the XP practices in mind:
- Pair programming
- Good tests
- Incremental design

Tip: In the end, you should have just one method that incorporates all the different requirements. 
It's possible that a knew requirement breaks parts of a previous requirement. 
If so, just know that later requirements get priority over earlier requirements.

## Requirement 1
Create a method that accepts a number as argument and returns an array of numbers containing 1 to X where X is the provided argument

## Requirement 2
If X is <= 1, throw an IllegalArgumentException with a custom message

## Requirement 3
Return "Fizz" instead of the actual number when the number is divisible by 3
- Before requirement 3: `Given: x = 3 --> Returns [1, 2, 3]`
- After requirement 3: `Given: x = 3 --> Returns ["1", "2", "Fizz"]`

## Requirement 4
Return "Buzz" instead of the actual number when the number is divisible by 5
- Before requirement 3: `Given: x = 5 --> Returns [1, 2, 3, 4, 5]`
- After requirement 3: `Given: x = 5 --> Returns ["1", "2", "Fizz", "4", "Buzz"] `

## Requirement 5
Return "FizzBuzz" instead of the actual number when the number is divisible by both 3 and 5