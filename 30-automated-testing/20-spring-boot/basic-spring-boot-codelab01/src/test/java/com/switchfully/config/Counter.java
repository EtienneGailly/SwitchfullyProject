package com.switchfully.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Counter {

    private int counter = 0;

    public void increaseCounter() {
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }
}
