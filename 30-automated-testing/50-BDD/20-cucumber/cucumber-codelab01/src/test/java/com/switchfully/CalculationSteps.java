package com.switchfully;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class CalculationSteps {
    private int lefthand;
    private int righthand;
    private int sum;

    @Given("The numbers {int} and {int}")
    public void givenTwoNumbers(Integer lefthand, Integer righthand) {
        this.lefthand = lefthand;
        this.righthand = righthand;
    }
    @When("Adding these together")
    public void whenAddingTwoNumbers() {
        this.sum = lefthand + righthand;
    }
    @Then("The result will be {int}")
    public void calculateResult(Integer result) {
        Assertions.assertThat(result).isEqualTo(sum);
    }
}
