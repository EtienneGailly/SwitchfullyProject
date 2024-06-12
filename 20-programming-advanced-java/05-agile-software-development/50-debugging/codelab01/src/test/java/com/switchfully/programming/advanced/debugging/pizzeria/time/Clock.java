package com.switchfully.programming.advanced.debugging.pizzeria.time;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Profile("test")
public class Clock implements TimeProvider {

    private LocalDateTime setTime;

    @Override
    public LocalDateTime getCurrentTime() {
        if(setTime != null) {
            return setTime;
        }
        return LocalDateTime.now();
    }

    public void freeze() {
        setTime = LocalDateTime.now();
    }

    public void reset(){
        setTime = null;
    }

    public void freezeAt(LocalDateTime localDateTime) {
        setTime = localDateTime;
    }
}
