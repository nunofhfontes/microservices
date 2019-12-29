package com.work.microservices.service;

import com.work.microservices.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {

        return CustomerDto.builder().id(customerId)
                .customerName("Beer Drinken Zorb")
                .build();
    }
}
