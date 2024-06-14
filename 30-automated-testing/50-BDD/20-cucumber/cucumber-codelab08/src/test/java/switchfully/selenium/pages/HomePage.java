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
    private ProfilePage profilePage;

    @FindBy(how = XPATH, using = "/html/body/app-root/app-layout/div/app-header/div/nav/div/div/ul/li[2]/a")
    private WebElement loginButton;

    @FindBy(how = CSS, using = "app-home")
    private WebElement appHome;

    @FindBy(how = XPATH, using = "/html/body/app-root/app-layout/div/app-header/div/nav/div/div/ul/li[3]/a")
    private WebElement registerButton;

    @FindBy(how = XPATH, using = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
    private WebElement profileButton;

    public HomePage(ChromeDriver chromeDriver, LoginPage loginPage, RegisterPage registerPage, ProfilePage profilePage) {
        this.chromeDriver = chromeDriver;
        this.loginPage = loginPage;
        this.registerPage = registerPage;
        this.profilePage = profilePage;
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

    public LoginPage goToLogin() {
        loginButton.click();
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.loginPage.getLoginButton().isDisplayed());
        return loginPage;
    }

    public ProfilePage goToProfile() {
        profileButton.click();
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.profilePage.getAppProfile().isDisplayed());
        return profilePage;
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

    public WebElement getProfileButton() {
        return profileButton;
    }

    public HomePage waitingForPageIsDisplayed() {
        new WebDriverWait(chromeDriver, Duration.ofMillis(5000))
                .until((driver) -> this.getAppHome().isDisplayed());
        return this;
    }

    public String getCurrentURL() {
        return chromeDriver.getCurrentUrl();
    }
}
