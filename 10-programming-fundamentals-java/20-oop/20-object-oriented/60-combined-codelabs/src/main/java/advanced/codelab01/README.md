# Bus refuel

## Bus

Create a `Bus` class that has an id, capacity and cost.
- For the id, use `UUID.randomUUID()`
    - [Java's UUID class](https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/UUID.html)
    - [UUIDs](https://en.wikipedia.org/wiki/Universally_unique_identifier)

## LiquidFuel

Create an interface `LiquidFuel` which defines `getEmission` and `fillWithFuel`.
- Remember you can't define instance attributes/variables/fields inside of an interface!

## ElectricFuel 
Create an interface `ElectricFuel` which defines `getVoltage` and `recharge`.
- Remember you can't define instance attributes/variables/fields inside of an interface!

## More than one Bus
Create 3 different Bus classes (not objects): one that's entirely electric, 
one that only uses liquid fuel and one that's a hybrid.

## Service Station

Create a `ServiceStation` class that has 2 methods:
- One for filling up a bus that runs on electric
    - The bus is provided as an argument
    - It should also work for the hybrid bus
- One for filling up a bus that runs on liquid.
    - The bus is provided as an argument
    - It should also work for the hybrid bus

Filling up output:    
- Filling up an electric bus will return: "Recharging my batteries!"
- Filling up a liquid fuel bus will return: "Filling up my tank!"
- Filling up a hybrid bus will return: "Filling up my small tank! Filling up my small batteries!"

## Service Station Extended

Create a method in `ServiceStation` that's able to operate on any bus, and refuels it!

- Given an electric bus, this method will return: "Recharging my batteries!"
- Given a liquid fuel bus, this method will return: "Filling up my tank!"
- Given a hybrid bus, this method will return: "Filling up my small tank! Filling up my small batteries!"
