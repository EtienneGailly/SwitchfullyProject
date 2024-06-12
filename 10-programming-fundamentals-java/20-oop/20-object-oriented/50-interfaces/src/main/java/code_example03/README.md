# 1 Duck problem, 3 possible solutions

## Duck V1

### Where inheritance can fail

Reference: Head First - Design Patterns (page 2 - 5)

> Using inheritance solely for the purpose of reuse can lead to difficult to maintain code that is highly coupled and not that flexible.

## Duck V2

### Interfaces to the rescue, or not?

By removing the `fly` and `quack` behavior from `Duck` and placing it in dedicated interfaces, we can get rid of the
issues we had with these behaviors in `RubberDuck` and `DecoyDuck`.

However, we now have a problem of duplicate code...
So, did we solve one problem to create a new one?

## Duck V3

### Composition to the rescue! Or is it more than just composition?

> Identify the aspects of your application that vary and separate them from what stays the same.

`fly()` and `quack()` are the parts of our `Duck` class that vary across different kinds of Ducks.
To separate these behaviors from the Duck class, we'll pull both methods out of the Duck class and create a new set
of classes to represent each behavior.

Our latest solution allows for:
- New types of Ducks to reuse fly and quack behaviors
- Adding new behaviors without **explicitly having to** modify any of our already existing behavior classes or 
touching any of the Duck classes that already use (e.g.) flying behavior.

So, with our latest solution, we get the benefit of **reuse** without all the baggage that comes along with inheritance.
However, do realize that in our latest solution we used more than just composition, we used:
- Inheritance (abstract class Duck that is extended)
- Interfaces
- Composition
- Polymorphism
