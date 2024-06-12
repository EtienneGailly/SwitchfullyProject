# My first Selenium Scenario

In this codelab you'll learn how you can automate a test scenario using Selenium

## Context
As a refresher we go over the steps needed to automate a scenario again.

1. Go through the test scenario manually.
   1. Write down which interactions you have (buttons, links, input fields) and which pages you visit.
   2. What is the thing you want to test at the end of your scenario?
2. Check if your Selenium framework has been set up correctly.
   1. Do you have the correct maven dependencies? If not, time to make it so!
   2. Do you have a Spring configuration class? If not, time to make it so!
3. Create a test class for your scenario.
4. Create a test method to test your first test case.
5. Autowire the page you start on.
   1. Which page is your starting point?
   2. Does that page already have a Page class? If not, time to create one.
6. What is your first interaction?
   1. Does the starting Page already have method to do this interaction? If not, time to create it!
7. In your test method open the starting page and call the method for the first step in your scenario.
8. Go through every other step of your scenario and create methods where necessary.

### Multiple pages
What to do if your scenario is going to test multiple pages?
For example in the following scenario you visit 3 different pages:
1. Go to the home page
2. Click the link to the login page
3. Fill in your credentials and press login.
4. Assert that after the successful login you're navigated to your profile page.

Solution 1:
For every page you visit you create a Page class and you autowire the 3 of them into your test.

```java
@Autowired
HomePage homePage;
@Autowired
LoginPage loginPage;
@Autowired
ProfilePage profilePage
```

Solution 2:
A Page will return another Page when relevant

```java
private LoginPage loginPage;

@FindBy(how = ID, using = "login-link")
public WebElement loginLink;

public LoginPage goToLogin() {
    loginLink.click();
    return loginPage;
}
```

With this knowledge you should be able to automate the following scenario.

## Task list
On [the Digibooky website](https://digibooky.netlify.app/) automate the following scenario.
1. Go to the homepage
2. Click the login button
3. Fill in the following credentials: koen@mail.com/passkoen
4. Press the login button
5. On the profile page check that the inss is equal to 1234567


### Extra hints
If you made use of the provided packages, it might be you have problems with your Pages not being Spring Beans. Look into the `@ComponentScan` annotation and its options to solve this problem.

You don't know what is going wrong? Either try to debug your test or add the screenshot extension to your test.
Adding `@ExtendWith(ScreenshotExtension.class)` to your test class will make it so that if your test fails it will take a screenshot before closing the screen.
You can find the screenshot in your target folder.

## Summary

You now should be able to automate your test scenarios.
