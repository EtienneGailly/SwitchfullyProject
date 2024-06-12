# B@ttle

For every requirement (you can even split requirements up into smaller bits):
1. Write a test
2. Run the test, see it fail
3. Let your pair implement a solution to fix that test (nothing more, quick and dirty!)
4. Run the test, it should succeed
5. Refactor (if needed)
6. Repeat step 1, but switch roles. 

Repeat this process until the requirement is completely tested (happy path and boundary tests) and fully implemented.
Only then go to the next requirement

Remember to keep the XP practices in mind:
- Pair programming
- Good tests
- Incremental design
- Write clean code

## Design
Start by **drawing the design** for the initial requirement(s).
Expand your design when taking up more requirements.
Remember: communication over complex tools (e.g.: use a whiteboard, pencil and paper)

## Requirement 1
I can enlist soldiers to an army.

## Requirement 2
The **front-man** of an army is the first enlisted soldier.

## Requirement 3
Soldiers equip one weapon and have by default "bare fists".

## Requirement 4
Weapons do an amount of damage.
- There are 3 types of weapons
    - Axe (amount of damage = 3)
    - Sword (amount of damage = 2)
    - Bare fists (amount of damage = 1)

## Requirement 5
A new type of weapon, the Spear, is added.
It does 3.5 damage.

## Requirement 6
Two soldiers fight with each other by comparing weapon damage. 
- The soldier with the strongest weapon wins.
- If both soldiers deal the same damage with their weapon, the attacking soldier wins (element of surprise).

## Requirement 7
Armies can engage in a war in which consecutive front-men fight with each other.
- When a front-man loses, he dies.
- When a soldier dies, the soldier is removed from the army.
- An army wins a battle if it has 1 or more alive soldiers and the other army doesn't ("last man standing" formulae).

## Discuss (reflection)
- How did you communicate? Did you use any drawings to communicate the design?
- Did you make an (incremental) design?  
- Did you really write your tests first? 
- Did you write one test at a time? 
- How often did you run the tests? 
- Did you add tests later? When? 
- Are your tests and the code both readable? 
- Which tests did you write and why? 
- Boundary cases (empty armies, same weapons fighting,...)

## Extra (advanced) requirements

We provide some extra requirements. These are "Nice-To-Have". 
Meaning: if you've completely implemented up to requirement 7, 
you should start implementing these extra requirements, but not before.

### Extra Requirement 1
There are specialized weapons for the highly trained soldiers:
- Flaming Sword (amount of damage = 2 * damage of Sword)
- Obsidian Axe (amount of damage = 2 + damage of Axe)
- Poisoned Spear (amount of damage = 3 * damage of Spear)

### Extra Requirement 2
Certain weapons receive a damage bonus over other weapons:
- Axes receive a +2 damage bonus over Spears
- Spears receive a +1 damage bonus over Swords
- Swords receive a +1.5 damage bonus over Axes
- All weapons receive a +2.5 bonus over Bare fists

Hence, there is no bonus when both soldiers use the same type of weapon.
