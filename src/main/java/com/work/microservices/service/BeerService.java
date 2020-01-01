package com.work.microservices.service;

import com.work.microservices.web.model.BeerDto;

import java.net.URI;
import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
    BeerDto saveNewBeer(BeerDto beerDto);
    public URI saveBeer(BeerDto beerDto);
    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
    public URI updateSavedBeer(BeerDto beerDto);
    void deleteById(UUID beerId);
}
