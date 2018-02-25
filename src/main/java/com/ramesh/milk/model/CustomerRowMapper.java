package com.ramesh.milk.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
		Customer customer= new Customer();
		customer.setFirstName(rs.getString("first_name"));
		customer.setLastName(rs.getString("last_name"));
		customer.setPhoneNumber(rs.getString("phone_number"));
		customer.setVillageName(rs.getString("village_name"));
		customer.setMilkQuantity(rs.getString("milk_quantity"));
		return customer;
	}

}
