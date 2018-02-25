package com.ramesh.milk.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ramesh.milk.CommonUtility;
import com.ramesh.milk.model.Customer;
import com.ramesh.milk.model.CustomerRowMapper;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void addCustomer(Customer customer) {
		template.update(CommonUtility.INSERT_QUERY, new Object[]{customer.getFirstName(),customer.getLastName(),customer.getVillageName(),customer.getPhoneNumber(),customer.getPhoneNumber()});
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		String sql="select * from milk_customer";
		return template.query(sql, new CustomerRowMapper());
	}

}
