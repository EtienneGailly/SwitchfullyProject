# Shape

## Requirements

1. Create a `Shape` class that has two child classes: `Rectangle` and `Triangle`.
2. All shapes have a color (a self-created enum with colors red, blue, green and yellow as allowed values).
3. All shapes have a `getArea()` method, the default implementations is to return value 0.0
    - (ideally, we make it abstract, but that's something you have to yet learn, so don't)
4. A `Rectangle` has a length and a width.
    - For a `Rectangle`, the `getArea()` should return the area based on length and width.
5. A `Triangle` has a base (width) and a height.
    - For a `Triangle`, the `getArea()` should return the area based on length and width.
6. All shapes should have a `toString()` method.
    - By default, it returns the color
    - Additionally, for a `Rectangle`, it also returns the length and width (+ the color)
    - Additionally, for a `Triangle`, it also returns the base and height (+ the color)
    
Finally, in a `main` method. Create an array in which you store 2 `Rectangle` objects and 2 `Triangle` objects.
Then, loop over the array and call - for every object in it - the `getArea()` method (and print the result + the full object). 













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
1. Always start by writing a main method. Write it in a class called `Main` or `ShapeRunner`.
1. Implement the `Shape` class.
    1. What are it's fields? Methods? Constructors?
    1. Write the `Shape` class like you don't know about `Triangle` or `Rectangle`.
    1. Test the more important behaviour in your main method by creating a `Shape` object and calling the methods.
    1. Only start on the next part if you're 100% that `Shape` works as expected.
        1. If done correctly you shouldn't have to change anything from `Shape` anymore from here on out.
1. Extend the `Shape` class for the first time with either `Rectangle` or `Triangle`.
    1. Start by creating the class and let it extend `Shape`.
    1. Does the new class need extra fields? Which ones? Add them.
    1. Does the new class need extra behaviour? Create an extra method if necessary. 
    1. Does the new class need to change behaviour (methods) from the superclass? Override them in your new class.
        1. Go over each method in ``Shape`` and ask yourself: is this implementation different in my new class?
    1. Add some lines to your main method to test your new class. Only start on the next part when you're 100% that it works as expected.
1. Do the same for the other class.
    
