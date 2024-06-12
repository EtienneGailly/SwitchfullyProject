# TDD Growing

For every requirement (you can even split requirements up into smaller bits):
1. Write a test
2. Run the test, see it fail
3. Let your pair implement a solution to fix that test (nothing more, quick and dirty!)
4. Run the test, it should succeed
5. Refactor (if needed)
6. Repeat step 1, but switch roles. 

Repeat this process until the requirement is completely tested (happy path & boundary tests) and fully implemented.
Only then go to the next requirement

Remember to keep the XP practices in mind:
- Pair programming
- Good tests
- Incremental design

## Design
Start by **drawing the design** for the initial requirement(s).
Expand your design when taking up more requirements. (e.g.: use a whiteboard, pencil and paper)

## Requirements #1
- I can plant "Growables" in a region.
- 5 growables at most
- I can ask a region for its growables

## Requirements #2
- A growable can grow. This transforms the growable into the next "state": 
    - Seed to sprout
    - Sprout to plant
    - Plant to tree
    - Tree to tree
- When advancing a season in a region, all planted growables grow one level.

## Requirements #3
- A region has a vegetation
- Each vegetation effects the growth level when advancing a season:
    - BroadLeaf: level +1 (default behavior)
    - RainForest: level +2
    - Steppe: growthLevel 0
    
## Discuss (reflection)
- How did you communicate? Did you use any drawings to communicate the design?
- Did you make an (incremental) design?  
- Did you really write your tests first? 
- Did you write one test at a time? 
- How often did you run the tests? 
- Did you add tests later? When? 
- Are your tests and the code both readable? 
- Which tests did you write and why? 
