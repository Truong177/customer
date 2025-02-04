package com.example.customer.controllers;

import com.example.customer.models.Customer;
import com.example.customer.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("/customers")
    public String showList(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers",customers);
        return "list";
    }
}
