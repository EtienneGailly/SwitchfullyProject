package com.switchfully.selenium;

import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.time.Duration;

@Configuration
@ComponentScan({"com.switchfully.selenium","com.switchfully.cucumber.state"})
public class SeleniumConfiguration {

    /*
     * For the most mysterious reason on earth the return type of this method needs to be ChromeDriver
     * If you change the type to WebDriver, the bean will be null when trying to take a screenshot on failure.
     */
    @Bean
    @ScenarioScope
    public ChromeDriver webDriver(@Value("${webdriver.name}") String webdriverName) {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        return driver;
    }

    public URL getChromeDriverUrl() {
        try {
            return ResourceUtils.getURL("classpath:drivers/chromedriver.exe");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
