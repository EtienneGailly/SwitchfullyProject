# Cucumber with REST api

This codelab will teach you how to use Cucumber to test a REST api as an alternative to using Selenium.

## Context

While Selenium provides is a great tool to test web applications, its stability and speed are not always ideal.
An option is to not test the UI at all, but to test the REST api directly.

To do this we will be replacing the Page classes with Client classes.

## Assignment

We'll be testing the Funiveristy from the REST api module, but we'll test it using Cucumber.

### Feature file

Create a feature file where you will test the 'add a professor' feature.
Create a scenario in the file where you'll be adding a professor to the application and then check if the new professor is in the list of professors.

### Step definitions

For each of steps in the scenario, create a step definition.

### Client

To create a client class we need to add the right Spring dependency.

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
```

We can now create a client component that will be used to make requests to the REST api.

Create a java interface called ProfessorClient

We need two methods on this interface:
1. A method to add a professor
2. A method to get all professors

You'll need to make a Professor class to complete the signature of these methods.
A professor has a first name and a last name.

### Annotations
Annote the methods in the ProfessorClient interface with the right annotations to make them work.
You'll need to use the @*Exchange annotations.


### Making it a Spring component
Make a standard cucumber setup:
1. Setup a suite
2. Create a CucumberSpringConfiguration
3. Create a Spring Configuration file called RestApiConfiguration

### Making the client available in the step definitions
Add the following code to the RestApiConfiguration

```java
 @Bean
    public ProfessorClient professorClient(WebClient webClient) {
        return HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build()
                .createClient(ProfessorClient.class);
    }

    @Bean
    public WebClient getClient(@Value("${funiversity.url}") String funiversityUrl) {
        return WebClient.builder()
                .baseUrl(funiversityUrl)
                .build();
    }
```

4. Create an application.properties file and add the funiversity.url property. Give it `https://funiversity.herokuapp.com`


### Let the steps use the client
Now that we have a client, we can use it in the step definitions.

Inject the client in the Steps class.

Use the client to implement the step methods.

### Run the tests
Run your test it should pass.

Check `https://funiversity.herokuapp.com/professors` to see if the professor was added.


## Conclusion
That's it! You now can create a cucumber test that directly interacts with a REST api.
