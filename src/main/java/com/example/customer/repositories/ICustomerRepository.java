package com.example.customer.repositories;

import com.example.customer.models.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}
