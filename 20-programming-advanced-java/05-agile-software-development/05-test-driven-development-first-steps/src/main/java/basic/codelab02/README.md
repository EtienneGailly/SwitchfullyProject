# TDD Vampire

For every requirement (you can even split requirements up into smaller bits):
1. Write a test
2. Run the test, see it fail
3. Let your pair implement a solution to fix that test (nothing more, quick and dirty!)
4. Run the test, it should succeed
5. Refactor (if needed)
6. Repeat step 1, but switch roles. 

Repeat this process until the requirement is completely tested (happy path & boundary tests) and fully implemented.
Only then go to the next requirement.

Remember to keep the XP practices in mind:
- Pair programming
- Good tests
- Incremental design

## Requirement 1
A Vampire can bite a Human, when he does, the Human transforms into a vampire as well

## Requirement 2
- Only if the human is bitten after midnight (but before 7:00 AM), will he turn into a vampire.
- If the human is bitten on-or-after 7:00 AM (but before midnight), nothing will happen.

## Missed edge case
Oops, we missed an edge case (possibly resulting in a bug)... What if the human is exactly bitten ON midnight?

We asked our customer / business. Turns out that in that particular case, 
the human should be transformed into a vampire as well.

If you ever encounter a scenario like this, make sure to capture the bug first, make the bug visible.
You do this by writing a test for that particular case (human gets bitten on midnight). If it's a bug, the test should fail.
Then, edit your existing implementation so that it fixes the new test (obviously, the other tests should remain successful as well).