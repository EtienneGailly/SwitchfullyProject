# Battle sim.

Design and implement a battle simulator service.

## Soldier

- A Soldier has a name, age, weapon and armor
- A Soldier has different types:
    - Archer
    - Swordsman
    - Pikeman
    - Axethrower
    - Slave
- A Weapon has a name, attacking power and a variable stating if its a one- or two-handed weapon
- A Weapon has different types:
    - Sword (high attacking power, one-handed)
    - Bow (medium attacking power, two-handed)
    - Pike (very high attacking power, two-handed)
    - Axe (medium attacking power, one-handed)
    - Dagger (low attacking power, one-handed)
- An Armor has a name and defending power
- An Armor has different types:
    - Strong armor (high defending power)
    - Medium armor (medium defending power)
    - Low armor (low defending power)
    - No armor (zero defending power)

Think about where you want (or have) to use inheritance and composition.
Are you using an `enum` or not?

## Army

- An army has a name and soldiers (Soldier objects)
- An army should have the following behavior
    - get the total attacking power of the army
    - get the total defending power of the army
    - get the total amount of soldiers in the army
    - merge armies: takes 2 armies, merges their soldiers and returns a new army
        - Question: Class or Instance method?
        
## Battle Simulator Service
        
A battle simulator service (`BattleSimulatorService`) has no state, but it does provide the following behavior:
- a Method to run the application
- fight, which takes 2 armies (an attacking and defending army) and returns the victorious army
    - If the attacking army is double the size (or even bigger) than the defending army, it automatically wins.
    - If the attacking army is half the size (or even smaller) than the defending army, it automatically loses.
    - Otherwise, if the combined attacking power of the attacking army is 1.2 times the combined defending power of the defending army,
    the attacking army wins. Otherwise the defending army wins.
      
## Execute
        
Create some armies and let them fight using your battle simulator application. 
Ave, Imperator, morituri te salutant!

## For the brave (optional)

In your `Army` class, print out a status report of the army, containing an overview of:
- The different type of soldiers present in the army
- Per soldier type, the total amount of soldiers
- Per soldier type, the sum of their attacking and defending power

## For the extremely brave (optional)

Modify `Soldier` so that it has a rank.
- Hint: you could use an `enum` for this.

A Rank can have the following values:
- private first class
- corporal
- sergeant
- lieutenant
- captain
- major
- colonel
- general

A Rank should have the following behavior:
- `getReadFriendlyLabel` which returns a read-friendly textual representation of the rank
        - e.g. "Private first class"
        
A Soldier should receive some new behavior!
- promote which promotes a soldier to his next rank!
     - Question: Who should have the knowledge about the hierarchy of the ranks? Soldier or Rank?
     - Edge-case: promoting a general, remains of rank general.
