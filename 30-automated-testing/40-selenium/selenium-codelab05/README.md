# Waiting on your application

In this codelab you'll learn how you can adapt the amount of time Selenium will wait before making a decision.

## Context
An issue you need to be aware of is that it's difficult to decide how long you need to wait before you can make a decision.

Normally Selenium will not wait to make a decision. 
If you want to use a certain element, and it's not immediately there after the pages has loaded, Selenium will throw an error.
This might not always be a good idea.

Reasons why you should consider waiting times:
- A query takes longer to process
  - There might be several reasons a certain query takes a long amount of time
    - Server is overloaded
    - Network is overloaded
    - Database is huge
    - ...
  - Say that your test will execute a query and then wants to assert that the results are correct
  - How would you know the difference between a query that takes a long time and a bug?
  - How long should it wait? 5 seconds? 10? 1 minute? 10 minutes?
    - it might be that you waited for 10 seconds and in the 11th second you get the results
    - is it a bug then?

- A deletion that takes longer to process
  - Say that you deleted an element
  - You want to check that it is no longer there by executing a query
  - If the query takes a long amount of time
  - How do you know it's really deleted or that the system takes very long to respond?
  - If the element is not there is it because you really deleted it or the server didn't have time yet to respond
  - How long should you wait?
    - if it was really deleted should you keep waiting for a few seconds to make sure it doesn't suddenly reappear?
      - How long should you wait a few seconds? Minutes?

- The server has a wake-up mechanism:
    - when it hasn't been used for a certain time the server will go in a sleep modus
    - the next time you want to use the application you need to wait for 20 seconds before the server starts up
    - when the server is not running yet, you'll see the UI but data from the backend will only appear after 20 seconds
    - a selenium test needs to be aware of this, otherwise it will think that there is a bug instead of a server that is waking up

The effect of the different wait times might be:
- Short wait time:
  - Selenium makes faster decisions and it will execute faster
  - It will conclude more often that something is broken while it was just taking more time to respond
- Long wait time:
  - If Selenium decides that something is wrong it will most likely not be because of a slow response time
  - It will take longer to run all your tests

## Timeout options
Selenium allows to configure the amount of time it will wait before giving a timeout.
This can be done in several ways.

### Implicit timeout
The first is the implicit timeout. This is the amount of time that selenium will wait for every request before timing out.

You can set the implicit timeout like this:
```java
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
```

This will make sure that Selenium will wait 500 milliseconds for every request before giving a timeout.

### Explicit wait
This is the wait time you set for a single request. You can configure it like this.

```java
new WebDriverWait(driver, Duration.ofMillis(10000)).until((driver) -> this.bookTable.isDisplayed())
```
This will make sure that selenium will wait 10 seconds on the bookTable to appear before giving a timeout.

### Fluent wait
Fluent wait is just like the explicit wait, however there are extra configuration options.
You can configure for example how often Selenium needs to check that the element is there while waiting.

You can configure it like this:
```java
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
  .withTimeout(Duration.ofSeconds(30))
  .pollingEvery(Duration.ofSeconds(5))
  .ignoring(NoSuchElementException.class)
  .until((driver) -> this.bookTable.isDisplayed())
```
This will make Selenium wait for 30 seconds and let it check every 5 seconds to see if the bookTable is displayed before giving a timeout.

### Combinations
Selenium advices against combining the implicit wait with the other types of waits, since it can give unpredictable results.

## Server waking up
Let's try this on the digibooky application: [the Digibooky website](https://digibooky.netlify.app/)
Since the digibooky server has a sleep functionality, you should wait to really start testing until the server is up and running.
We've provided a little checkmark that will tell you when the server is up. ![server-up](server-up.png)

1. Write a test that will wait until the server is up and running before continuing.

## Long query

Loading the books takes quite some time. We want Selenium to wait long enough so that the books are loaded.

1. Write a test that will wait until the books are loaded

## Summary

In this codelab you've learned how to configure the timeout of Selenium
