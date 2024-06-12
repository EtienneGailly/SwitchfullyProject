package com.switchfully.cucumber;

import com.switchfully.rest.Professor;
import com.switchfully.rest.ProfessorClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class Steps {
    private Professor professor;
    private ProfessorClient professorClient;
    private List<Professor> professorList;

    public Steps(ProfessorClient professorClient) {
        this.professorClient = professorClient;
    }

    @Given("I have access to the application and want to add a professor")
    public void setup() {
        this.professor = new Professor("Rudy", "TheGOAT");
    }

    @When("I send the request to add the professor")
    public void sendAddProfessorRequest() {
        professorClient.addProfessor(this.professor);
    }

    @Then("The professor is added to the list")
    public void checkIfProfessorIsInList() {
        professorList = professorClient.getAllProfessors();
        Assertions.assertTrue(professorList.contains(professor));
    }
}
