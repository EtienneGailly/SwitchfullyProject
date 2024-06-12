package com.switchfully.test;

import com.switchfully.config.ScreenshotExtension;
import com.switchfully.config.SeleniumConfiguration;
import com.switchfully.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SeleniumConfiguration.class)
@ExtendWith(ScreenshotExtension.class)
public class LoginTest {

    @Autowired
    private HomePage homePage;

    @Test
    void login() {
        homePage.open()
                .goToLogin()
                .logIn("koen@mail.com", "passkoen")
                .assertThatInss("1234567");
    }
}
