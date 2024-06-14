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
import static org.openqa.selenium.support.How.XPATH;

@Component
public class ProfilePage {
    private ChromeDriver chromeDriver;

    @FindBy(how = XPATH, using = "/html/body/app-root/app-layout/div/div/app-user-profile")
    private WebElement appProfile;

    @FindBy(how = XPATH, using = "   /html/body/app-root/app-layout/div/div/app-user-profile/div[1]/p")
    private WebElement profileDisplayedEmail;

    public ProfilePage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public WebElement getAppProfile() {
        return appProfile;
    }

    public WebElement getProfileDisplayedEmail() {
        return profileDisplayedEmail;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }


}
