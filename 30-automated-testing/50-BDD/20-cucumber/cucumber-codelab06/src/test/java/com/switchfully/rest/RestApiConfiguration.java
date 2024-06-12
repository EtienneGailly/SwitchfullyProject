package com.switchfully.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
@ComponentScan
public class RestApiConfiguration {
    @Bean
    public ProfessorClient professorClient(WebClient webClient) {
        return HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build()
                .createClient(ProfessorClient.class);
    }

    @Bean
    public WebClient getClient(@Value("${funiversity.url}") String funiversityUrl) {
        return WebClient.builder()
                .baseUrl(funiversityUrl)
                .build();
    }
}
