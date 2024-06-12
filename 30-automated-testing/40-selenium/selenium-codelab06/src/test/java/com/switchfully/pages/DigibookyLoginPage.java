package com.switchfully.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

@Component
@Scope("webDriver")
public class DigibookyLoginPage {
    ChromeDriver driver;
    @Autowired
    DigibookyProfilePage digibookyProfilePage;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-login/main/div/form/button")
    private WebElement loginButton;

    @FindBy(how = ID, using = "email")
    private WebElement emailField;

    @FindBy(how = ID, using = "password")
    private WebElement passwordField;

    public DigibookyLoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public DigibookyLoginPage open() {
        driver.get("https://digibooky.netlify.app/login");
        return this;
    }

    public DigibookyProfilePage clickLoginButton() {
        loginButton.click();
        return digibookyProfilePage;
    }

    public DigibookyLoginPage enterCredentials(String email, String password){
        emailField.click();
        emailField.sendKeys("koen@mail.com");
        passwordField.click();
        passwordField.sendKeys("passkoen");
        return this;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }
}
