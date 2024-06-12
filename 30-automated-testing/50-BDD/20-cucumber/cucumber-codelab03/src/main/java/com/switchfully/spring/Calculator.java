package com.switchfully.spring;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(int leftHand, int rightHand) {
        return leftHand + rightHand;
    }

    public Integer subtract(Integer leftHand, Integer rightHand) {
        return rightHand - leftHand;
    }

    public Integer divide(Integer leftHand, Integer rightHand) {
        return leftHand / rightHand;
    }

    public Integer multiply(Integer leftHand, Integer rightHand) {
        return leftHand * rightHand;
    }
}
