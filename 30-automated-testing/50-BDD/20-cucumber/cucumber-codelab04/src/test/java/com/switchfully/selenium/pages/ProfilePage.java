package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

@Component
public class ProfilePage {

    private ChromeDriver chromeDriver;

    @FindBy(how = ID, using = "inss")
    private WebElement inssField;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-profile/main/div[2]/div[1]/div")
    private WebElement profileDiv;

    public ProfilePage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public WebElement getProfileDiv() {
        return profileDiv;
    }

    public String getINSS() {
        return inssField.getAttribute("value");
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
