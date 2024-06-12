# Solar System

The point of this codelab is to use many of the existing methods that are available on `ArrayList<E>`.

Create class `SolarSystem` which contains (as its state) a list of all the planets (String) of our solar system.

- Create a method in `SolarSystem` to add a new planet to the solar system 
    - The planet should be added to the end of the internal list of planets
- Create a method in `SolarSystem` to insert a new planet to the solar system at a specific position (index).
    - The planet should be inserted, using the provided index, into the internal list of planet
    - All the other planets in the list with the same or a higher index than the one provided should be shifted to the right.
    - E.g. `{"Earth", "Mars", "Venus"}` --> insert Jupiter on index 1 --> `{"Earth", "Jupiter", "Mars", "Venus"}`
- Create a method in `SolarSystem` to remove a planet from the solar system
    - The planet should be removed for the internal list of planets.
- Create a method in `SolarSystem` to replace a planet at a specific index with another planet.
- Create a method in `SolarSystem` to swap two planets in the list based on their index.
    - (This method is not available on `ArrayList<E>`, you'll have to create something yourself)
- Create a method in `SolarSystem` to reverse the current order of the planets in the list.
    - Search the Java docs for class `java.util.Collections`, method `reverse`
- Create a method in `SolarSystem` to properly print all the planets from the list.

Finally, create a `SolarSystem` object, add some planets to it and call some of its methods. Print the results.