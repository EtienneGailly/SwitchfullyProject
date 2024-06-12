package com.switchfully.solution;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class ElementSelectionPage {
    private ChromeDriver driver;

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

    public ElementSelectionPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public ElementSelectionPage open() {
        driver.get("https://archive.switchfully.com/track/test/element-selection/");
        return this;
    }

    public String getParagraphText() {
        return paragraph.getText();
    }

    public String getSpanText() {
        return span.getText();
    }

    public ElementSelectionPage addItem(String itemToAdd) {
        addItem.sendKeys(itemToAdd);
        addItemButton.click();
        return this;
    }

    public List<String> getListItemList() {
        List<String> result = new ArrayList<>();
        for(WebElement element: elementList) {
            result.add(element.getText());
        }
        return result;
    }
}
