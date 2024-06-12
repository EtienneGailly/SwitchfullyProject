# Creating a gherkin file

In this codelab you'll learn how to create a gherkin file.

## Context

Gherkin files are used to describe test scenarios. They are used in BDD (Behaviour Driven Development) and Cucumber.

What is in a gherkin file?
1. A gherkin file is a text file with a `.feature` extension.
2. A gherkin file starts with a feature description. You start the feature description with the keyword `Feature:`.
3. After the feature description there is a list of scenarios. Each scenario starts with the keyword `Scenario:`.
4. Each scenario has a list of steps. Each step starts with a keyword. The keywords are `Given`, `When`, `Then`, `And` and `But`.
5. If certain steps are repeated in multiple scenarios, you can use the keyword `Background` to describe the steps once.

Best practices :
1. Given steps should be used to set up the scenario. They should not contain any assertions.
2. When steps should be used to describe the action that is being tested.
3. Then steps should be used to describe the expected outcome of the action.
4. Find the right balance of details. A step definition needs to be flexible so that it can be reused. However, if it is too abstract the step is not documenting what is going on.
5. Avoid using any UI related keywords in the gherkin file. The gherkin file should be a description of the behaviour of the application. It should not contain any implementation details.
6. Stick to the Given, When, Then structure. Don't reuse the keywords again. If you need to add more steps, use the `And` or `But` keywords.

## Assignment

Given the following story definition:

    ### Story 6A: Register as member
    As a user I want to be able to register myself as a new Digibooky member, so I can perform additional actions.
    This member should have a unique INSS (social security number), last name, first name, email, street name, street number, postal code and city.
    - A member should contain a unique user identification number (create/choose your own, don't use INSS)
      - The INSS should be filled in and unique.
      - The email should be filled in and unique.
          - Also validate that the email is of the form `x@x.x`, where x can be any type and amount of letters and numbers.
      - The last name and city should be filled in.
      - Out of scope: validation of the postal code and the city.
      - Prioritization: Must-Have

1. Create a gherkin file for this feature.
2. Provide a feature description
3. Provide a scenario for the happy path
4. Provide the scenarios for the edge cases

Pointers:
1. This story is not isolated. Other stories have already been implemented. Keep this in mind when describing the scenario.
2. Make your steps flexible. The more you can reuse them the better.
3. Discuss with the rest of your team if you have the right phrasing for the steps. But remember, there is no perfect solution.
