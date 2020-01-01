package com.work.microservices.service;

import com.work.microservices.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.net.URI;
import java.util.UUID;

//BeerService

@Slf4j
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
    public URI saveBeer(BeerDto beerDto) {
        return URI.create("New resource string");
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {

        //TODO - implement this service
        return beerDto;
    }

    @Override
    public URI updateSavedBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(UUID beerId) {

        log.debug("Deleting a beer with id: " + beerId.toString());
    }

}
