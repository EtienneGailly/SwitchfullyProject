package switchfully.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import switchfully.selenium.pages.HomePage;
import switchfully.selenium.pages.LoginPage;
import switchfully.selenium.pages.ProfilePage;
public class viewProfileSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private ProfilePage profilePage;

    public viewProfileSteps(HomePage homePage, LoginPage loginPage, ProfilePage profilePage) {
        this.homePage = homePage;
        this.loginPage = loginPage;
        this.profilePage = profilePage;
    }

    @Given("A student is logged in")
    public void givenAStudentWithAnExistingAccount() {
        homePage.open().goToLogin().fillInCredentials("studenttest@lms.com", "deadpoolismyhero").clickLoginButton();
    }

    @When("Navigating to their profile page using the navigation bar")
    public void navitatingToProfilePage() {
        homePage.goToProfile();
    }

//    @Then("Student will be navigated to their profile page")
//    public void studentWillBeNavigatedToProfilePage() {
//        Assertions.assertEquals("studenttest@lms.com", profilePage.getProfileDisplayedEmail().getText());
//    }

    @Then("Viewing their name and display name")
    public void viewingTheirNameAndDisplayName() {

    }

}
