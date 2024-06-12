# CustomTime

> Immutable objects and pure methods

1. Run the tests.
    - They will fail (or some will)
2. Remove the existing equals method.
    - Go to menu Code > Generate, pick equals() and hashCode(). Hit next a few times (the defaults are fine).
    - You can ignore the hashCode() function for now.
3. Study the generated equals method and explain to yourself what it does.
4. Run the tests again, they should all be green.
    - Do you understand why that is?
5. Change the `add(CustomTime other)` method so that it becomes a pure method!
     Hint: No idea on what pure and impure methods are? 
     Read the sections on **Immutable and mutable objects** 
     and **Pure and impure methods** below!

Then, go online and read the documentation of `java.awt.Rectangle`.
- Find a method which is pure? Find one which is a modifier (impure)?
- Discuss with someone!

Afterwards, review the documentation of java.lang.String.
- Why can we say String is an immutable class (tip: look at the class definition)?
- Discuss with someone!

## Immutable and mutable objects
In object-oriented and functional programming, an immutable object 
(unchangeable object) is an object whose state cannot be modified after it is created.
This is in contrast to a mutable object (changeable object), which can be modified after 
it is created.


## Pure and impure methods
You may not have noticed, but the way that we have implemented our `add` method, 
has turned our immutable object and made it mutable. 
There is now a way to modify the time object after it was created. 
This might not be an issue right here and now, but in practice, mutability adds complexity, 
complexity leads to problems, and problems lead to the dark side.

The `add` method as it is defined now is called an impure (or mutator) method because it 
changes the state of the object by modifying its attributes. 
The alternative is called a pure method, because it doesn't change the state of the object 
on which it is invoked, but rather returns the result of the modification to the caller.
