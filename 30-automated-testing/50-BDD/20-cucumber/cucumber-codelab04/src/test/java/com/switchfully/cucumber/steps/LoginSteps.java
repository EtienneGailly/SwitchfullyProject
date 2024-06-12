package com.switchfully.cucumber.steps;

import com.switchfully.selenium.pages.HomePage;
import com.switchfully.selenium.pages.LoginPage;
import com.switchfully.selenium.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private ProfilePage profilePage;

    public LoginSteps(HomePage homePage, LoginPage loginPage, ProfilePage profilePage) {
        this.homePage = homePage;
        this.loginPage = loginPage;
        this.profilePage = profilePage;
    }

    @Given("I go to the login page")
    public void goingToTheLoginPage() {
        this.loginPage = this.homePage.open().goToLogin();
    }

    @Given("I fill in {string} as username and {string} as password")
    public void fillInUsernameAndPassword(String username, String password) {
        this.loginPage.enterCredentials(username, password);
    }

    @When("When I press the login button")
    public void pressLoginButton() {
        this.profilePage = this.loginPage.clickLoginButton();
    }

    @Then("I am navigated to the profile page")
    public void checkThatIAmNavigatedToTheProfilePage() {
        Assertions.assertTrue(profilePage.getProfileDiv().isDisplayed());
    }

    @Then("I can see that my inss is {int}")
    public void checkThatICanSeeThatMyInssIs(int inss) {
        Assertions.assertEquals(Integer.toString(inss), profilePage.getINSS());
    }
}
