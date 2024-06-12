# CoolEmployee

## Creating the CoolEmployee class

It should have the following state:
- id (int)
- firstName (String)
- lastName (String)
- salary (int)

It should have one constructor which you pass the following arguments:
- id
- firstName
- lastName
- salary

For each field, create a method that returns the (value of the) field:
- id
- firstName
- lastName
- salary

Additionally, also create methods that returns the following values.
- annual salary (monthly salary * 13.9)
- full name (firstName + lastName)

Create the following methods, which set / modify the following values
- A method to set the salary to a provided value
- A method to raise the salary by the provided percentage value

Create a method to get the textual representation of CoolEmployee
- Tip: there is a Java specific method for this (that we can override)

## (Extra: this will let the tests fail, so remove this after you finish) Unique ID's

Try to come up with a way to always have a unique ID.
- The first CoolEmployee that's being created should get ID = 0
- The second, ID = 1
- The third, ID = 2
- etc...

If your program gets restarted, you can start again with 0.

Tip: maybe already check the slides on `static class members` to solve this unique ID's issue... ;)

## equals and toString
Override both the equals and toString methods.
- The equals method should only check for equality based on the ID's. If 2 ID's match, 
the 2 CoolEmployee objects are equal.
- The toString method should return a String containing 
the following text: "({id}) {firstName} {lastName} - {salary} EUR / month"
