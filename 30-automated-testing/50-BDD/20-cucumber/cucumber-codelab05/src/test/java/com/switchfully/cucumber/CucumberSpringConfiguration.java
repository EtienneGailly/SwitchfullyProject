package com.switchfully.cucumber;

import com.switchfully.selenium.SeleniumConfig;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SeleniumConfig.class)
public class CucumberSpringConfiguration {
}
