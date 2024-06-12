package com.switchfully.suite.tests;

import com.switchfully.config.Counter;
import com.switchfully.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = TestConfig.class)
public class SecondCounterTest {

    @Autowired
    private Counter counter;

    @Test
    void whenTheCounterHasBeenIncreaseInTheFirstTestItWillStayAtThatNumber() {
        assertThat(counter.getCounter()).isEqualTo(1);
    }
}