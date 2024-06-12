package com.switchfully;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;

public class MyFirstSeleniumTest {

  @Test
  void aSeleniumTest() {
    System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
    ChromeDriver driver = new ChromeDriver();
    String login = "student";
    String password = "spidermanismyhero";
    driver.get("https://" + login + ":" + password + "@training.switchfully.com/track/testing/training-page/selecting-elements.html");
    WebElement element = driver.findElement(By.id("paragraph"));
    Assertions.assertThat(element.getText()).isEqualTo("I am some text in a paragraph");
    driver.quit();
  }

  @Test
  void aSecondSeleniumTest() {
    System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
    ChromeDriver driver = new ChromeDriver();
    String login = "student";
    String password = "spidermanismyhero";
    driver.get("https://" + login + ":" + password + "@training.switchfully.com/track/testing/training-page/selecting-elements.html");
    WebElement element = driver.findElement(By.id("span"));
    Assertions.assertThat(element.getText()).isEqualTo("I am some text in a span");
    driver.quit();
  }

  @Test
  void aThirdTest() {
    System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
    ChromeDriver driver = new ChromeDriver();
    String login = "student";
    String password = "spidermanismyhero";
    driver.get("https://" + login + ":" + password + "@training.switchfully.com/track/testing/training-page/selecting-elements.html");
    new Actions(driver).scrollByAmount(0, 250).perform();
    WebElement element = driver.findElement(By.id("add-item"));
    element.sendKeys("Strawberry");
    WebElement element2 = driver.findElement(By.cssSelector("button.btn-primary:nth-child(3)"));
    element2.click();
    WebElement element3 = driver.findElement(By.cssSelector("li.list-group-item:last-child"));
    Assertions.assertThat(element3.getText()).isEqualTo("Strawberry");
    driver.quit();
  }

  public URL getChromeDriverUrl() {
    try {
      return ResourceUtils.getURL("classpath:drivers/chromedriver.exe");
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}