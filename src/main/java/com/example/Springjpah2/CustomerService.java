package com.example.Springjpah2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements CustomerServiceInterface{

// private final static -> create this variable only once.
// private final -> create this variable for every object/instance.
// First one saves memory, go for it.
// final static means this variable is a constant and only associates with the class itself, i.e. "one constant variable per class"
// while final means "one constant variable per instance".
// As a result, you cannot put a final static variable in the class' constructor since the constructor involves in new an instance.
@Autowired
private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {

        return customerRepository.findAll();
    }

    public Customer findById(Long id){
        return customerRepository.findById(id).orElse(null);
    }

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id){
       customerRepository.deleteById(id);
    }









}
