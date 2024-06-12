package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.ID;

@Component
public class ProfilePage {

    private WebDriver webDriver;

    @FindBy(how = ID, using = "inss")
    private WebElement inssField;

    @FindBy(how = ID, using = "email")
    private WebElement emailField;

    @FindBy(how = ID, using = "address")
    private WebElement addressField;

    public ProfilePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ProfilePage assertThatInss(String inss) {
        Assertions.assertThat(inssField.getAttribute("value")).isEqualTo(inss);
        return this;
    }

    public ProfilePage assetThatEmail(String username) {
        Assertions.assertThat(emailField.getAttribute("value")).isEqualTo(username);
        return this;
    }

    public ProfilePage assetThatAddress(String address) {
        Assertions.assertThat(addressField.getAttribute("value")).isEqualTo(address);
        return this;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(webDriver, this);
    }

}
