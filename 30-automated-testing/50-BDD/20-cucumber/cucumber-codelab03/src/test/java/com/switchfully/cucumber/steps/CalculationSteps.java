package com.switchfully.cucumber.steps;

import com.switchfully.spring.Calculator;
import com.switchfully.spring.Input;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculationSteps {
    @Autowired
    private Input input;
    private Integer solution;
    @Autowired
    private Calculator calculator;

    @When("Adding these together")
    public void adding_these_together() {
        solution = calculator.add(input.getLeftHand(), input.getRightHand());
    }

    @Then("The result will be {int}")
    public void the_result_will_be(Integer solution) {
        Assertions.assertThat(this.solution).isEqualTo(solution);
    }

    @When("Subtracting one from the other")
    public void subtractingTheseFromEachOther() {
        solution = calculator.subtract(input.getLeftHand(), input.getRightHand());
    }

    @When("Multiplying these with each other")
    public void multiplyingTheseWithEachOther() {
        solution = calculator.multiply(input.getLeftHand(), input.getRightHand());
    }

    @When("Dividing one with the other")
    public void dividingOneWithTheOther() {
        solution = calculator.divide(input.getLeftHand(), input.getRightHand());
    }
}
