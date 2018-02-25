package com.ramesh.milk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramesh.milk.dao.CustomerDaoImpl;
import com.ramesh.milk.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDaoImpl dao;
	
	@Override
	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
	}

	public List<Customer> getAllCustomers() {
		return dao.getAllCustomers();
	}

}
