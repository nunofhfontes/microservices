package com.work.microservices.client;

import com.work.microservices.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GenericClientTest {

    @Autowired
    GenericClient genericClient;

    @Test
    void getBeerById() {
        BeerDto dto = genericClient.getBeerById(UUID.randomUUID());

        assertNotNull(dto);
    }
}