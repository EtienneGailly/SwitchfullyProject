package switchfully.cucumber.steps;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import switchfully.selenium.pages.HomePage;
import switchfully.selenium.pages.RegisterPage;

import java.util.List;
import java.util.Map;

public class registerSteps {
    private HomePage homePage;
    private RegisterPage registerPage;

    public registerSteps(HomePage homePage, RegisterPage registerPage) {
        this.homePage = homePage;
        this.registerPage = registerPage;
    }

    @DataTableType
    public User user(Map<String, String> entry) {
        return new User(entry.get("display name"), entry.get("email"), entry.get("password"));
    }

    @Given("a visitor is on the register page with display name {string}, email {string}, password {string}, and repeat password {string}")
    public void aVisitorIsOnTheRegisterPageWithDetails(String displayName, String email, String password, String repeatPassword){
//        User user = users.get(0);
//        homePage.open();
//        homePage.goToRegister();
//        registerPage.fillInRegisterForm(user.getDisplayName(), user.getEmail(), user.getPassword(), user.getRepeatPassword());
//        homePage.open();
//        homePage.goToRegister();
//        registerPage.fillInRegisterForm("test", "
    System.out.println("display name: " + displayName + " email: " + email + " password: " + password + " repeat password: " + repeatPassword);
}
@When("Clicking the register button")
    public void i_click_on_the_register_button() {
        registerPage.getSubmitButton().click();
    }

    @Then("I can log into my account")
    public void i_should_be_redirected_to_the_login_page() {
    }

    @Given("As a visitor I forget to fill in a {string} field or {string} field or {string} field or {string} field")
    public void as_a_visitor_I_forget_to_fill_in_a_field(String displayName, String email, String password, String repeatPassword) {
        System.out.println("display name: " + displayName + " email: " + email + " password: " + password + " repeat password: " + repeatPassword);
    }

}
