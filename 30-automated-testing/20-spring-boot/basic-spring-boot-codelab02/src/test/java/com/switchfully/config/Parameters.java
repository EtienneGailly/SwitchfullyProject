package com.switchfully.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class Parameters {

    @Value("${app.name}")
    private String name;

    @Value("${app.password}")
    private String password;

    @Value("${app.url}")
    private String url;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
