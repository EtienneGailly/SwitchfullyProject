package com.switchfully.cucumber.steps;

import com.switchfully.cucumber.state.LogIn;
import com.switchfully.selenium.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProfileSteps {

    private ProfilePage profilePage;

    private LogIn logIn;

    public ProfileSteps(ProfilePage profilePage, LogIn logIn) {
        this.profilePage = profilePage;
        this.logIn = logIn;
    }

    @Then("I can see that the inss is {string}")
    public void thenICanSeeTheInss(String inss) {
        profilePage.assertThatInss(inss);
    }

    @And("all my credentials are correctly displayed on the profile page")
    public void allMyCredentialsAreCorrectlyDisplayedOnTheProfilePage() {
        profilePage.assertThatInss(logIn.getRegister().getInss());
        profilePage.assetThatEmail(logIn.getRegister().getUsername());
        profilePage.assetThatAddress(logIn.getRegister().getStreetName() + " " + logIn.getRegister().getStreetNumber() + ", " + logIn.getRegister().getPostalCode() + " " + logIn.getRegister().getCity());
    }
}
