package com.example.Springjpah2;

import java.util.List;

public interface CustomerServiceInterface {
    public List<Customer> findAll();
    public Customer findById(Long id);
    public Customer saveCustomer(Customer customer);
    public void deleteCustomer(Long id);
}
