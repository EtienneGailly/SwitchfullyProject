package com.switchfully.pages;

import com.switchfully.config.WebDriverScope;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@WebDriverScope
public class LoginPage extends BasePage {

    @FindBy
    private WebElement nonExistent;

    public void throwError() {
        nonExistent.click();
    }
}
