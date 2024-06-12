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
public class DigibookyPage {
    ChromeDriver driver;
    @Autowired
    private DigibookyLoginPage digibookyLoginPage;

    @FindBy(how = ID, using = "login-nav-button")
    private WebElement loginButton;

    public DigibookyPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public DigibookyPage open() {
        driver.get("https://digibooky.netlify.app/");
        return this;
    }

    public DigibookyLoginPage clickLoginButton() {
        loginButton.click();
        return digibookyLoginPage;
    }
    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }
}
