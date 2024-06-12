t# TreeMap

> Completely optional and advanced! Be warned :)

## SortedMap & NavigableMap

A `TreeMap` implements both the `SortedMap` and `NavigableMap` interfaces, let's discover them first:

### SortedMap

> For context

`SortedMap` is a Map that further provides a total ordering on its keys. The map is ordered according to the natural ordering of its 
keys, or by a Comparator typically provided at sorted map creation time. This order is reflected when iterating over 
the sorted map's collection views (returned by the entrySet, keySet and values methods). Several additional operations 
are provided to take advantage of the ordering. (This interface is the map analogue of SortedSet.)

All keys inserted into a sorted map must implement the Comparable interface (or be accepted by the specified comparator). 
Furthermore, all such keys must be mutually comparable: k1.compareTo(k2) (or comparator.compare(k1, k2)) must not throw a 
ClassCastException for any keys k1 and k2 in the sorted map. Attempts to violate this restriction will cause the 
offending method or constructor invocation to throw a ClassCastException.

https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/SortedMap.html
- _Inspect the methods it defines._

### NavigableMap

> For context

`NavigableMap` is a SortedMap extended with navigation methods returning the closest matches for given search targets.
Methods lowerEntry(K), floorEntry(K), ceilingEntry(K), and higherEntry(K) return Map.Entry objects associated with keys 
respectively less than, less than or equal, greater than or equal, and greater than a given key, returning null if there 
is no such key. Similarly, methods lowerKey(K), floorKey(K), ceilingKey(K), and higherKey(K) return only the associated keys. 
All of these methods are designed for locating, not traversing entries.

A NavigableMap may be accessed and traversed in either ascending or descending key order. The descendingMap() method 
returns a view of the map with the senses of all relational and directional methods inverted. The performance of ascending 
operations and views is likely to be faster than that of descending ones. Methods subMap(K, boolean, K, boolean), 
headMap(K, boolean), and tailMap(K, boolean) differ from the like-named SortedMap methods in accepting additional 
arguments describing whether lower and upper bounds are inclusive versus exclusive. 
Submaps of any NavigableMap must implement the NavigableMap interface.

https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/NavigableMap.html
- _Inspect the methods it defines._

## TreeMap

> From https://www.baeldung.com/java-treemap

TreeMap is a map implementation that keeps its entries sorted according to the natural ordering of its keys or better 
still using a comparator if provided by the user at construction time.

Previously, we have covered HashMap and LinkedHashMap implementations and we will realize that there is quite a bit of 
information about how these classes work that is similar.

### Default Sorting in TreeMap
By default, TreeMap sorts all its entries according to their natural ordering. For an integer, this would mean ascending 
order and for strings, alphabetical order.

Let's see the natural ordering in a test:
```java
@Test
public void givenTreeMap_whenOrdersEntriesNaturally_thenCorrect() {
    TreeMap<Integer, String> map = new TreeMap<>();
    map.put(3, "val");
    map.put(2, "val");
    map.put(1, "val");
    map.put(5, "val");
    map.put(4, "val");
 
    assertEquals("[1, 2, 3, 4, 5]", map.keySet().toString());
}
```
Notice that we placed the integer keys in a non-orderly manner but on retrieving the key set, we confirm that they are 
indeed maintained in ascending order. This is the natural ordering of integers.

Likewise, when we use strings, they will be sorted in their natural order, i.e. alphabetically:
```java
@Test
public void givenTreeMap_whenOrdersEntriesNaturally_thenCorrect2() {
    TreeMap<String, String> map = new TreeMap<>();
    map.put("c", "val");
    map.put("b", "val");
    map.put("a", "val");
    map.put("e", "val");
    map.put("d", "val");
 
    assertEquals("[a, b, c, d, e]", map.keySet().toString());
}
```
TreeMap, unlike a hash map and linked hash map, does not employ the hashing principle anywhere since it does not use 
an array to store its entries.

### Custom Sorting in TreeMap
If we're not satisfied with the natural ordering of TreeMap, we can also define our own rule for ordering by means of a 
comparator during construction of a tree map.

In the example below, we want the integer keys to be ordered in descending order:
```java
@Test
public void givenTreeMap_whenOrdersEntriesByComparator_thenCorrect() {
    TreeMap<Integer, String> map = 
      new TreeMap<>(Comparator.reverseOrder());
    map.put(3, "val");
    map.put(2, "val");
    map.put(1, "val");
    map.put(5, "val");
    map.put(4, "val");
         
    assertEquals("[5, 4, 3, 2, 1]", map.keySet().toString());
}
```
A hash map does not guarantee the order of keys stored and specifically does not guarantee that this order will remain 
the same over time, but a tree map guarantees that the keys will always be sorted according to the specified order.


### Importance of TreeMap Sorting
We now know that TreeMap stores all its entries in sorted order. Because of this attribute of tree maps, we can perform 
queries like; find “largest”, find “smallest”, find all keys less than or greater than a certain value, etc.

The code below only covers a small percentage of these cases:
```java
@Test
public void givenTreeMap_whenPerformsQueries_thenCorrect() {
    TreeMap<Integer, String> map = new TreeMap<>();
    map.put(3, "val");
    map.put(2, "val");
    map.put(1, "val");
    map.put(5, "val");
    map.put(4, "val");
         
    Integer highestKey = map.lastKey();
    Integer lowestKey = map.firstKey();
    Set<Integer> keysLessThan3 = map.headMap(3).keySet();
    Set<Integer> keysGreaterThanEqTo3 = map.tailMap(3).keySet();
 
    assertEquals(new Integer(5), highestKey);
    assertEquals(new Integer(1), lowestKey);
    assertEquals("[1, 2]", keysLessThan3.toString());
    assertEquals("[3, 4, 5]", keysGreaterThanEqTo3.toString());
}
```

### Internal Implementation of TreeMap
TreeMap implements NavigableMap interface and bases it's internal working on the principles of red-black trees:
```java
public class TreeMap<K,V> extends AbstractMap<K,V>
  implements NavigableMap<K,V>, Cloneable, java.io.Serializable
```
The principle of red-black trees is beyond our scope, however, there are key things to remember in 
order to understand how they fit into TreeMap.

First of all, a red-black tree is a data structure that consists of nodes; picture an inverted mango tree with its root
 in the sky and the branches growing downward. The root will contain the first element added to the tree.

The rule is that starting from the root, any element in the left branch of any node is always less than the element in 
the node itself. Those on the right are always greater. What defines greater or less than is determined by the natural 
ordering of the elements or the defined comparator at construction as we saw earlier.

This rule guarantees that the entries of a treemap will always be in sorted and predictable order.

Secondly, a red-black tree is a self-balancing binary search tree. This attribute and the above guarantee that basic 
operations like search, get, put and remove take logarithmic time O(log n).

Being self-balancing is key here. As we keep inserting and deleting entries, picture the tree growing longer on one 
edge or shorter on the other.

This would mean that an operation would take a shorter time on the shorter branch and longer time on the branch which 
is furthest from the root, something we would not want to happen.

Therefore, this is taken care of in the design of red-black trees. For every insertion and deletion, the maximum height 
of the tree on any edge is maintained at O(log n) i.e. the tree balances itself continuously.

### Choosing the Right Map
Having looked at HashMap and LinkedHashMap implementations previously and now TreeMap, it is important to make a brief 
comparison between the three to guide us on which one fits where.

**A hash map** is good as a general purpose map implementation that provides rapid storage and retrieval operations. However, 
given certain requirements, it can fall short because of its chaotic and unorderly arrangement of entries.

This causes it to perform poorly in scenarios where there is a lot of iteration as the entire capacity of the underlying 
array affects traversal other than just the number of entries.

**A linked hash map** possesses the good attributes of hash maps and adds order to the entries. It performs better where 
there is a lot of iteration because only the number of entries is taken into account regardless of capacity.
- More on Linked Hash Map: https://www.baeldung.com/java-linked-hashmap

**A tree map** takes ordering to the next level by providing complete control over how the keys should be sorted. On the 
flip side, it offers worse general performance than the other two alternatives.
    
We could say a linked hash map reduces the chaos in the ordering of a hash map without incurring the performance 
penalty of a tree map.

### Experiment

Feel like experimenting with a TreeMap? Cool! Feel free to do so!

