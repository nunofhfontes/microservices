package com.work.microservices.service;

import com.work.microservices.web.model.BeerDto;
import com.work.microservices.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {

        return CustomerDto.builder().id(customerId)
                .customerName("Beer Drinken Zorb")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {

        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Fonten")
                .build();
    }

    @Override
    public CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto) {

        //TODO -  implement this service accordingly
        return customerDto;
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer with ID: " + customerId.toString());
    }


}
