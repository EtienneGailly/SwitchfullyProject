package com.switchfully.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TestConfig {
    Parameters parameters = new Parameters();
}
