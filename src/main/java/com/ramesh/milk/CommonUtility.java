package com.ramesh.milk;

public class CommonUtility {
	/*
	 * create table milk_customer(
	  cid INT NOT NULL AUTO_INCREMENT, 
	  first_name VARCHAR(100) NOT NULL,
	  last_name VARCHAR(40) NOT NULL,
	  village_name varchar(40) not null,
	  phone_number varchar(40),
	  milk_quantity varchar(40),
	  submission_date DATE,
	  PRIMARY KEY (cid) )

	 */
	public static final String INSERT_QUERY="INSERT INTO `milk_customer` (`first_name`, `last_name`, `village_name`, `phone_number`, `milk_quantity`) VALUES (?,?,?,?,?);";
}
