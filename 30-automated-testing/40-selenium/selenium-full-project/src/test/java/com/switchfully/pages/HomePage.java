package com.switchfully.pages;

import com.switchfully.config.WebDriverScope;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.ID;
@Component
@WebDriverScope
public class HomePage extends BasePage {

    @Autowired
    private LoginPage loginPage;

    @FindBy(how = ID, using = "login-nav-button")
    private WebElement webElement;

    public HomePage open() {
        driver.get("http://archive.switchfully.com/track/test/digibooky");
        return this;
    }

    public LoginPage goToLogin() {
        webElement.click();
        return loginPage;
    }


}
