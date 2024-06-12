package com.switchfully.selenium.webdriver;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

@Component
public class ScreenshotTaker {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScreenshotTaker.class);

    private final WebDriver webDriver;

    public ScreenshotTaker(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void takeScreenshot(String fileName) {
        Optional<File> screenshotFile = getScreenshotFile(this.webDriver);
        screenshotFile.ifPresentOrElse(
                screenshot -> copy(screenshot, getDestinationFile(getFileName(fileName))),
                () -> Assertions.fail("Could not take screenshot")
        );
    }

    private File getDestinationFile(String fileName) {
        new File("target/selenium").mkdirs();
        return new File("target/selenium/" + fileName);
    }

    private String getFileName(String fileName) {
        return "FAILED" + "-" + fileName + "-screenshot.png";
    }

    private void copy(File originalFile, File destinationFile) {
        LOGGER.info("Creating screenshot: " + destinationFile.getName());
        System.out.println("Creating screenshot: " + destinationFile.getName());
        try {
            FileCopyUtils.copy(originalFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Optional<File> getScreenshotFile(WebDriver webDriver) {
        if (!(webDriver instanceof TakesScreenshot)) {
            return Optional.empty();
        }
        return Optional.of(((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE));
    }
}
