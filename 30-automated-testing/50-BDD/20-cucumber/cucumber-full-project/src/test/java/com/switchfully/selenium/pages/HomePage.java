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
public class HomePage {

    private WebDriver webDriver;

    private LoginPage loginPage;

    private RegisterPage registerPage;

    @FindBy(how = XPATH, using = "//a[text()='Login']")
    private WebElement loginLink;

    @FindBy(how = ID, using = "register-nav-button")
    private WebElement registerLink;

    public HomePage(WebDriver webDriver, LoginPage loginPage, RegisterPage registerPage) {
        this.webDriver = webDriver;
        this.loginPage = loginPage;
        this.registerPage = registerPage;
    }

    public HomePage open() {
        webDriver.get("http://localhost:4200/ ");
        return this;
    }

    public LoginPage clickLoginLink() {
        loginLink.click();
        return loginPage;
    }

    public RegisterPage clickRegisterLink() {
        registerLink.click();
        return registerPage;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(webDriver, this);
    }


}
