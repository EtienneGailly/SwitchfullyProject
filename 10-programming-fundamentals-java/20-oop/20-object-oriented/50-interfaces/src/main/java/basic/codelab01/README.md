# Make some poly-sound, again!

## Wait? This one again?

Jup, you already did this one. However, redo this codelab, 
but this time, make use of an interface!

Since there is not much a `Cat` and a `Computer` have in common, besides the sound functionality / behavior, 
an interface is much more suited here than an abstract class.

## Let's do it again!

When you look at the `SoundService`, you'll notice the `allMakeSound` method is **overloaded** (not overrided) a couple of times.
In total, we have 4 versions of the `allMakeSound`, which do exactly the same, they only differ in their argument type.

Also notice how `Baby`, `Cat`, `Dog` and `Computer` all have a method `makeSound` which 
returns a textual representation of the sound they make.

Come up with a design to refactor the code (with an interface) in such a way that we only need one `allMakeSound` method 
that accepts `Baby`, `Cat`, `Dog`, `Computer` an `Car`. 

Change the code so that **polymorphism** is used so that we only need one `allMakeSound` method. 
Remove the others. The tests should still work in the end.

When done, you'll have an implementation that is more powerful, 
more flexible and cleaner than the previous implementation.

To demonstrate this:
- Create a `Piano` class (in such a way that it also has a `makeSound` method)
- In the `SoundService`, your  `allMakeSound` method should be able to work with `Piano` objects without 
you having to change anything to the `SoundService` class. **#Flexible**!
