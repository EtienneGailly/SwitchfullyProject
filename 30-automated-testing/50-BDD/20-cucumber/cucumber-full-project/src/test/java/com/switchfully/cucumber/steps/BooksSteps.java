package com.switchfully.cucumber.steps;

import com.switchfully.cucumber.data.Book;
import com.switchfully.selenium.pages.BooksPage;
import com.switchfully.selenium.pages.HeaderPage;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class BooksSteps {

    private HeaderPage headerPage;

    @Autowired
    private BooksPage booksPage;

    @DataTableType
    public Book book(Map<String, String> row) {
        return new Book(row.get("title"), row.get("author"));
    }

    public BooksSteps(HeaderPage headerPage, BooksPage booksPage) {
        this.headerPage = headerPage;
        this.booksPage = booksPage;
    }

    @When("I navigate to the books overview page")
    public void navigateToBooksOverviewPage() {
        headerPage.goToBooksPage();
    }

    @Then("I can find the following books")
    public void iCanFindTheFollowingBooks(List<Book> books) {
        Assertions.assertThat(booksPage.getAllBooks()).containsAll(books);
    }
}
