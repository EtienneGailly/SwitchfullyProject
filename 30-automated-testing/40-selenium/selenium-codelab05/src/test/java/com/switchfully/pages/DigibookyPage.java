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

import java.time.Duration;

import static org.openqa.selenium.support.How.XPATH;

@Component
@Scope("webDriver")
public class DigibookyPage {
    ChromeDriver driver;

    @FindBy(how = XPATH, using = "//*[@id=\"backend-up\"]/i")
    private WebElement serverRunning;

    @FindBy(how = XPATH, using = "//html/body/app-root/div/app-book-overview/div/div")
    private WebElement booksDiv;

    public DigibookyPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public DigibookyPage open() {
        driver.get("https://digibooky.netlify.app/");
        return this;
    }

    public DigibookyPage open(String suffix) {
        driver.get("https://digibooky.netlify.app/"+suffix);
        return this;
    }

    public DigibookyPage waitForServerToLoad() {
        try {
            new WebDriverWait(driver, Duration.ofMillis(10000))
                    .until((driver) -> this.serverRunning.isDisplayed());
            return this;
        }
        catch(TimeoutException exception) {
            return this;
        }
    }

    public DigibookyPage waitForBooksToLoad() {
        new WebDriverWait(driver, Duration.ofMillis(10000))
                .until((driver) -> this.booksDiv.isDisplayed());
        return this;
    }

    public boolean areBooksLoaded() {
        return this.booksDiv.isDisplayed();
    }

    public boolean isServerRunning() {
        try{
            return this.serverRunning.isDisplayed();
        }
        catch(NoSuchElementException exception){
            return false;
        }
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }
}
