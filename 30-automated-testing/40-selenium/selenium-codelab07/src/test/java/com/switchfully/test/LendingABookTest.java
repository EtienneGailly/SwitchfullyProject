package com.switchfully.test;

import com.switchfully.config.ScreenshotExtension;
import com.switchfully.config.SeleniumConfiguration;
import com.switchfully.pages.HomePage;
import com.switchfully.pages.ProfilePage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SeleniumConfiguration.class)
@ExtendWith(ScreenshotExtension.class)
public class LendingABookTest {

    @Autowired
    private HomePage homePage;
    @Autowired
    private ProfilePage profilePage;

    @Test
    void givenLordQueenBookIsNotLent_whenLoggingInAndBrowsingToLordQueenThenLendingIt_thenLordQueenIsAddedToMyBooks() {
        homePage.open()
                .goToLogin()
                .logIn("koen@mail.com", "passkoen")
                .clickBooksLink()
                .openBookDetails()
                .lendBook();
        profilePage.waitUntilCurrentLentBooksDivIsDisplayed();
        Assertions.assertThat(profilePage.getLentBooksTitles()).contains("I am as I think, I think as I am");
    }
}