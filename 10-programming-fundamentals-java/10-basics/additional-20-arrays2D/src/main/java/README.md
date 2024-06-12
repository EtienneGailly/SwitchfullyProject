# Multidimensional Arrays

## In Short
A multidimensional array is an Array with arrays within. You can compare it with a matrix or a spreadsheet. It has rows (first brackets) and columns (second brackets).

```java
int[][] spreadsheet = new int[4][5];
spreadsheet[0][0]=1;
spreadsheet[0][2]=2;
System.out.println(spreadsheet[0][2]);
int[] row = spreadsheet[1];
```

You can access the value within the array by using the row and column value.
But you can also ask a complete row.

The initialisation of a multidimensional array is almost the same as a normal array. You can create an empty array with a specific size or use the curly brace notation for initialisation with data:

```java
int[][] spreadsheet = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14}};
int[][] otherSpreadsheet = new int[2][4];
```

We can even go further than 2 dimensions!

```java
int[][][][][] spreadsheet = {{{{{1,2,3,4},{5,6,7,8}},{{9,10,11,12}},{{13,14},{12,11}}}}};
int[][][][][] otherSpreadsheet = new int[2][4][5][1][3];
```

However, it's safe to say you should avoid creating arrays with more than 2 dimensions, certainly more than 3 dimensions.
Simply because it gets incredibly complex fast when adding dimensions. 