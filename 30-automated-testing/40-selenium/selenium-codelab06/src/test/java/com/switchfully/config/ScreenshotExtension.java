package com.switchfully.config;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class ScreenshotExtension implements TestWatcher {

    public static final String FAILED_PREFIX = "FAILED";

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        takeScreenshot(
                SpringExtension.getApplicationContext(context).getBean(WebDriver.class),
                getFileName(context, FAILED_PREFIX)
        );
    }

    private void takeScreenshot(WebDriver driver, String fileName) {
        Optional<File> screenshotFile = getScreenshotFile(driver);
        screenshotFile.ifPresent(screenshot -> copy(screenshot, getDestinationFile(fileName)));
    }

    private File getDestinationFile(String fileName) {
        new File("target/selenium").mkdirs();
        return new File("target/selenium/" + fileName);
    }

    private String getFileName(ExtensionContext context, String prefix) {
        return prefix + "-" + context.getRequiredTestClass().getSimpleName() + "-" + context.getRequiredTestMethod().getName() + "-screenshot.png";
    }

    private void copy(File originalFile, File destinationFile) {
        try {
            FileCopyUtils.copy(originalFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Optional<File> getScreenshotFile(WebDriver driver) {
        if (driver instanceof TakesScreenshot) {
            return Optional.of(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
        }
        return Optional.empty();
    }

}
