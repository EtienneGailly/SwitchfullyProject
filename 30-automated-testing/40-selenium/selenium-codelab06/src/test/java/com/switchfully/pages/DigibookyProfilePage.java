package com.switchfully.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.time.Duration;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

@Component
@Scope("webDriver")
public class DigibookyProfilePage {
    ChromeDriver driver;

    @FindBy(how = ID, using = "inss")
    private WebElement inss;

    public DigibookyProfilePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public DigibookyProfilePage open() {
        driver.get("https://digibooky.netlify.app/login/members/12");
        return this;
    }

    public String getInssText() {
        try {
            new WebDriverWait(driver, Duration.ofMillis(5000))
                    .until((driver) -> this.inss.isDisplayed());
            return inss.getAttribute("value");
        }
        catch(TimeoutException exception) {
            return "Timeout";
        }

    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }
}
