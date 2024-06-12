# Recursive functions

A method that is declared in a class can be called from everywhere in that class.
So a method can also be called from within his own body!
Methods that call themselves are called **recursive functions**.

## An example
```java
public class Recursive {

   public int getANumber(int startingPoint) {
      if(startingPoint > 10) {
         return 10;
      }
      return getANumber(startingPoint + 1);
   }
}
```

## Rules
Recursive functions are fairly simple and contain typically two parts.
1. The top part of a recursive function is the **stopping condition**.
   * Because if you don't have a stopping condition your recursions (repetitions) will never stop.
2. The second part is the **recursion part**.
   * Here you'll do some calculations and finally call yourself again.

That's it you're now ready to create your own recursive functions.

## Warning!
While some language are meant to work with recursions, java isn't.
The number of recursions is always limited in java.
If you do too much recursion, you'll get a **StackOverflowException**.
But don't worry as long you keep the repetitions under 7000 you should be fine.

## Extra exercises
Done with the exercises? You can find more on: https://codingbat.com/java/Recursion-1

