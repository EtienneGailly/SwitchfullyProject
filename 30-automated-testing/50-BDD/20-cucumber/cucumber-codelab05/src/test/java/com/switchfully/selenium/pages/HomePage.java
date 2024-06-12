package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static org.openqa.selenium.support.How.ID;

@Component
public class HomePage {

    private ChromeDriver chromeDriver;
    private LoginPage loginPage;

    @FindBy(how = ID, using = "login-nav-button")
    private WebElement loginLink;

    public HomePage(ChromeDriver chromeDriver, LoginPage loginPage) {
        this.chromeDriver = chromeDriver;
        this.loginPage = loginPage;
    }

    public HomePage open() {
        chromeDriver.get("https://digibooky.netlify.app/");
        return this;
    }

    public LoginPage goToLogin() {
        loginLink.click();
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.loginPage.getLoginButton().isDisplayed());
        return loginPage;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
