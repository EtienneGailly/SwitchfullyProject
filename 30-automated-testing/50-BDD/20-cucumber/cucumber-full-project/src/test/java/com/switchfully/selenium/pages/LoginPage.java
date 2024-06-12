package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

@Component
public class LoginPage {

    private WebDriver webDriver;

    @FindBy(how = ID, using = "email")
    private WebElement emailInput;

    @FindBy(how = ID, using = "password")
    private WebElement passwordInput;

    @FindBy(how = XPATH, using = "//button[text()='Login']")
    private WebElement loginButton;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage logIn(String username, String password) {
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return this;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(webDriver, this);
    }
}
