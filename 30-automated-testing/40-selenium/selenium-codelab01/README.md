# Running the selenium driver

The goal of this codelab is to learn how to start up the selenium driver

## Context

To write a selenium test we need to be able to interact with a browser from our java code.
This is done with a Driver object. This object will give you all the necessary tools to run your tests.


## Adding the Selenium 
1. Install the Driver library.
   1. To get access to the Driver class we need to add the right selenium dependency.
   2. Add to following to your pom file  
   ```xml
     <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <scope>test</scope>
     </dependency> 
   ``` 
   3. Refresh maven
   4. You should now have access to Driver classes of the following browsers: Chromium, Chrome, Edge, Firefox and Safari.
   
2. Use the Driver
   1. Go to `StartingSeleniumDriverTest` and inside the first test create a new Driver `ChromeDriver chromeDriver = new ChromeDriver()`
   2. Run your test
   3. You'll get an error like: `The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property`

## The browser driver
What is happening? Well, to use the Selenium Driver we need to have a driver from Chrome as well.
Yes, you read that right, the driver needs a driver.

This driver needs to be downloaded manually and saved somewhere in your project. 
Depending on the browser that you're using and the version of that browser, you'll need to install a different driver.
Since browsers are updated regularly, you'll need to reinstall this driver often.

Where can you get this driver?
Selenium has a nice list you can find [here](https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/#quick-reference).
Be sure to pick the version of the browser corresponding to the version of the browser you've installed on your laptop.

This process is quite annoying, but luckily you don't have to repeat it too often.
Still, Selenium is working on the Selenium Manager project to make this step automatic.
Since Selenium Manager is still in Beta we'll not cover it in this course.

## Task list (continued)
1. Installing the browser driver
   1. Download the correct browser driver
   2. Extract the zip
   3. The executable that is inside needs to be copied to resources/drivers
2. Tell selenium where it can find our newly downloaded driver
   1. Go back to `StartingSeleniumDriverTest`
   2. Add the following line **before** creating the ChromeDriver: `System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());`
   3. Add the following method to your test class 
   ```java
   public URL getChromeDriverUrl() {
        try {
            return ResourceUtils.getURL("classpath:drivers/<driver-file-name>");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    } 
   ```
   4. Replace `<driver-file-name>` with the name of your browser driver.
   5. Run your test again.
   6. If everything works correctly, a browser window should pop open and the test should succeed
   7. Are you getting an error stating 403 forbidden (among other things)? This happens quite often nowadays. There's a workaround for this. We will add certain options to our Chromedriver instance.
   Change your code to the following:
   ```java
   ChromeOptions options = new ChromeOptions();
   options.addArguments("--remote-allow-origins=*");
   ChromeDriver chromeDriver = new ChromeDriver(options);
   ```
   Now pass this ChromeOptions object on with the initialization of our ChromeDriver instance. Try again, everything should work now.


## Summary
In this codelab you've learned how to install and start a Selenium Driver

## What's next?
In the next chapter we'll see how we can use the Selenium Driver to write a simple test

