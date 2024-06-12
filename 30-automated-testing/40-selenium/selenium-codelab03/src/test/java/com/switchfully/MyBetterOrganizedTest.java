package com.switchfully;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class MyBetterOrganizedTest {
    private ChromeDriver driver;
    private ElementSelectionPage elementSelectionPage;

    @Test
    void aSeleniumTest() {
        Assertions.assertThat(elementSelectionPage.getParagraphText()).isEqualTo("I am some text in a paragraph");
    }

    @Test
    void anotherSeleniumTest() {
        Assertions.assertThat(elementSelectionPage.getSpanText()).isEqualTo("I am some text in a span");
    }

    @Test
    void addingAnElementToTheList() {
        elementSelectionPage.addListItem("Strawberry");
        String lastListItemText = elementSelectionPage.getListItemList().getLast(); //driver.findElement(By.xpath("//ul/li[last()]"));
        Assertions.assertThat(lastListItemText).isEqualTo("Strawberry");
    }

    @Test
    void addingTwoElementsToTheList() {
        elementSelectionPage.addListItem("Strawberry");
        elementSelectionPage.addListItem("Stock");
        Assertions.assertThat(elementSelectionPage.getListItemList()).contains("Strawberry", "Stock");
    }

    public URL getChromeDriverUrl() {
        try {
            return ResourceUtils.getURL("classpath:drivers/chromedriver.exe");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        String login = "student";
        String password = "spidermanismyhero";
        driver = new ChromeDriver(options);
        elementSelectionPage = new ElementSelectionPage(driver, login, password);
        elementSelectionPage.open();
        PageFactory.initElements(driver, elementSelectionPage);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
