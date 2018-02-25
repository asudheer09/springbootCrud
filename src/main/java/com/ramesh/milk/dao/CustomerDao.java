package com.ramesh.milk.dao;

import java.util.List;

import com.ramesh.milk.model.Customer;

public interface CustomerDao {
	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomers();
}

