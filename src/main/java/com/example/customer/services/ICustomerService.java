package com.example.customer.services;

import com.example.customer.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
