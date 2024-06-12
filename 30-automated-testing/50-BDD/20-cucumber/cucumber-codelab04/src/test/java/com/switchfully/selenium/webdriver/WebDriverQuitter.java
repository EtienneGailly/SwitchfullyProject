package com.switchfully.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
public class WebDriverQuitter {

    private WebDriver webDriver;

    public WebDriverQuitter(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void quit() {
        webDriver.quit();
    }
}
