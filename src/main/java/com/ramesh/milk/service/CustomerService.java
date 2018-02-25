package com.ramesh.milk.service;

import java.util.List;

import com.ramesh.milk.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomers();
}
