# Creating your first selenium test

The goal of this codelab is to learn how to create a test using the Selenium Driver

## Task list

### Opening a URL

Let's open a web page
1. Go to `MyFirstSeleniumTest`
2. Call `driver.get(<url>)`
    1. Fill in the url of element-selection page that we've been using so far.
3. Run the test
4. The test should fail since our page uses a login and a password (student / spidermanismyhero). 
   1. Add the login and password to the URL to bypass the login screen. Do this by declaring and initializing two Strings, `login` and `password`, and adding them to the URL ("https" + username + ":" + password + "@url").
   2. Run the test again. It should open the page.

### Selecting an element

Let's select an element on the page that we've opened.
1. Call `driver.findElement(By.id("<id>"))`
   1. Find the id of the paragraph element in the html page
   2. Replace `<id>` with the correct id
2. Save the selected element in a variable
3. Print out the text of the selected element using `getText()`
4. Run the test. It should print out the text "I am some text in a paragraph".

The `By` class has, besides `id()`, other methods like `cssSelector()` and `xpath()` allowing you to select elements in different ways.  

### Asserting
1. Using AssertJ add an assertion to check that the text is equal to "I am some text in a paragraph"

### Closing the browser
Until now, everytime we've run a test a new window has popped open and has stayed open, even after test has finished.
To properly close the browser, you'll need to call the `quit()` method on the driver.

1. Close the browser automatically after the test has run


### A new test
1. Using the same steps, write a new test that will assert that the text of the span is equal to "I am some text in a span"

### Interacting with elements
Besides reading text of elements, you can interact with elements like input fields and buttons.

Let's create a test that will add a new element to the list.
1. Write code to select the "new element" input field
2. Fill in "Strawberry" in the selected element. You'll need to use the `sendKeys()` method.
3. Select the `Add Element` button and click on it using the `click()` method.
   1. There is no id on the button, so you'll need to use a different technique to select it.
   2. It might be that your button is not in view when you want to click it. To solve this you can let selenium scroll down a bit.
      1. new Actions(driver).scrollByAmount(0, 250).perform();
4. Assert that the last element in the list is equal to "Strawberry"
   1. Select the last element in the list. Xpath is your friend here.
   2. Assert that the text of that element is equal to "Strawberry"
5. Make sure to quit your driver

## Summary

In this codelab you've learned how to write tests using Selenium.

## What's next?

Since our code is a bit of a mess now, with a lot of duplication, we'll see how to simplify our code in the next codelab.

