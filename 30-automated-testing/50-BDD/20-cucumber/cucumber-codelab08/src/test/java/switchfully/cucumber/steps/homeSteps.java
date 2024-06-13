package switchfully.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import switchfully.selenium.pages.HomePage;

import java.util.List;

public class homeSteps {
    private HomePage homePage;

    public homeSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("The homepage URL")
    public void theHomepageURL() {}

    @When("I visit the homepage")
    public void iVisitTheHomepage() {
        homePage.open();
    }

    @Then("I see the homepage")
    public void iSeeTheHomepage()
    {
        Assertions.assertTrue(homePage.getAppHome().isDisplayed());
    }

}
