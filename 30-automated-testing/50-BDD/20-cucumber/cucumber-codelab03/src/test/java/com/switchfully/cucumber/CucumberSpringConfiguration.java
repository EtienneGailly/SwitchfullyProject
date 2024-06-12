package com.switchfully.cucumber;

import com.switchfully.spring.SpringConfiguration;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringConfiguration.class)
public class CucumberSpringConfiguration {
}
