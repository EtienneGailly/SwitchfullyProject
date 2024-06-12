package com.switchfully.cucumber;

import com.switchfully.selenium.SeleniumConfig;
import com.switchfully.selenium.webdriver.WebDriverQuitter;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SeleniumConfig.class)
public class CucumberSpringConfiguration {

    @Autowired
    private WebDriverQuitter webDriverQuitter;

    @After
    public void closeDriver(Scenario scenario) {
        WebDriverQuitter webDriveQuitter;
        webDriverQuitter.quit();
    }
}
