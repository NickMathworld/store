package com.paymentchain.customer.controller;

import com.paymentchain.customer.entity.Customer;
import com.paymentchain.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping()
    public List<Customer> list() {
        return customerRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer save = customerRepository.save(customer);
        return ResponseEntity.ok(save);
    }

}
