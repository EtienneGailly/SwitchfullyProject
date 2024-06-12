package com.switchfully.test;

import com.switchfully.pages.DigibookyPage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.switchfully.config.SeleniumConfiguration.class)
class BooksLoadedTest {
    @Autowired
    DigibookyPage digibookyPage;

    @Test
    void booksLoadedTest() {
        Assertions.assertThat(digibookyPage.open("books").waitForServerToLoad().waitForBooksToLoad().areBooksLoaded()).isTrue();
    }
}