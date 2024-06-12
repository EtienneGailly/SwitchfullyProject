# Self evaluation 1 

This self evaluation is created for the purpose of self reflection and to match your current level 
of programming against our expectations. 

You will have 2 dedicated days to complete it. 
Should that not be enough, we expect you to finish it after-hours / over the weekend.

This self evaluation is in no means a 'classic' test in which the received grades are the most important aspect.
Therefore, the self evaluation will not be graded in a numerical way. However, you will receive extensive feedback 
on your solutions which you should review in-depth!

You should be able to correctly complete the theoretical questions and the codelabs, 
although some looking-up and tinkering might be necessary. 

It is our expectation that you should understand most of the questions and should be able to solve all the codelabs.
Should you feel like you're struggling heavily with every codelab, make sure to address this. We will be more than happy 
to see how - and help you - to get you back on track as soon as possible!

**The process is more important than the goal**, don't simply copy/paste (theoretical) answers or solutions from the internet. 
Make sure you truly understand what you're doing! Try to work as autonomous as possible.

## Theoretical questions

Do always (try to) come-up and formulate an answer first, 
only then search for additional information, should you be unsure of your answer, to improve your knowledge.

Answer the questions inline, like the example below:

1. **If this is the question**
    - Then this should be your answer (don't forget to tab and prefix with `-` or `*`)

In **this file**, please fill in a check mark `x` in every checkbox `[ ]` when you have created a solution for it (so that it becomes `[x]`).
Please do this after each finished codelab. It will help us in keeping track of your progress.

### Questions Basic
1. - [ ] **What kind of types are there in Java?**
2. - [ ] **What does 'declaring and initializing a variable' mean?**
3. - [ ] **What is a statement? What is an expression? What is an operator?**
4. - [ ] **What is `casting`? E.g. "I'm casting the value to an `int`"**
5. - [ ] **What is the signature of a method?**
6. - [ ] **What is method overloading?**
7. - [ ] **What is method overriding (OOP)?**
8. - [ ] **What is meant with "arguments are passed-by-value"?**
9. - [ ] **Of what types can we create an array?**
10. - [ ] **Can the size of an array change after instantiation?**
11. - [ ] **What is the main difference (in use-case, not structure) of an If/Else statement and a Switch statement?**
12. - [ ] **What is the main difference between primitive data types and reference types in Java?**
13. - [ ] **What is the main difference between a While and Do-While loop (in execution, not structure)?**
14. - [ ] **What is the main difference between a For and Foreach loop (in use-case, not structure)?**
15. - [ ] **A variable declared within the opening and closing parenthesis of a method is called a ____ variable?**
16. - [ ] **Why would you choose `long` over `int`?**
17. - [ ] **What's the difference between `long` and `float`?**
18. - [ ] **What value (`1/2` or `0.5` or `0`) will be printed for the following code? `System.out.println(1/2);`? Explain why?**
19. - [ ] **What is the difference between `.java` and `.class` files?**
20. - [ ] **What is the output of following code?**
```java
boolean isTrue = true;
if(isTrue != false){
    System.out.println("It is true");
}
System.out.println("It is false");
```

### Questions OOP
1. - [ ] **The term "instance variable" is another name for ___ ? And, what is it exactly?**
2. - [ ] **The term "class variable" is another name for ___ ?**
3. - [ ] **What are parameters?**
4. - [ ] **What are arguments?**
5. - [ ] **What is the return type void?**
6. - [ ] **What's an object? What's a class?**
7. - [ ] **What's state? What's behavior?**
8. - [ ] **What is an instance?**
9. - [ ] **How do we create an object from a class?**
10. - [ ] **What is the value `null`? What types can hold `null`?**
11. - [ ] **What is an object reference?**
12. - [ ] **What is data encapsulation? What role do the access modifiers play in it? Provide all access modifiers.**
13. - [ ] **What is a constructor?**
14. - [ ] **What is the default constructor?**
15. - [ ] **What is a package? Why do we use them?**
16. - [ ] **What is an enum and when should you use one?**
17. - [ ] **What's the difference between a static method and an instance method?**
18. - [ ] **What is a constant?**
19. - [ ] **What is inheritance? Why is it useful? Give an example.**
20. - [ ] **What is composition? Why is it useful? Give an example.**
21. - [ ] **What is polymorphism? Why is it useful? Give an example.**
22. - [ ] **What is meant with the sentence 'Class A extends / inherits from Class B'?**
23. - [ ] **What is the difference between a (parent) class and an (abstract) parent class?**
24. - [ ] **What's the difference between an abstract class and an interface?**
25. - [ ] **What is meant with the sentence 'Class A implements (interface) A'?**
26. - [ ] **How does an object gets 'destroyed' and thrown out of the memory?**
27. - [ ] **What is the `Object` class?**
28. - [ ] **To invert the value of a boolean, which operator would you use?**
29. - [ ] **What is casting? explain widening/upcast and narrowing/downcast.**
30. - [ ] **What does the `final` keyword do?**
31. - [ ] **What is the difference between `==` and `equals`?**

## Hands-on

For every codelab, a package `codelab{n}` has been created.
It's your starting location for implementing the assignment.

The assignments themselves are written down in this file, in the following sections. 

Sometimes, tests have been written to validate your solution. Use (run) them.  

### Codelab 01
1. - [ ] Create a method that prints the string "Hello World!"
2. - [ ] Create a method (`printAny`) that prints any string you give it.
3. - [ ] Using method overloading, create two methods with the same name (`printNumber`).
    - Both have one parameter.
    - Both should print a message, although the message differs based on the type (int or double):  
        - `I'm an int: {parameter}` in case of the actual argument being of type `int`.
        - `I'm a double: {parameter}` in case of the actual argument being of type `double`.
4. - [ ] Create a method that returns the number it receives plus 1
    - E.g. 4 is provided as an argument, then value 5 is returned

### Codelab 02
1. - [ ] Create a method that returns an array with all the letters of the alphabet.
    - Check the test to see what is required exactly.
        - E.g. is it required to include both lower and upper-casing characters?
    - Run the tests (before and after having implemented your solution) 
2. - [ ] Create a method that replaces the 3th element of a String[] array by "do".
    - Run the tests (before and after having implemented your solution) 
    - Think about edge cases: empty array, null,... 
        - Test scenario's:
          - `["we", "can", "work", "it"]` --> `["we", "can", "do", "it"]`
          - `["you", "should", "work", "it"]` --> `["you", "should", "do", "it"]`


### Codelab 03
1. - [ ] Create a method that generates a 2D pattern (as a 2D array) based on a provided size (parameter).
2. - [ ] Call the method and loop over the 2D array to print its contents to the console.
3. - [ ] Based on the examples below, the pattern should be clear.
4. - [ ] Run the tests (before and after having implemented your solution)

Some examples (size = 2), printed to the console
```text
@@
@@
```

Some examples (size = 3), printed to the console
```text
@@@
@ @
@@@
```
 
Some examples (size = 4), printed to the console
```text  
@@@@
@  @
@  @
@@@@
```

Some examples (size = 5), printed to the console
```text   
@@@@@
@   @
@   @
@   @
@@@@@
```

### Codelab 04
1. - [ ] Create a method that returns the month in English by its number.
    - Run the tests (before and after having implemented your solution.
        - The tests will also show what the exact requirements are!
2. - [ ] Create a method that takes in a number of elements and calculates a price based on the following rules:
    - The first 10 elements costs 5 euro each.
    - The following 5 elements costs 4 euro each.
    - Every next element costs 3 euro each.
    - A negative amount of elements will return 0
    - Run the tests (before and after having implemented your solution
        - Test scenario's:
          - amountOfItems == 1, then price == 5
          - amountOfItems == 0, then price == 0
          - amountOfItems == 9, then price == 45
          - amountOfItems == 10, then price == 50
          - amountOfItems == 11, then price == 54
          - amountOfItems == 15, then price == 70
          - amountOfItems == 16, then price == 73
          - amountOfItems == 20, then price == 85
          - amountOfItems == -1, then price == 0
3. - [ ] Create a method that returns the following:
    - When the input is 1: "It's something"
    - When the input is 2: "That's more like it"
    - When the input is 3: "Way to go"
    - Other input: "That's a fail whale"
    - Run the tests (before and after having implemented your solution   

### Codelab 05

1. - [ ] Create an `Alarm`.
2. - [ ] Make sure we can use a no-arg constructor and an single argument (the sound to make) constructor. By default, 
the sound to make is "BEEP". 
3. - [ ] The `makeSound` method(s) should return an array containing x-times the sound to make.
    - We should be able to provide x, although it should not be required.
    - If x is not provided, the returned value should contain the 'sound to make' 3 times.
        - 3 is the default amount of times to make a sound.

### Codelab 06

We're going to program a (French) deck of cards.

French decks come in a variety of patterns and deck sizes. We're going for the most popular 52-card deck. 
It includes 13 ranks of each suit. There are four suits: hearts, spades, diamonds and clubs. 
Each suit includes an ace, a king, queen, and jack, and numbers two through ten. 

Commercial packs often include between one and six jokers, most often two. 
But we will not include them in our solution!

1. [ ] Create a class that represents a single playing card.
2. [ ] Create a class that represents a deck of (52) cards.
    - After creating a deck of cards object, it should hold 52 cards.
    - However, it should also be possible to create a deck of cards object for which 
    we provided (as an argument) the cards (possible not 52 cards).
    - It should be possible to check whether a certain card (argument) is part of the deck of cards.
    - It should be possible to get a textual representation of the entire deck of cards.
3. [ ] Write a small executable program in which you create a deck of cards and check whether a certain card is part of it. 

### Codelab 07

1. - [ ] Write a `Dog`, `Labrador` and `Chihuahua` class.
2. - [ ] All dogs have a name and can bark
    - The actual barking sound is specific to the breed of dog.
        - A labrador has as its barking sound value "WOOF WOOF!"
        - A chihuahua has as its barking sound value "Kefkefkef!"
    - The name is specific to the actual instance of a dog.
3. - [ ] All dogs also have an average breed weight
    - The actual value for the average breed weight is specific to the breed of dog.
        - A labrador has as its average breed weight, value 35 (Kg).
        - A chihuahua has as its average breed weight, value 2 (Kg).
    - We should be able to let every dog bark
    - We should be able to **get** the average breed weight for every dog
    - (It should not be possible to create instances of `Dog` itself)

4. - [ ] Chihuahuas also have a color field, it can be either Brown, Black or White.
5. - [ ] Override the `toString` method, it should contain the entire state of every dog.
    - For a labrador: "Labrador: (name = Labby, sound = WOOF WOOF!, average breed weight = 35)"
    - For a chihuahua: "Chihuahua: (name = Darling, sound = Kefkefkef!!, average breed weight = 2, color = Brown)"
6. - [ ] Override the `equals` method: two dogs are equal if they have the same name and make the same sound.

### Codelab 08

1. - [ ] All birds have a beak size, it can be small, medium or large. Furthermore, it should be possible to **get** this beak size.
    - Eagle is a specific type of bird, an eagle has a large beak size.
    - Pigeon is a specific type of bird, a pigeon has a medium beak size.
    - Dodo is a specific type of bird, a dodo has a large beak size.
    - (any future new specific types of bird will also have a beak size)
    - (creating an instance of a (non-specific) bird should not be possible)

2. - [ ] Most birds can **fly**, but not all! Eagle and Pigeon can fly, a Dodo can not.
    - When we let an eagle fly, it should return textual value "I'm soaring through the sky!"
    - When we let a pigeon fly, it should return textual value "Flap flap... oeh, look, breadcrumbs!"
    - It should be impossible to let a dodo fly (they're fly-less birds!)

3. - [ ] For all the specific birds that can fly (eagle and pigeon), we should also be able to get the maximum altitude it can fly.
    - The maximum altitude is specific to a single instance (so 2 eagle birds can have a different maximum altitude). However, 
    there is a range per bird type.
        - Eagles should have a maximum altitude between 4.000 and 5.000 meters (both including). 
        - Pigeons should have a maximum altitude between 500 and 750 meters (both including).
        - Dodo's do not have the concept of a maximum altitude (as they don't fly...) 

4. - [ ] Finally, create a `Sky` class. It should have a class - not instance - method 
that accepts (as an argument) an array of birds that can fly (only!).
    - Let this method loop over the array and let it call, each bird's fly method.
    - Each time, print the value returned by the fly method to the console.

### Codelab 09

Let's design - in code - a Laptop.

1. - [ ] Our `Laptop` class consists of a screen, a storage device, RAM, a processor and peripheral devices (keyboard, mouse,...)
    - Make sure that each of these components are represented by some obvious state and have some useful behavior.

2. - [ ] A screen can be either an LCD screen or LED screen (and in the future, who knows what else...)
    - Possible state: resolution, color, brightness,...
    - Possible behavior: dim (brightness),...

3. - [ ] A storage device can be either HDD or SSD (and in the future, who knows what else...)
    - Possible state: speed, size,...
    - Possible behavior: storeData,...

4. - [ ] A processor can have 3 different modes: energy-saving, normal and overclocked. 
    - It should be possible to let a processor switch from its mode (during runtime)
        - E.g. from energy-saving to normal
    - Possible behavior: processInstructions,...

5. - [ ] It should be possible to **get** both the active and idle energy consumption of all screens, storage devices and processors.
    - Energy consumption can be written in kilowatt hour (kWh).

6. - [ ] keyboard and mouse are both peripheral devices. A laptop can have up to 5 peripheral devices.
    - All peripheral devices should have a method to use them. But based on the specific peripheral, using it means something else.

7. - [ ] Finally, create an instance from `Laptop` and interact with it (maybe also print it to the console?).

Think about your design (simply think about these questions):
- When and where do we need (or can use) inheritance?
- When and where do we need (or can use) abstraction?
- When and where do we need (or can use) composition?
- When and where do we need (or can use) interfaces?
- When and where do we need to create additional concepts (classes, enums,...)
    - E.g. is resolution a concept which we can or should create?
    
## Finished? 
1. Ask feedback on your solutions
2. Review the solutions from the `solutions` branch
3. Complete all uncompleted codelabs from modules `10-basics` and `20-oop`.
4. Start / continue with Rowdy Racers
