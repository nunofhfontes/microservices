package com.work.microservices.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(value="com.work.microservices", ignoreInvalidFields = false)
public class GenericClient {

    private String apihost;

    public void setApihost(String apihost) {
        this.apihost = apihost;
    }
}
