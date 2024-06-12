package com.switchfully.selenium.pages;

import com.switchfully.cucumber.data.Book;
import jakarta.annotation.PostConstruct;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BooksPage {

    private ChromeDriver webDriver;

    @FindBy(how = How.XPATH, using = "//div[@class='card']/div[@class='card-body']")
    public List<WebElement> bookList;

    public BooksPage(ChromeDriver webDriver) {
        this.webDriver = webDriver;
    }

    public List<Book> getAllBooks() {
        return bookList.stream()
                .map(book ->
                        new Book(
                                book.findElement(By.className("card-title")).getText(),
                                book.findElement(By.className("card-text")).getText()
                        )
                )
                .collect(Collectors.toList());
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(webDriver, this);
    }
}
