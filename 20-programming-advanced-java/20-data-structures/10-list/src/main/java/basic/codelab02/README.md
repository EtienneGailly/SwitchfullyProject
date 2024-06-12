# Name Generator

Inspect class `NameGenerator`, it implements 3 class methods: `generateFunnyNames`, `generateSeriousNames` and `generateNormalNames`. Each method returns `List<String>`.
- Every method creates a list in a different way, which will be interesting for you to see.

Now, do the following:

1. Create a `NameApp` class which contains a `main` method.
2. In it, call the `generateFunnyNames` method, loop over the returned list and print every name to the console.
3. Then, call the `generateNormalNames` method and print only the first element of the returned list to the console.
4. Finally, call the `generateSeriousNames` method and print only the last element of the returned list (it should also work should `generateSeriousNames` return more than 3 names).

The final output should be:
```text
Timmiolala
Kevivio
Annananana
Jim
Claire
```