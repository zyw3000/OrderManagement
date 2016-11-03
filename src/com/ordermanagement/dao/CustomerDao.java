package com.ordermanagement.dao;

import com.ordermanagement.model.Customer;

public interface CustomerDao {
	public boolean addCustomer(Customer customer);
	public Customer findCustomer(String username ,String password);
}
