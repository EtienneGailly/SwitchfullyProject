# Sheep Shipping

Listen closely, as we've found the next-big thing. We present an Online... Sheep...Ordering... Service (OSOS).

It's basically a webshop where you can buy living sheep. Can't have enough sheep around, am I right?

##  Sheep

Create a class `Sheep`. A sheep has a nickname, a price and a color (which can only be black or white!).
- Make it as easy as possible to create a sheep with a nickname, price and valid color. 

At any time, we should be able to call a **method** (named `amountOfActiveSheep`) that returns us the amount of active (in memory) `Sheep` objects.

A sheep can have any nickname except "Dolly" (case insensitive). Make sure to assert this!

Override the `toString` method so that it returns: 
- "I'm a sheep named {nickname} (which is not Dolly) and I'm not white" *(if the sheep is black)*
- "I'm a sheep named {nickname} (which is not Dolly) and I'm white" *(if the sheep is white)*

## OrderService

Create a class `OrderService`, it's the class that offers (as a service) the functionality for ordering Sheep.

Create a method `orderSheep` that accepts a `Sheep` object as an argument (the sheep to order). The method returns the 
total cost of the sheep.
- The total cost is calculated as follows: `price of sheep + order fee`.
    - The order fee is a fixed price of 5 (euro).
    
Create a method `orderFeeAsText` that returns the following String: "The order fee is {order fee}".

## Execute

Make some Sheep objects and use them with the `orderSheep` method of class `OrderService`. Make sure to also work with 
the other available methods.
- Based on your implementation, do you need an instance of `OrderService` in order (pun intended) to call the `OrderSheep` method (among others)?

## Validate your solution

Done with your solution? Great, read on.

Not done with your solution? Great as well, but don't yet read on please.

Validate whether the following statements are true in regards to your solution (code):

- In class `Sheep`, you should have used at least one constant and one static field.
- In class `Sheep`, you should have used at least one static method, but - technically - you are not required.
- In class `OrderService`, you could have used two static methods, but - technically - you don't have to.
- In class `OrderService`, you should have used a constant.

Questions? Ask them!




