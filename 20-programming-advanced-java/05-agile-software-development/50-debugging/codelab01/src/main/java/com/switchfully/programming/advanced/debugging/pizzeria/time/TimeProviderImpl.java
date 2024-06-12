package com.switchfully.programming.advanced.debugging.pizzeria.time;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Profile("!test")
public class TimeProviderImpl implements TimeProvider {
    @Override
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
}
