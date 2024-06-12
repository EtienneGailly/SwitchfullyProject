package com.switchfully.selenium.pages;

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
public class ProfilePage {

    private ChromeDriver chromeDriver;
    private BooksPage booksPage;

    @FindBy(how = ID, using = "inss")
    private WebElement inssField;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-profile/main/div[2]/div[1]/div")
    private WebElement profileDiv;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-header/header/nav/div/div[1]/ul[1]/li[1]/a")
    private WebElement booksButton;

    public ProfilePage(ChromeDriver chromeDriver, BooksPage booksPage) {
        this.chromeDriver = chromeDriver;
        this.booksPage = booksPage;
    }

    public BooksPage clickBooksButton() {
        this.booksButton.click();
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> booksPage.getBooksDiv().isDisplayed());
        return booksPage;
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
