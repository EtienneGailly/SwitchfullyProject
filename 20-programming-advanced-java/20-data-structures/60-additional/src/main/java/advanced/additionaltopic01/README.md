# LinkedList

> Completely optional and rather advanced.

Similar to arrays and ArrayLists in Java, `LinkedList` is a linear data structure. 
However LinkedList elements are not stored in contiguous locations like arrays, they are linked with each other using 
pointers. Each element of the LinkedList has the reference(address/pointer) to the next element of the LinkedList, 
and to the previous element.

## Structure

Each element in the LinkedList is called the Node. Each Node of the LinkedList contains two or three items.
- For a singly-linked list, it contains two items:  
    1. Content of the element.
    2. Pointer/Address/Reference to the Next Node in the LinkedList.
- For a **doubly-linked** list, it contain three items:
    1. Content of the element. 
    2. Pointer/Address/Reference to the Next Node in the LinkedList. 
    3. Pointer/Address/Reference to the Previous Node in the LinkedList.
    
The `LinkedList` class in Java implements a doubly-linked list. 
- The head of the LinkedList is the first element, it only has a reference to the next Node.
- The last element, for its next node, points to null.
- All other nodes has 2 references: one for the previous node, on for the next.
- All nodes hold a value.

```text
|----------------|              |----------------------|             |---------------------|
| "Hello" | 240  |     --->     | 180 | "There" | 350  |     -->     | 240 | "You!" | null |
|------ 180 -----|              |--------- 240 --------|             |-------- 350 --------|
```

## Operations performance & Memory consumption

In contrast to arrays or Array Lists, Linked lists allow for dynamic memory allocation, 
which means memory allocation is done at the run time by the compiler and we do not need to mention the size of the 
list during linked list declaration.

Furthermore, Linked list elements don’t need contiguous memory locations because elements are linked with each other 
using the reference part of the node that contains the address of the next node of the list.

Therefore, the insertion, addition and removal operations of an item are faster in a (Java) LinkedList than in an (Java) ArrayList 
because there is no need to resize an array or update the index when an element is added to some arbitrary position inside the collection, 
only references in surrounding elements will change.

However, a LinkedList consumes more memory than an ArrayList because of every node in a LinkedList stores two references, 
one for its previous element and one for its next element, whereas ArrayList holds only data and its index.

## ArrayList and LinkedList

Although both of them in Java implement the List interface, they have different semantics – 
which will definitely affect the decision of which one to use.
- Besides List, a LinkedList also implements the Deque       interface.

An ArrayList is an index based data structure backed by an Array. 
It provides random access to its elements with a performance equal to O(1).

On the other hand, a LinkedList stores its data as a list of elements and every element is linked to its previous and 
next element. In this case, the search operation for an item has execution time equal to O(n).

ArrayList is usually the default List implementation.

However, there are certain use cases where using LinkedList will be a better fit, such as preferences for constant 
insertion/deletion time (e.g., frequent insertions/deletions/updates), over constant access time and effective memory usage.

## Experiment

Experiment a bit with the LinkedList... Maybe try to re-create a previous codelab here, but now use a `LinkedList`.

## Used resources:
- https://www.baeldung.com/java-linkedlist
- https://beginnersbook.com/2013/12/linkedlist-in-java-with-example/

Read more on the actual implementation of `LinkedList` on https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/LinkedList.html
