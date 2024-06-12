# Collections: wrapper Implementations

> Completely optional and rather advanced.

Wrapper implementations delegate all their real work to a specified collection 
but add extra functionality on top of what this collection offers. 
For design pattern fans, this is an example of the decorator pattern. Although it may seem a bit exotic, 
it's really pretty straightforward.

These implementations are anonymous; rather than providing a public class, the library provides a static factory method. 
All these implementations are found in the Collections class, which consists solely of static methods.

## Unmodifiable Wrappers
Unlike (e.g.) synchronization wrappers, which add functionality to the wrapped collection, the unmodifiable wrappers take 
functionality away. In particular, they take away the ability to modify the collection by intercepting all the 
operations that would modify the collection and throwing an UnsupportedOperationException. Unmodifiable wrappers have 
two main uses, as follows:

1. To make a collection immutable once it has been built. In this case, it's good practice not to maintain a reference to 
the backing collection. This absolutely guarantees immutability.
2. To allow certain clients read-only access to your data structures. You keep a reference to the backing collection but 
hand out a reference to the wrapper. In this way, clients can look but not modify, while you maintain full access.

Each of the six core Collection interfaces has one static factory method.
- `public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c);`
- `public static <T> Set<T> unmodifiableSet(Set<? extends T> s);`
- `public static <T> List<T> unmodifiableList(List<? extends T> list);`
- `public static <K,V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m);`
- `public static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<? extends T> s);`
- `public static <K,V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> m);`

## Experiment

Experiment with these static methods.
- For example, try to modify (e.g. `add` an element to an unmodifiable list).
