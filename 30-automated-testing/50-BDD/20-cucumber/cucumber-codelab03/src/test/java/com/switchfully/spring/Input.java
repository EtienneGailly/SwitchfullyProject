package com.switchfully.spring;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class Input {
    private int leftHand;
    private int rightHand;

    public int getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(int leftHand) {
        this.leftHand = leftHand;
    }

    public int getRightHand() {
        return rightHand;
    }

    public void setRightHand(int rightHand) {
        this.rightHand = rightHand;
    }
}
