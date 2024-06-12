package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class HeaderPage {
    private WebDriver webDriver;

    private ProfilePage profilePage;

    private RegisterPage registerPage;

    private BooksPage booksPage;

    @FindBy(how = How.ID, using = "profile-link")
    private WebElement profileLink;

    @FindBy(how = How.XPATH, using = "//a[text()='Books']")
    private WebElement booksLink;

    @FindBy(how = How.ID, using = "register-nav-link")
    private WebElement registerLink;

    public HeaderPage(WebDriver webDriver, ProfilePage profilePage, RegisterPage registerPage, BooksPage booksPage) {
        this.webDriver = webDriver;
        this.profilePage = profilePage;
        this.registerPage = registerPage;
        this.booksPage = booksPage;
    }

    public ProfilePage goToProfilePage() {
        profileLink.click();
        return profilePage;
    }

    public RegisterPage goToRegisterPage() {
        registerLink.click();
        return registerPage;
    }

    public BooksPage goToBooksPage() {
        booksLink.click();
        return booksPage;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(webDriver, this);
    }



}
