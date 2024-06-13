package switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static org.openqa.selenium.support.How.*;

@Component
public class HomePage {
    private ChromeDriver chromeDriver;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    @FindBy(how = XPATH, using = "/html/body/app-root/app-layout/div/app-header/div/nav/div/div/ul/li[2]/a")
    private WebElement loginButton;

    @FindBy(how = CSS, using = "app-home")
    private WebElement appHome;

    @FindBy(how = XPATH, using = "/html/body/app-root/app-layout/div/app-header/div/nav/div/div/ul/li[3]/a")
    private WebElement registerButton;

    public HomePage(ChromeDriver chromeDriver, LoginPage loginPage, RegisterPage registerPage) {
        this.chromeDriver = chromeDriver;
        this.loginPage = loginPage;
        this.registerPage = registerPage;
    }

    public HomePage open() {
        chromeDriver.get("https://switchfully-testing-lms.netlify.app/");
        return this;
    }

    public RegisterPage goToRegister() {
        registerButton.click();
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.registerPage.getSubmitButton().isDisplayed());
        return registerPage;
    }

    private WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getAppHome() {
        return appHome;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }

}
