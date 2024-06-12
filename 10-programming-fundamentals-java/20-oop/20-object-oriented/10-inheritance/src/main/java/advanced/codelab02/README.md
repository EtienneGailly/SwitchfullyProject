# Members

## Requirements

A `Member` has a `username` (e.g. "frank.detank"/"gerard.lechar") and a `lastSignedInOn` date (use as its type Java's `LocalDate`).
- LocalDate: https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/time/LocalDate.html

Do the following:
- A `Moderator` extends `Member` and has an additional field called `isTrusted` (e.g. true).
- A `FreeMember` extends `Member`.
- A `PayingMember` extends `Member`.

Create a method `signIn()`:
- For a Member it would return "Welcome {username}, the last time you signed in was {lastSignedInOn}";
- For a FreeMember it will return "Welcome {username}, the last time you signed in was {lastSignedInOn}";
- For a PayingMember it will return "Dear honorary {username}, welcome! The last time you signed in was {lastSignedInOn}";
- For a Moderator it will return something different, based on the `isTrusted` field:
    - If `isTrusted` is `true`: "'Sup mod {username}!? The last time you signed in was {lastSignedInOn}";
    - If `isTrusted` is `false`:  "Welcome {username}, the last time you signed in was {lastSignedInOn}";

Additionally, when calling the `signIn()` method, make sure the value of `lastSignedInOn` value is automatically 
set to the current day (now). 

## Create instances

Create a `main` method (in a dedicated class). In it, create some different instances and experiment 
with the `signIn()` method.