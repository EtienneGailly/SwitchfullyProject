package switchfully.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.WebDriverWait;
import switchfully.selenium.pages.HomePage;
import switchfully.selenium.pages.LoginPage;

import java.time.Duration;

public class loginAsStudentSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    //private ProfilePage profilePage;

    public loginAsStudentSteps(HomePage homePage, LoginPage loginPage) {
        this.homePage = homePage;
        this.loginPage = loginPage;
    }

    @Given("A student with an existing account")
    public void givenStudentWithExistingAccount() {
        homePage.open();
    }

    @Given("A student with a non-existing account")
    public void givenStudentWithNonExistingAccount() {
        homePage.open();
    }

    @When("Going to the login page")
    public void iVisitTheHomepage() {
        homePage.goToLogin();
    }

    @When("Filling in their credentials : login = {string}, password = {string}")
    public void whenFillInCredentials(String login, String password) {
        loginPage.fillInCredentials(login, password);
    }

    @When("Pressing the login button")
    public void whenPressingTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @When("Filling in the wrong password : login = {string}, password = {string}")
    public void fillingInTheWrongPassword(String login, String password) {
        loginPage.fillInCredentials(login, password);
    }
    @Then("Student will be navigated to their profile page")
    public void studentIsNavigatedToProfilePage() {
        Assertions.assertEquals("https://switchfully-testing-lms.netlify.app/profile", homePage.getCurrentURL());
    }

    @Then("The message 'Logged in as student {string}' will be visible.")
    public void loggedInMessageIsVisible() {
    }

    @Then("A warning message will appear: {string}")
    public void warningMessageIsVisible(String errorMessage) {
        try {loginPage.waitForErrorMessagedDisplayed();}
        catch (Exception e){
            System.out.println("Login error message was not found");
        }
        Assertions.assertEquals(errorMessage, loginPage.getInputError().getText());
    }


}
