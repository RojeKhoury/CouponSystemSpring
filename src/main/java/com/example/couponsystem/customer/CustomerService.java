package com.example.couponsystem.customer;

import com.example.couponsystem.category.eCategory;
import com.example.couponsystem.coupon.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Service
public class CustomerService
{
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers()
    {
        return customerRepository.findAll();
    }
    
}