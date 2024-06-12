package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static org.openqa.selenium.support.How.*;

@Component
public class LoginPage {

    private ChromeDriver chromeDriver;
    private ProfilePage profilePage;

    @FindBy(how = ID, using = "email")
    private WebElement emailInput;

    @FindBy(how = ID, using = "password")
    private WebElement passwordInput;

    @FindBy(how = XPATH, using = "//button[@type='submit']")
    private WebElement loginButton;

    public LoginPage(ChromeDriver chromeDriver, ProfilePage profilePage) {
        this.chromeDriver = chromeDriver;
        this.profilePage = profilePage;
    }

    public LoginPage enterCredentials(String username, String password) {
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        return this;
    }

    public ProfilePage clickLoginButton() {
        this.loginButton.click();
        new WebDriverWait(this.chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.profilePage.getProfileDiv().isDisplayed());
        return profilePage;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
