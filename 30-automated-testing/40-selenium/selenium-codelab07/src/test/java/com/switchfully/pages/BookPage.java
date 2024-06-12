package com.switchfully.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

@Component
public class BookPage {

    private ChromeDriver chromeDriver;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-book-details/div/div/div[1]/div/div[2]/a")
    private WebElement lendBookButton;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-book-details/div/div/div[1]/div")
    private WebElement bookDetailsDiv;


    public BookPage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public void lendBook() {
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.lendBookButton.isDisplayed());
        lendBookButton.click();
    }

    public WebElement getBookDetailsDiv() {
        return bookDetailsDiv;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }


}
