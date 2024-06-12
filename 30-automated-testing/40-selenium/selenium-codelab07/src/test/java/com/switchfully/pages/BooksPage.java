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
public class BooksPage {

    private ChromeDriver chromeDriver;
    private BookPage bookPage;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-book-overview/div/div")
    private WebElement booksDiv;

    @FindBy(how = XPATH, using = "//a[@href=\"/books/978-0-308-40615-5\"]")
    private WebElement lordQueenDetailsButton;

    public BooksPage(ChromeDriver chromeDriver, BookPage bookPage) {
        this.chromeDriver = chromeDriver;
        this.bookPage = bookPage;
    }

    public BookPage openBookDetails() {
        lordQueenDetailsButton.click();
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.bookPage.getBookDetailsDiv().isDisplayed()); //???
        return bookPage;
    }

    public WebElement getBooksDiv() {
        return booksDiv;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
