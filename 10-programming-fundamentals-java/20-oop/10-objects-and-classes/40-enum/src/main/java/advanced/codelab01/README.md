# Traffic light

Let's do something with traffic lights! 

## TrafficLight and Enums...

Create a class named `TrafficLight`. A traffic light has two fields: a status and a color.
- Field `status` is of the enum type `TrafficLightStatus`
- Field `color` is of the enum type `TrafficLightColor`

Provide a constructor that has a `TrafficLightStatus` and `TrafficLightColor` parameter. 

Create enum `TrafficLightColor` it contains 3 values: `RED`, `ORANGE` and `GREEN`.

Create enum `TrafficLightStatus` it contains 2 values: `PRISTINE` and `DAMAGED`.

Class `TrafficLight` should have a method for changing the status to another provided (argument) `TrafficLightStatus` value.

### It's all about that ba... color

Class `TrafficLight` should have a method for changing the color to another `TrafficLightColor` value.

But, it should be impossible to switch from GREEN to RED or from RED to ORANGE.
- Enforce this requirement in the `TrafficLightColor` enum, not in the `TrafficLight` class!

### Possible colors

Create a method called `allTraficLightColors` in class `TrafficLights` that return a String containing all the possibles values of `TrafficLightColor`.
- E.g. "The possible traffic light colors are: Red, Orange, Green."

Should a new color be added to `TrafficLightColor`, the `allTraficLightColors` should automatically include that new color 
(make sure it's dynamic and not hard-coded).

### Extra challenge

(this one is optional, but interesting...)

In enum `TrafficLightColor` rename values `RED`, `ORANGE` and `GREEN` to `RED`,`RNG` and `GRN` (which are bad names, so never do it this except in this codelab).

Now, your challenge: make it so that method `allTraficLightColors` still returns "The possible traffic light colors are: Red, Orange, Green."
- You'll have to make a small change in the `allTraficLightColors` method, but the main change will have to occur in enum `TrafficLightColor`.
    - Make sure that `allTraficLightColors` is able to work with new `TrafficLightColor` values automatically.



