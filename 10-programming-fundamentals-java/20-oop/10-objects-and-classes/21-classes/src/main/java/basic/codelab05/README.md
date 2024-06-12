# MyCircle

## Create MyCircle class
Start by creating a `MyCircle` class.

Place this class in its own package, call it `shapes`.
It will hold the `MyCircle` shape and any future shapes...

It should have the following fields (/ instance fields / attributes / properties / state):
- radius (double)
- color (String)

It should have the following constructors:
- A no-argument constructor which sets the radius to 1.0 and the color to "blue"
    - Let this constructor call the second constructor, providing value 1.0 for the radius!
- A constructor with radius as argument, the color should be set to blue
    
It should have the following instance methods / state:
    - `getRadius()` which returns the value of radius
    - `getArea()` which returns the area of a circle
    - `setColor()` which takes a color as a parameter and assigns it to the color instance variable (but doesn't return it)
    - `getColor()` which returns the color

## MyCircleApplication

Create the `MyCircleApplication` class. It will contain the `main` method.

Place this class directly in the current package, not in (sub)package `shapes`. 

Firstly:
1. Declare an instance of `MyCircle` class called `c1`.
2. Construct the instance by invoking the "default" constructor which sets its radius and color to their default value.
3. Print out the radius, area and color in a fun sentence

Secondly: 
1. Declare an instance of class `MyCircle` called `c2`.
2. Construct the instance by invoking the second constructor with 8.5 as radius and default color. 
3. Print out the radius, area and color in a fun sentence

Make sure to not duplicate the code required for the third step in both (printing).
How can we reuse this code and write it once, but use it twice?
  
    