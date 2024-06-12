package com.switchfully.cucumber.steps;

import com.switchfully.spring.Input;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class InputSteps {
    @Autowired
    private Input input;

    @Given("The numbers {int} and {int}")
    public void givenTwoNumbers(Integer leftHand, Integer rightHand) {
        input.setLeftHand(leftHand);
        input.setRightHand(rightHand);
    }

}
