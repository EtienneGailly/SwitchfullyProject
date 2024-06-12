package com.switchfully;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;

@SpringBootTest(classes = SeleniumConfiguration.class)
public class ListElementSelectionTest {

    @Autowired
    ElementSelectionPage elementSelectionPage;

    @Test
    void paragraphText() {
        String text = elementSelectionPage.open()
                .getParagraphText();

        Assertions.assertThat(text).isEqualTo("I am some text in a paragraph");
    }

    @Test
    void spanText() {
        String text = elementSelectionPage.open()
                .getSpanText();

        Assertions.assertThat(text).isEqualTo("I am some text in a span");
    }
}