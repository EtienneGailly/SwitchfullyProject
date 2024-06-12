package com.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;

public class MyFirstSeleniumTest {
  @Test
  void aSeleniumTest() {
    System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
    ChromeDriver driver = new ChromeDriver();
    String username = "student";
    String password = "spidermanismyhero";
    driver.get("https://" + username + ":" + password + "@training.switchfully.com/track/testing/training-page/selecting-elements.html");
    WebElement element = driver.findElement(By.id("paragraph"));
    System.out.println(element.getText());
    Assertions.assertThat(element.getText()).isEqualTo("I am some text in a paragraph");
    driver.quit();
  }

  @Test
  void checkIfSpanTextEqualsIAmSomeTextInASpan() {
    System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
    ChromeDriver driver = new ChromeDriver();
    String username = "student";
    String password = "spidermanismyhero";
    driver.get("https://" + username + ":" + password + "@training.switchfully.com/track/testing/training-page/selecting-elements.html");
    WebElement element = driver.findElement(By.id("span"));
    System.out.println(element.getText());
    Assertions.assertThat(element.getText()).isEqualTo("I am some text in a span");
    driver.quit();
  }

  @Test
  void whenAddingNewElementToList_thenListShouldContainNewElement() {
    System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
    ChromeDriver driver = new ChromeDriver();
    String username = "student";
    String password = "spidermanismyhero";
    driver.get("https://" + username + ":" + password + "@training.switchfully.com/track/testing/training-page/selecting-elements.html");
    WebElement inputField = driver.findElement(By.id("add-item"));
    inputField.sendKeys("Strawberry");
    driver.findElement(By.xpath("/html/body/main/section/div/div[15]/div/div[2]/form/button")).click();
    WebElement element = driver.findElement(By.xpath("//*[@id='list']/li[last()]"));
    System.out.println(element.getText());
    Assertions.assertThat(element.getText()).isEqualTo("Strawberry");
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
