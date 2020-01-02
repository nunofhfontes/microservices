package com.work.microservices.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@ConfigurationProperties(value="com.work.microservices", ignoreInvalidFields = false)
public class GenericClient {

    public final String BEER_PATH = "/api/v1/beer";
    private String apihost;
    private final RestTemplate restTemplate;

    public GenericClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public void setApihost(String apihost) {
        this.apihost = apihost;
    }
}
