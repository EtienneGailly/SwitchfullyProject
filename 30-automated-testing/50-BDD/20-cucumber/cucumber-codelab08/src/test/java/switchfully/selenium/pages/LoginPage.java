package switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static org.openqa.selenium.support.How.ID;

@Component
public class LoginPage {
    private ChromeDriver chromeDriver;

    @FindBy(how = ID, using = "kc-login")
    public WebElement loginButton;

    @FindBy(how = ID, using = "username")
    public WebElement loginField;

    @FindBy(how = ID, using = "password")
    public WebElement passwordField;

    @FindBy(how = ID, using = "input-error")
    public WebElement inputError;

    public LoginPage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public LoginPage fillInCredentials(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        return this;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public WebElement getInputError() {
        return inputError;
    }

    public void waitForErrorMessagedDisplayed() {
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.getInputError().isDisplayed());
    }
    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }


}
