package com.work.microservices.service;

import com.work.microservices.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

//BeerService

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("FontenBeer")
                .beerStyle("Pilsner")
                .build();
    }
}
