# Regex (regular expressions)

## What is it
Regexes are a way to look for patterns in strings. 
With a regex you can with a few lines of code check if a URL or an email is formatted correctly.
Regexes are used often in websites to validate user input.

Although powerful there are some downsides to a regex. 

- First, there are some patterns that regexes can not express 
that other programming languages (yes, regular expressions are some kind of programming language) like Java can.
  
- Secondly, most people are not used to regexes. Using a regex can lead to confusion and misinterpretations by your colleagues.
So use the same principles that help you write clean code to write clean regexes.

## How to write
Regexes describe patterns. An easy regex is 
```regexp
^house$(?# this means every string that is exactly the word house)
```
We say that a string matches a regex when it follows the described pattern. So `house` in this case.

Let's analyze the different elements of the regex:
- `^` means the start of the string. 
  - Without this the matching does not need to start at the start of the string. 
  So for `house$` a string like `wooden house` will also match.
- `$` means the ends of the string.
  - Without this there can be more characters after the pattern has matched.
    So for `^house` a string like `house fire` will also match but `wooden house` wouldn't.
- Not using `^` and `$` (so simply using `house` as a regex) simple checks if the strings contains the pattern somewhere.
- The main part of the regex `house`, just means literally the word `house`


Using this knowledge you can very easily implement the following String functions:
- startsWith, endsWith, contains and equals

## How to write in java
To create a regex you can use the `Pattern` class.
You can create a regex like so:
```java
Pattern pattern = Pattern.compile("^house$");
```
With this pattern you can try to match a String, like so:
```java
Pattern pattern = Pattern.compile("^house$");
Matcher matcher = pattern.matcher("wooden house");
```
With the matcher object you can do a lot of things. The main methods that you will be using are `find()` and `matches()`.
`find()` will look for the pattern and return true when it found it. Like so:
```java
Pattern pattern = Pattern.compile("^house$");
Matcher matcher = pattern.matcher("wooden house");
System.out.println(matcher.find()); //will return false
```
```java
Pattern pattern = Pattern.compile("house");
Matcher matcher = pattern.matcher("wooden house");
System.out.println(matcher.find()); //will return true
```
`matches()` will only return true if the string completely matches the pattern (so just as if you would have added ^ and $). 
```java
Pattern pattern = Pattern.compile("house");
Matcher matcher = pattern.matcher("wooden house");
System.out.println(matcher.matches()); //will return false
```
```java
Pattern pattern = Pattern.compile("house");
Matcher matcher = pattern.matcher("house");
System.out.println(matcher.matches()); //will return true
```

## Wildcards
Of course there is more to regex than simply having the 4 basic string methods.
Regexes are best known for their variety of wildcards.
- `.` means "any character"
- `\w` means "any letter"
- `\d` means "any digit"

Some examples :
```regexp
house .(?#will match "house 1" or "house !" or "house a")
```
```regexp
house \w(?#will match "house a" but not "house !" or "house 1")
```

### Range wildcards
You can even go more specific and define a range as a wildcard
- `[a-z]` means "every lower case letter"
- `[a-g]` means "every lower case letter starting from 'a' until 'g'"
- `[a-gA-Z]` means "every lower case letter starting from 'a' until 'g' and every uppercase letter"

## Cardinalities
Combined with cardinalities regexes become really powerful.
You have:
- `?` meaning zero or one times
- `+` meaning one or more times
- `*` meaning zero or more times
- `{2-5}` meaning 2,3,4 or 5 times

Some examples :
```regexp
house .*(?#will match "house 1111" or "house 1" or "house ")
```
```regexp
house .+(?#will match "house 1" or "house 1111" but not "house ")
```
```regexp
house .?(?#will match "house 1" or "house " but not "house 111111")
```
```regexp
house .{2-5}(?#will match "house 11" or "house 1111" but not "house 1" or "house 1111111111")
```
