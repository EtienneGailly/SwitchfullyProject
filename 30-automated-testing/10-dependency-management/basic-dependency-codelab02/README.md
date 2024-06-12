# Dependency Codelab 02

The goal of this codelab is to generate random addresses with a java dependency.

```
*************************
Shaunté Kerssen
Strobbeplantsoen 808
Oost Reijvenkoop 9079 DC

*************************
Igmar Dictus
Verpoortenweg 815
Bavokoop 4139 IK
```

The dependency that we'll be using is: [Java Faker](https://github.com/DiUS/java-faker).


## Task list
1. Add the Java Faker dependency
2. Complete the Maven project structure for this codelab. (What is missing?)
3. Add a Main.java file to your project.
4. Lookup in the Java Faker documentation on how to generate a random address.
5. Generate random addresses everytime you run your program
   1. To choose a language that is not in the default list use the following code.
      ```java
      new Locale.Builder().setLanguage("nl").build();
      ```
