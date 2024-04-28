package com.example.productservice_fakestoreapi.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate getRestTemplate(){// here we are asking spring to create resttemplate bean and store it to use in the application
        return new RestTemplateBuilder().build();
    }
}
