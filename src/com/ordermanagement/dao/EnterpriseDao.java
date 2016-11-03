package com.ordermanagement.dao;

import com.ordermanagement.model.Enterprise;

public interface EnterpriseDao {
	public boolean addEnterprise(Enterprise enterprise);
	public Enterprise findEnterprise(String username, String password);
	public boolean updateEnterprise(Enterprise enterprise);
}
