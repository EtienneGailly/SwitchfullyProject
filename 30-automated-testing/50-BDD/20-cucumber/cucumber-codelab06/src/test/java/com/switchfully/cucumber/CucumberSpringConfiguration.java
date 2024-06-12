package com.switchfully.cucumber;

import com.switchfully.rest.RestApiConfiguration;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = RestApiConfiguration.class)
public class CucumberSpringConfiguration {
}
