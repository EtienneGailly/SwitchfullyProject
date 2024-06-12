package com.switchfully.cucumber.steps;

import com.switchfully.selenium.pages.BooksPage;
import com.switchfully.selenium.pages.HomePage;
import com.switchfully.selenium.pages.LoginPage;
import com.switchfully.selenium.pages.ProfilePage;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Map;

public class bookSearchSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private ProfilePage profilePage;
    private BooksPage booksPage;

    public bookSearchSteps(HomePage homePage, LoginPage loginPage, ProfilePage profilePage, BooksPage booksPage) {
        this.homePage = homePage;
        this.loginPage = loginPage;
        this.profilePage = profilePage;
        this.booksPage = booksPage;
    }

    @Before
    public void login() {
        homePage.open().goToLogin().enterCredentials("koen@mail.com","passkoen").clickLoginButton();
    }

    @Given("I go to the books page")
    public void goingToTheBooksPage() {
        profilePage.clickBooksButton();
    }

    @Given("I fill in {string} as title")
    public void fillInTitle(String title) {
        booksPage.enterBookTitle(title);
    }

    @Given("I fill in {string} as author")
    public void fillInAuthor(String author) {
        booksPage.enterBookAuthor(author);
    }

    @When("When I press the search button")
    public void clickSearchButton() {
        booksPage.clickSearchButton();
    }

    @Then("I see one book with title {string} and author {string}")
    public void seeOneBookWithTitleAndAuthor(String title, String author) {
        Assertions.assertEquals(title, booksPage.getFirstResultTitleText());
        Assertions.assertEquals(author, booksPage.getFirstResultAuthorText());
    }

    @Then("I see the following list of books")
    public void seeListOfBooksByAuthor(List<Book> books) {
        List<String> booksResultsTitles = booksPage.getResultsTitles();
        List<String> booksResultsAuthors = booksPage.getResultsAuthors();
        for (Book book : books) {
            Assertions.assertTrue(booksResultsTitles.contains(book.getTitle()));
            Assertions.assertTrue(booksResultsAuthors.contains(book.getAuthor()));
        }
    }

    @DataTableType
    public Book book(Map<String, String> row) {
        return new Book(row.get("title"), row.get("author"));
    }



}
