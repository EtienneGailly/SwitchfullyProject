package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.assertj.core.error.ShouldBeWritable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import javax.xml.xpath.XPath;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.How.*;

@Component
public class BooksPage {

    private ChromeDriver chromeDriver;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-book-overview/div/div")
    private WebElement booksDiv;

    @FindBy(how = ID, using = "title")
    private WebElement titleInput;

    @FindBy(how = ID, using = "author")
    private WebElement authorInput;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-book-overview/div/form/button")
    private WebElement searchButton;

    public BooksPage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public WebElement getBooksDiv() {
        return booksDiv;
    }

    public void enterBookTitle(String title) {
        titleInput.sendKeys(title);
    }

    public void enterBookAuthor(String author) {
        authorInput.sendKeys(author);
    }

    public BooksPage clickSearchButton() {
        int oldSize = chromeDriver.findElements(By.cssSelector("div[class = 'col-lg-3 col-md-6 mb-3']")).size();
        searchButton.click();
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> (chromeDriver.findElements(By.cssSelector("div[class = 'col-lg-3 col-md-6 mb-3']")).size() != oldSize));
        return this;
    }

    public String getFirstResultTitleText() {
        return chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-book-overview/div/div/div/div/div[1]/h5")).getText();
    }

    public String getFirstResultAuthorText() {
        return chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-book-overview/div/div/div/div/div[1]/p")).getText();
    }

    public List<String> getResultsTitles(){
        List<WebElement> resultTitleElements = chromeDriver.findElements(By.cssSelector("h5[class = 'card-title text-center']"));
        List<String> resultTitles = new ArrayList<String>();
        for (WebElement result : resultTitleElements) {
            resultTitles.add(result.getText());
        }
        return resultTitles;
    }

    public List<String> getResultsAuthors(){
        List<WebElement> resultAuthorElements = chromeDriver.findElements(By.cssSelector("p[class = 'card-text text-center']"));
        List<String> resultAuthors = new ArrayList<String>();
        for (WebElement result : resultAuthorElements) {
            resultAuthors.add(result.getText());
        }
        return resultAuthors;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
