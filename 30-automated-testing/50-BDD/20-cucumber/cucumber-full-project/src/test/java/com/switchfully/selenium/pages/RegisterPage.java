package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class RegisterPage {

    private WebDriver webDriver;

    @FindBy(how = How.ID, using = "inss")
    private WebElement inssInput;

    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstNameInput;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement lastNameInput;
    @FindBy(how = How.ID, using = "email")
    private WebElement emailInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInput;

    @FindBy(how = How.ID, using = "streetname")
    private WebElement streetnameInput;

    @FindBy(how = How.ID, using = "streetnumber")
    private WebElement streetnumberInput;

    @FindBy(how = How.ID, using = "postalcode")
    private WebElement postalcodeInput;

    @FindBy(how = How.ID, using = "city")
    private WebElement cityInput;

    @FindBy(how = How.XPATH, using = "//button[text()='Register']")
    private WebElement registerButton;


    public RegisterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public RegisterPage fillInInss(String inss) {
        inssInput.sendKeys(inss);
        return this;
    }

    public RegisterPage fillInFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public RegisterPage fillInLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public RegisterPage fillInUsername(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public RegisterPage fillInPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public RegisterPage fillInStreetName(String streetName) {
        streetnameInput.sendKeys(streetName);
        return this;
    }

    public RegisterPage fillInStreetNumber(String streetNumber) {
        streetnumberInput.sendKeys(streetNumber);
        return this;
    }

    public RegisterPage fillInCity(String city) {
        cityInput.sendKeys(city);
        return this;
    }

    public RegisterPage fillInPostalCode(String postalCode) {
        postalcodeInput.sendKeys(postalCode);
        return this;
    }

    public RegisterPage clickRegister() {
        registerButton.click();
        return this;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(webDriver, this);
    }

}


