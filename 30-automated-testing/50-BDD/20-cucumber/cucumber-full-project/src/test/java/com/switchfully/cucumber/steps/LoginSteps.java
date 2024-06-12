package com.switchfully.cucumber.steps;

import com.switchfully.cucumber.state.LogIn;
import com.switchfully.selenium.pages.HeaderPage;
import com.switchfully.selenium.pages.HomePage;
import com.switchfully.selenium.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private HomePage homePage;
    private HeaderPage headerPage;
    private LogIn logIn;

    public LoginSteps(HomePage homePage, HeaderPage headerPage, LogIn logIn) {
        this.homePage = homePage;
        this.headerPage = headerPage;
        this.logIn = logIn;
    }

    @Given("I am logged in as {string} with password {string}")
    public void iAmLoggedIn(String username, String password) {
        homePage.open()
                .clickLoginLink()
                .logIn(username, password);
    }

    @When("I am going to the profile page")
    public void goingToProfilePage() {
        headerPage.goToProfilePage();
    }

    @Then("I can log in with these same credentials")
    public void iCanLogInWithTheseSameCredentials() {
        iAmLoggedIn(logIn.getRegister().getUsername(), logIn.getRegister().getPassword());
    }

    @Given("I am not logged in")
    public void iAmNotLoggedIn() {
        homePage.open();
    }
}
