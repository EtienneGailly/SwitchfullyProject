package switchfully.cucumber;

import switchfully.selenium.SeleniumConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SeleniumConfig.class)
public class CucumberSpringConfiguration {
}
