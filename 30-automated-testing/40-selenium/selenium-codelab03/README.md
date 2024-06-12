# Creating your first organized test

In this codelab you'll learn how a Selenium test is conventionally organized.

## Context
If there is one thing to avoid when writing code it is duplication. 
Famously called "the root of all evil" by Robert C. Martin.

Looking at the code that we've written in the previous test, we can identify some duplication.
1. We need to create a driver at the beginning of every test
2. We need to quit the driver at the end of every test
3. The url of the webpage is repeated for every test
4. If we want to select the same element twice, we'll write the code for that selection also twice.

Let's remove this duplication!

## Task list
### Creating a driver object for every test
A set-up method is a method that will be executed before every test.
Sounds like the perfect place to create our driver!

1. Create a SetUp method in your test
   1. ALT + INSERT and select SetUp Method
2. Make a field in the test class `ChromeDriver driver`
3. Initialize this field in the SetUp Method
   1. Don't forget that to create a driver the system property needs to be set as well
4. Now you no longer need to initialize the driver in every test, you can remove the 2 first lines of every test
5. As always run all the tests to make sure they still work
6. Additionally, it's best to add an implicit wait. We'll talk later about the reason why.
   1. Add the following line to your setup `driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));`

### Quiting the driver after every test
A tearDown method is a method that will be executed after every test.
Let's quit our driver automatically.

1. Create a TearDown method in your test
   1. ALT + INSERT and select TearDown Method
2. Add the code to quit the driver in the TearDown Method
3. Now we no longer need the last line of every test
4. As always run all the test to make sure they still work.

### Page Object Model
We've removed some duplication. Still there is one final thing that needs cleaning up.
We're still repeating everything that has to do with interacting with the page.
If we do not clean this up, we'll end up repeating the same piece of code hundreds of times.

Think of a login. If we are writing hundreds of test for an application, then chances are we'll need to write the code for the login procedure for most of them.
What we can do is repeating the code for the login procedure for all these tests. 
If that happens we're in big trouble. Because if somebody changes the way the log in works, all our tests need to be rewritten.

Wouldn't it be nice that we can write `login("username","password")` from wherever we like, and it just works? How do we organize such a thing?
The conventional way of doing this is with the [Page Object Model](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/).

The Page Object Model is a design pattern where all the code that is needed to interact with a page is centralized in a java class.
What you're doing is essentially making a model of your webpage in a class.

### Creating a Page class
Let's make a page class together.

1. Start by making a class for our element-selection page. Typically, page classes have the Page suffix. So `ElementSelectionPage` would be a good name for our class.
2. A page will need a Selenium driver. So make a field and constructor for the ChromeDriver.
3. Create an `open()` method in the page class. This method should open our element-selection html-page with the driver.
4. Back to `MyBetterOrganizedTest`. Create a field of type ElementSelectionPage and initialize it in the SetUp method.
5. In every test instead of opening the element-selection html-page, call the `open()` method on the page field.
6. Run your tests. They should still work.

Ok, we've moved the opening of the html page away from our tests. What else can we move?

Let's move selecting the paragraph element away from our test and into our Page class.
1. Make a method `getParagraphText()` in your page class.
   1. In this method you need to select the paragraph element
   2. Return the text of that element
2. In your test replace selecting the paragraph element and getting its text with the getParagraph element.

In similar fashion create the following methods in the Page class:
- `getSpanText()` which will return the text of the span element
- `addListItem(String newListItemText)` which will fill in the input field and press the button in one method call
- `List<String> getListItemList()` that will return the list of items in the List element as a list of strings.

After creating each method, replace the code in the tests with the appropriate method call. 
When finished all your tests should still work and do their calls to the driver via the Page class.

That's it. We've created our first page class. These kind of classes will provide much needed structure to our selenium tests.
One last word of advice: the methods in your page classes should never return a WebElement or anything else from the selenium library.
This way when selenium makes changes to their library you limit the impact of that change to your page classes.

### The PageFactory
An improvement that you can make to Page classes is with the PageFactory. 
The page factory allows you to replace selecting elements with code with selecting elements with annotations.

An example:
```java
WebElement paragraph = driver.findElement(By.id("paragraph"));
```
becomes
```java
@FindBy(how = ID, using = "paragraph")
private WebElement paragraph;
```

You can activate this feature by calling:
```java
PageFactory.initElements(driver, elementSelectionPage);
```

Let's try out this feature.
1. Add `PageFactory.initElements(driver, elementSelectionPage);` as the last line in the setUp method of your test.
2. For every `findElement()` method call in the Page class
   1. Create a WebElement field
   2. Add the correct `@FindBy` annotation
   3. Use the field instead of the local variable in your method
3. As always run your tests if you're done to see if everything still works. 

### (Extra) Fluent page object model
A last way to improve your Page classes is implementing the fluent interface pattern.
1. Lookup what the fluent interface pattern is
2. Adapt your page so that it implements this pattern

## Summary

In this codelab we've seen how we can use page classes to improve our test design.

## What's next?

We now can create nice and readable test that are easy to adapt when developers need to make changes.
However, a large part of our setup is still done in our setUp and tearDown method and needs to be repeated for every test class we make.
Next chapter we'll see how Spring Boot can simplify our configuration.
