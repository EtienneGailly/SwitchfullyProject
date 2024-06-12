package com.switchfully;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ElementSelectionPage {
    private ChromeDriver driver;
    private String login;
    private String password;

    @FindBy(how = How.ID, using = "paragraph")
    private WebElement paragraph;

    @FindBy(how = How.ID, using = "span")
    private WebElement span;

    @FindBy(how = How.ID, using = "add-item")
    private WebElement addItem;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Element']")
    private WebElement addItemButton;

    @FindBy(how = How.XPATH, using = "//ul/li")
    private List<WebElement> elementList;

    public ElementSelectionPage(ChromeDriver driver, String login, String password) {
        this.driver = driver;
        this.login = login;
        this.password = password;
    }

    public void open() {
        driver.manage().window().maximize();
        driver.get("https://" + login + ":" + password + "@training.switchfully.com/track/testing/training-page/selecting-elements.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }

    public String getParagraphText() {
        return paragraph.getText();
    }

    public String getSpanText() {
        return span.getText();
    }

    public void addListItem(String newListItemText) {
        addItem.sendKeys(newListItemText);

        WebElement addItemButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addItemButton.click();
    }

    public List<String> getListItemList() {
        List<String> result = new ArrayList<>();
        for(WebElement element: elementList) {
            result.add(element.getText());
        }
        return result;
    }
}
