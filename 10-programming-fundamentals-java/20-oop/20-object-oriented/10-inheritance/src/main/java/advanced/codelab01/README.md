# Goats of the mountain

## Goat

Create a class `Goat`, as its state it has an `age` and a `health`.
- `health` is of enum type `Health` (for you to create) which offers 3 values:
    - `GOATASTIC` (which is a fantastic health)
    - `GOATKAY` (which is an 'okay' health)
    - `GOATERRIBLE` (which is a terrible health)
    
Provide a 2-arg constructor, one arg per field.
- The age of a `Goat` can not be lower than 1, nor higher than 10.
    
Create getters and override the `toString` so that it returns **"Goat - {age} years old - doing {health}"**.

## MountainGoat

A `MountainGoat` is a special case of `Goat`.

Create the `MountainGoat` class and make it a child of `Goat`.
A `MountainGoat` has, besides its inherited state of `Goat`, no additional state.

Provide a 2-arg constructor, one arg per inherited field.
- The age of a `MountainGoat` can not be lower than 1 (like a normal goat), 
nor higher than 8. (mountain goats grow less old than normal goats).

A `MountainGoat` should have a method `climb()` which simply returns that String **"Climbing a rock..."**.

## Create instances

Create a `main` method (in a dedicated class). In it, create a `Goat` and `MountainGoat` object. Experiment with them.
- Can you let the `Goat` object climb?
- When you use `toString()` on  the `MountainGoat` object, what does it return?
