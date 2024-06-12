# Dependency Codelab 03

The goal of this codelab is to read a file, make changes to it and write the results to a different file.

## Context

With Standard Java you can read and write files. However, the code required to do this contains a lot of boilerplate.
Especially if the files you want to read are in the resources folder. This folder contains all your non-java files and
is mostly to store your configuration.

Luckily, there are some dependencies that can make your life easier, namely: commons-io (made by Apache) and guava (made
by Google).

## Task list

1. Add the commons-io dependency.
2. Add the guava dependency.
3. Read the `student-scores.csv` file using the guava class `Resources`.
   1. The goal is to have an object of type File. 
   2. You'll need to use the File constructor.
4. Convert your File to a String using (or a list of strings) using the commons-io class `FileUtils`.
5. Print out this string to the console to see if you have correctly read out `student-scores.csv`.
6. Create a new file at `out/student-scores.csv`.
7. Use FileUtils to write the string to your new file.  
8. Check the contents of your new file to see if it contains the correct data
   1. You'll find the `out` folder in your root project

## Extra 1
Copying data from one file to another is not that interesting. Let's make some changes to it.

1. Read the data
2. Increase all the scores with 1
   1. The `split()` method of `String`, `Integer.parseInt()` and `String.valueOf()` are your friends here. 
3. Write the increased scores to the `out` folder

## Extra 2
Let's make the print to the console more pretty. Use the Asciitable dependency to print out the contents in a table format.

## Extra 3 (Very hard)
The `student-scores.csv` was missing some data to make things easier. 
Take a look at `student-scores-advanced.csv` to see the full data set.

1. Print out the name of every course
2. For each course print out the average score of each course
3. For each course print out the student name that had the highest score for that course
4. Write these results in a file called `out/report.txt`

Your code should work independently of the data (so you should be able to add or remove a course, and it should still work).

There might be extra dependencies that help you out. Look for `csv parsers` to help you out.
