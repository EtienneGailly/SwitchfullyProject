package switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.CSS;

@Component
public class RegisterPage {
    private ChromeDriver chromeDriver;

    @FindBy(how = CSS, using = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(how = CSS, using = "input[formcontrolname='email']")
    private WebElement emailField;

    @FindBy(how = CSS, using = "input[formcontrolname='password']")
    private WebElement passwordField;

    @FindBy(how = CSS, using = "input[formcontrolname='repeatPassword']")
    private WebElement repeatPasswordField;

    @FindBy(how = CSS, using = "input[formcontrolname='displayName']")
    private WebElement displayNameField;

    public RegisterPage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }

}
