package com.example.customer.repositories.impl;

import com.example.customer.models.Customer;
import com.example.customer.repositories.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer(1,"truong","truong@gmail.com","hanoi"));
        customers.add(new Customer(2,"truong2","truong2@gmail.com","hanoi"));
        customers.add(new Customer(3,"truong3","truong3@gmail.com","hanoi"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
