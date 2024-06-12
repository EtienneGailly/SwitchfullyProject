package com.switchfully.pages;

import jakarta.annotation.PostConstruct;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

@Component
public class ProfilePage {

    private ChromeDriver chromeDriver;
    private BooksPage booksPage;

    @FindBy(how = ID, using = "inss")
    private WebElement inssField;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-profile/main/div[2]/div[2]/div/div[1]/div[2]/input")
    private WebElement firstBookLentISBNInput;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-header/header/nav/div/div[1]/ul[1]/li[1]/a")
    private WebElement booksLink;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-profile/main/div[2]/div[1]/div")
    private WebElement profileDiv;

    @FindBy(how = XPATH, using = "/html/body/app-root/div/app-profile/main/div[2]/div[2]")
    private WebElement currentLentBooksDiv;

    public ProfilePage(ChromeDriver chromeDriver, BooksPage booksPage) {
        this.chromeDriver = chromeDriver;
        this.booksPage = booksPage;
    }

    public ProfilePage assertThatInss(String inss) {
        Assertions.assertThat(inssField.getAttribute("value")).isEqualTo(inss);
        return this;
    }

    public BooksPage clickBooksLink() {
        booksLink.click();
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.booksPage.getBooksDiv().isDisplayed());
        return booksPage;
    }

    public String getFirstBookLentISBNText() {
        try {
            new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                    .until((driver) -> this.currentLentBooksDiv.isDisplayed());
            return firstBookLentISBNInput.getAttribute("value");
        } catch (TimeoutException exception) {
            return "Timeout";
        }
    }

    public List<String> getLentBooksTitles() {
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.currentLentBooksDiv.isDisplayed());
        List<WebElement> lentBooksElements = this.chromeDriver.findElements(By.xpath("//h5[@class='card-header']"));
        List<String> lentBooksTitles = new ArrayList<String>();
        for (WebElement element : lentBooksElements) {
            lentBooksTitles.add(element.getText());
        }
        return lentBooksTitles;
    }

    public void waitUntilCurrentLentBooksDivIsDisplayed() {
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.currentLentBooksDiv.isDisplayed());
    }

    public WebElement getProfileDiv() {
        return profileDiv;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
