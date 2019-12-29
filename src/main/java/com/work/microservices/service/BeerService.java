package com.work.microservices.service;

import com.work.microservices.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
