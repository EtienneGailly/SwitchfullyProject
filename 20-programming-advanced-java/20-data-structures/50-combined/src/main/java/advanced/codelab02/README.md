# Binary Search

_Disclaimer: This is an optional codelab for those who want an extra challenge._

When we want to know if a certain element is contained inside a list , we can call the `contains(...)` method.
This methods performs a **linear search** (checking every element, starting from the front) which means, worst case, we have to traverse the entire list.
This results in a time complexity of **O(n)** (worst and average case), which is not extremely bad, but not good either.

The utility class `Collections` also offers a `binarySearch(List, ElementToFind)` method. Which is also going to check if a certain element is contained inside the list. 
However, it does this in a smarter way.
- BinarySearch method: https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Collections.html#binarySearch(java.util.List,T)
- BinarySearch does not have a O(n) time-complexity, instead it has an average (and worst) time-complexity of **O(log n)** which is much better.
  - Often, divide-and-conquer approaches (for algorithms) are O(log n) because we don't have to check all elements: when we can pick a subset and drop the others (based on an intelligent decision).

Although `Collections` already offers a binary search method, we're going to create one of our own!
- Read up on the Binary search algorithm: https://en.wikipedia.org/wiki/Binary_search_algorithm (You'll need to read the Algorithm section)
- Then, start by writing a test! This should be fairly simple (given a certain input, you expect an output)
  - This test will not check if you have written a binary or linear, it will simply check if you are able to correctly search and find an element.
- Implement the binary search algorithm in the defined method of `BinarySearch.java` 

>: Binary search works on **sorted** arrays (or list). Binary search begins by comparing the middle element of the array with the target value. 
If the target value matches the middle element, its position in the array is returned. If the target value is less than the middle element, 
the search continues in the lower half of the array. If the target value is greater than the middle element, the search continues in the upper half of the array. 
By doing this, the algorithm eliminates the half in which the target value cannot lie in each iteration.



