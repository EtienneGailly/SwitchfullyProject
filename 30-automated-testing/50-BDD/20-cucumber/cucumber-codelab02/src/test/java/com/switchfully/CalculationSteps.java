package com.switchfully;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class CalculationSteps {

    private Integer leftHand;
    private Integer rightHand;
    private Integer solution;

    @Given("The numbers {int} and {int}")
    public void givenTwoNumbers(Integer lefthand, Integer righthand) {
        this.leftHand = lefthand;
        this.rightHand = righthand;
    }

    @When("Adding these together")
    public void addingNumbersTogether() {
        this.solution = leftHand + rightHand;
    }

    @When("Subtracting the first from the second")
    public void subtractingNumberFromAnotherNumber() {
        this.solution = rightHand - leftHand;
    }

    @When("Multiplying these together")
    public void multiplyingNumbersTogether() {
        this.solution = leftHand * rightHand;
    }

    @When("Dividing the first by the second")
    public void dividingNumberByAnotherNumber() {
        this.solution = leftHand / rightHand;
    }

    @Then("The result will be {int}")
    public void checkingResult(Integer solution) {
        Assertions.assertThat(this.solution).isEqualTo(solution);
    }
}


