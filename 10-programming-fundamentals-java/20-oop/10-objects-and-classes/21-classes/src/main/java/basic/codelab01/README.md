# Alien

> **Student:** A `README.md` file? What is that?

As of now, most (if not all) assignments will be written down and provided in a `README.md` file. The name `README` is 
a conventional title you give to a file which you wish other developers to read ("read me"). It usually contains 
installation instructions, a description and other useful information for an application / codebase.

Readme files can be delivered as plain text (e.g. `README.txt`), however, we decide to write them using MarkDown (`.md`). 
Markdown is a popular lightweight markup language (E.g. wrapping a text in ** will render it in **bold**).

To view the rendered Markdown, install the `Markdown Support` plugin for IntelliJ
- Press `ctrl` + `shift + `a`, type in plugins, click on plugins, search for `Markdown Support`, install.
- Alternatively, GitHub has built-in Markdown support. If you use GitHub to navigate to this `README.md` file, you'll 
see it in the rendered format.

## Class

Create a new class `Alien` that has the following instance variables (which form a Person's state):
- a firstName (think about which type it should have)
- a lastName (think about which type it should have)
- numberOfHeads (think about which type it should have)
    - FYI: aliens can have more than 1 head

## Encapsulation

Make sure you properly encapsulate these instance variables. 
They should only be visible and thus usable inside the `Alien` class, not outside.

## A Class to Execute

1. Create a new class, call it `AlienApplication`.
2. Inside of this class, create a `main` method.
3. Inside of the `main` method, do the following:
    1. Create a new Alien instance (object), using the `default constructor` and store it in a variable called `zappyTheAlien`.
    2. Print `zappyTheAlien` to the console.
        - It should print something like `warmup1.Alien@g4f5gc5` when you let Java execute the `main` method
            
## Constructors

Create the following constructors:

1. A constructor that takes no arguments.
    - field (a.k.a. Instance variable) `firstName` should be set to value `"Unidentified"` 
    - field (a.k.a. Instance variable) `lastName` should be set to value `"Unidentified"`
    - field (a.k.a. Instance variable) `numberOfHeads` should be set to value `1` 
2. A constructor that takes a `firstName` and `lastName` as an argument
    - field (a.k.a. Instance variable) `firstName` should be set to parameter `firstName`
    - field (a.k.a. Instance variable) `lastName` should be set to parameter `lastName`
    - field (a.k.a. Instance variable) `numberOfHeads` should be set to value `1`
3. A constructor that takes a `firstName`, `lastName` and `numberOfHeads` as an argument
    - field (a.k.a. Instance variable) `firstName` should be set to parameter `firstName`
    - field (a.k.a. Instance variable) `lastName` should be set to parameter `lastName`
    - field (a.k.a. Instance variable) `numberOfHeads` should be set to parameter `numberOfHeads`
    
## Create some more instances (objects) of Alien

1. Go back to your `main` method in `AlienApplication`
2. Create a new Alien instance (object) for which you provide a `firstName` ("Blyub") and `lastName` ("Wilziax") and store the instance in a variable called `blyubTheAlien`.
3. Create a new Alien instance (object) for which you provide a `firstName` ("Kujlu"), a `lastName` ("Krak") and a `numberOfHeads` (3) and store the instance in a variable called `kujluTheAlien`.
4. Print `blyubTheAlien` (an instance of `Alien`) to the console 
5. Print `kujluTheAlien` (an instance of `Alien`) to the console

## Full name

1. Inside the `Alien` class, create a new method called `getFullName()`.
    - It should return a single `String` containing the concatenation of instance variables `firstName` and `lastName`
2. In your `main` method, call this new method on each of the `Alien` instances and print the result:
    1. Call method `getFullName()` on `zappyTheAlien` (an instance of `Alien`) and print the result that is returned by `getFullName()`
        - It should print something like: `"Unidentified Unidentifed"`
    2. Call method `getFullName()` on `blyubTheAlien` (an instance of `Alien`) and print the result that is returned by `getFullName()`
        - It should print something like: `"Blyub Wilziax"`
    3. Call method `getFullName()` on `kujluTheAlien` (an instance of `Alien`) and print the result that is returned by `getFullName()`
        - It should print something like: `"Kujlu Krak"`
        
## Get the heads

1. Inside the `Alien` class, create a new method called `getNumberOfHeads()`.
    - It should return the instance variable `numberOfHeads` of the current instance on which the `getNumberOfHeads()` is called.
2. Inside the `main` method of `AlienApplication` call  the `getNumberOfHeads()` method on the `Alien` instance `kujluTheAlien`
    - Store the result in a variable called `theHeadsOfKujlu`
    - Then, print this variable to the console like this `"Alien Kujlu has X heads"`
        - (You should replace `X` with `theHeadsOfKujlu`)   

 

 
