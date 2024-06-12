package com.switchfully.cucumber.steps;

import com.switchfully.cucumber.state.LogIn;
import com.switchfully.cucumber.data.Register;
import com.switchfully.selenium.pages.HomePage;
import com.switchfully.selenium.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;

    private LogIn logIn;

    public RegisterSteps(HomePage homePage, RegisterPage registerPage, LogIn logIn) {
        this.homePage = homePage;
        this.registerPage = registerPage;
        this.logIn = logIn;
    }

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        homePage.open()
                .clickRegisterLink();
    }

    @When("I register a random account")
    public void iRegisterARandomAccount() {
        Register register = Register.randomRegister();
        logIn.setRegister(register);
        registerPage.fillInInss(register.getInss())
                .fillInFirstName(register.getFirstName())
                .fillInLastName(register.getLastName())
                .fillInUsername(register.getUsername())
                .fillInPassword(register.getPassword())
                .fillInStreetName(register.getStreetName())
                .fillInStreetNumber(register.getStreetNumber())
                .fillInCity(register.getCity())
                .fillInPostalCode(register.getPostalCode())
                .clickRegister()

        ;

    }
}
