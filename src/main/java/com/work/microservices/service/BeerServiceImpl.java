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

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        return BeerDto.builder().id(UUID.randomUUID())
                .beerStyle("")
                .beerName("")
                .upc(null)
                .build();
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {

        //TODO - implement this service
        return beerDto;
    }

}
