package com.work.microservices.service;

import com.work.microservices.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface CustomerService {

    public CustomerDto getCustomerById(UUID customerId);
    public CustomerDto saveNewCustomer(CustomerDto customerDto);
    public CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto);
    public void deleteById(UUID customerId);
}
