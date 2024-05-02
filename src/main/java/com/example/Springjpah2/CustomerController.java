package com.example.Springjpah2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    public CustomerServiceInterface customerServiceInterface;
    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerServiceInterface.findAll();
    }
    @GetMapping("/{id}")
    public Customer findById(@PathVariable Long id){
        return customerServiceInterface.findById(id);
    }
    @PostMapping
    public  Customer saveCustomer(@RequestBody Customer customer){
        return customerServiceInterface.saveCustomer(customer);
    }
}
