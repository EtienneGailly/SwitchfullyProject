package com.switchfully.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;

public class MyBetterOrganizedTest {

    private ChromeDriver driver;

    private ElementSelectionPage page;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        page = new ElementSelectionPage(driver);
        PageFactory.initElements(driver, page);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void aSeleniumTest() {
        page.open();
        Assertions.assertThat(page.getParagraphText()).isEqualTo("I am some text in a paragraph");
    }

    @Test
    void anotherSeleniumTest() {
        page.open();

        Assertions.assertThat(page.getSpanText()).isEqualTo("I am some text in a span");
    }

    @Test
    void addingAnElementToTheList() {
        page.open()
                .addItem("Strawberry");


        List<String> listItemList = page.getListItemList();
        Assertions.assertThat(listItemList.get(listItemList.size() - 1)).isEqualTo("Strawberry");
    }

    @Test
    void addingTwoElementsToTheList() {
        List<String> listItemList =
                page.open()
                        .addItem("Strawberry")
                        .addItem("Stock")
                        .getListItemList();

        Assertions.assertThat(listItemList).contains("Strawberry", "Stock");
    }

    public URL getChromeDriverUrl() {
        try {
            return ResourceUtils.getURL("classpath:drivers/chromedriver-113.exe");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
