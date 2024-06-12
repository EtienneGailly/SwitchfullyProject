# Spring and Cucumber

In this codelab you'll learn how you can use Spring with Cucumber.

## Context
There are 2 reasons you would like Cucumber working with Spring.
1. If you want access to one of the Components of Spring (like the Webdriver or Pages) from your steps-classes
2. If your steps-classes need to communicate with each other

## Cucumber Spring
Let's first start with connecting our Cucumber test with the Spring Components.

Until now the tests that we've done have the code that we're testing inside of them.
Instead of doing the calculations inside the test, we normally would have a component that is responsible to do this.

Take a look at com.switchfully.spring.Calculator to see what such a component would look like.
Let's make our tests use the Calculator to do our calculations!

1. Add the following dependency
```xml
<dependency>
   <groupId>io.cucumber</groupId>
   <artifactId>cucumber-spring</artifactId>
   <version>7.11.1</version>
</dependency>
```
This dependency will allow you to make Cucumber connection to Spring.

## Spring Boot Test
Next we'll make our Cucumber test a Spring Boot Test.

1. Create a new class CucumberSpringConfiguration and add it to the cucumber package
2. In this class add the following annotation `@CucumberContextConfiguration`
   1. This will tell Cucumber that this class contains some extra configuration
3. Next add `@SpringBootTest`
   1. Run your test. It should fail.
4. Just like with any other Spring Boot Test we need to have a Spring Configuration file. 
   1. Create a spring package
   2. Create a SpringConfiguration class in this package.
5. Annotate the SpringConfiguration class with `@Configuration`. In CucumberSpringConfiguration reference the SpringConfiguration class
   1. Don't forget to add the `@ComponentScan` annotation
   2. Run your test again. It should work.


## Autowiring components
Let's use the Calculator component

1. Add the following line to the CalculationSteps: `private Calculator calculator`.
2. Add the annotation `@Autowired` to this newly created field.
   1. Intellij will be confused by this and say that the annotation is an error. You can ignore this.
   2. Another way is instead of writing the annotation is creating a constructor that initializes the field.
3. Replace all calculations you do in the Steps class with a call to the correct Calculator method.
4. Run your tests again. They should work.

Congratulations, you've connected your Cucumber test with Spring. 
This opens a huge array of possibilities, allowing you to connect to any part of the application! 


## Multiple step classes
After a while the amount of methods in your step class might become too big to keep an overview.
Typically, when a step class becomes too big, you'll split it in two, creating a new step class.
Cucumber has no issue with this, since your feature files can always access all your step classes.
Let's try this out.

1. Create a new step class called InputSteps
2. Move the `@Given("The numbers {int} and {int}")` method from CalculationSteps to the InputSteps class.

After moving the method we immediately run into a problem. The InputSteps don't have access to the `leftHand` and `rightHand` fields.
We could move these fields as well to the InputSteps, but the CalculationSteps needs those fields as well.
How can we share these fields between these two step classes?

## Sharing state
With Spring this issue is easily resolved. What we need to do is to create a Component that is shared between the two step classes.

1. Create a new class in the spring package called Input.
2. This class needs to have two fields: leftHand and rightHand
3. Create getters and setters for these fields as well.
4. Lastly add the `@Component` annotation to the class

The Input class is now a component where you can store and retrieve data from, a sort of small database.

## Using the state
1. Autowire the Input component in both step classes.
2. Remove the `leftHand` and `rightHand` fields in the step class(es) and use the Input component to store and retrieve your data.
3. You should now be able to make everything work again. Run your test. It should succeed.

## Persistent state
One more thing that might break things: state like the Input component persists between scenarios.
An example:

1. Add the following scenario to your feature file. Important: do it at the bottom of your feature file.
```gherkin
Scenario: Persistant state
    When Multiplying these with each other
    Then The result will be 578
```

You might have noticed that there is no `Given` in this scenario.
So which numbers are going to be multiplied?
Run your whole feature file, and we can find out!

## Scenario scope
As you might have guessed, the Input component remembers everything from the latest test.
We can not have that because this can lead to unexpected results. 
A good practice is that every test starts with a clean sheet.

How can we solve this? 
1. Add the `@ScenarioScope` annotation to the Input component.
2. Run your tests again.

This time your test should fail because the fields in Input are null.
Every component with `@ScenarioScope` annotation will be completely reset after every scenario. Much beter.

Last thing to do is to fix our scenario. 
1. Add a `Given` that makes the scenario succeed.
2. Run your test. It should succeed.

## Summary
In this codelab you have seen how you can make Cucumber use Spring, opening possibilities to interact with the application framework directly or sharing state between steps.

Next up, we'll bring both Cucumber and Selenium together.
