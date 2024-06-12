# Car shop

We are going to design the software for a car shop named SwitchySwitch.

Being well organised car shop SwitchySwitch has cars for everybody!

Concretely there are 3 types:
- normal cars
- sports cars
- SUV's 

You being the smart software developer that you are, know exactly how to model this problem. Inheritance!

## The cars
### Car
Let's first model the normal Car.
A car needs to have the following state:
- An identifier to identify the car.
- A model
- A color

As behaviour you can:
- Ask how many horsepower the car has. Which is "120hp" for a normal car.
- Turn on the engine. Which will print out "Vroom vroom" for a normal car.

### Sports car
Now let's model the sports car.

A sports car has the same state and behaviour as a normal car.
However instead of "120hp" it has "350hp" and print out "Brabrabrabraaa" when the engine is started. 

### SUV
Finally let's model the SUV.

A SUV has the same state and behaviour as a normal car.
However instead of "120hp" it has "200hp".

Also SwitchySwitch has some SUV's that are 4 wheel drive and others that are not. 
Your model should save that information.

## The shop
Now let's model the shop.

The model for the shop can be kept simple for now.
SwitchySwitch wants to be sure of your modelling skills before they give you more advanced features.
 
The only thing that you need to create is a method that will return a car given an identifier.
```text
shop.getCar(3) returns a SportsCar with identifier 3, model "Ferrari" and color "Red"
``` 

Put the following cars into your shop:
- A Peugeot with id: 1 and color: white
- A Volkswagen with id: 2 and color: gray
- A Ferrari with id: 3 and color: red
- A Porsche with id: 4 and color: yellow
- A Jeep with id: 5, color: green and 4x4
- A Dodge with id: 6 color: blue but not a 4x4

## Tests
You should be able to do the following things:
- get a car from the shop and ask for it's color
- get a car from the shop and ask for it's type
- get a car from the shop and ask for the amount of horsepower
- get a car from the shop and start it

## Hints
1. What is shared behaviour between Car, SportsCar and SUV? What is specific behaviour for SportsCar and SUV?
    1. Start by defining your Car class. Don't think about inheritance yet. It should contain all shared behaviour.
    1. Create your SportsCar and SUV classes.
    1. Override your methods from Car in SportsCar and SUV to specify how a SportsCar and a SUV should behave differently.
1. You can use an array of Car (Car[]) to store all the cars together.
1. The shop should contain and create all the cars, since that object also will need to return the cars.
    1. You can for example create the cars in the constructor of the shop.
    1. Try to always put creation and usage close together.

## Questions
- Why can't you ask the car if it is a 4x4 or not?
    - Is this a good or bad limitation?
- Would it be good idea to be able to ask a car to which group (normal/sports/SUV) it belongs?
