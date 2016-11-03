package com.ordermanagement.action;

import com.ordermanagement.dao.CustomerDao;
import com.ordermanagement.dao.EnterpriseDao;
import com.ordermanagement.model.Customer;
import com.ordermanagement.model.Enterprise;


public class UpdateAction extends BaseActionSupport {
	CustomerDao customerDao;
	EnterpriseDao enterpriseDao;
	
	public EnterpriseDao getEnterpriseDao() {
		return enterpriseDao;
	}

	public void setEnterpriseDao(EnterpriseDao enterpriseDao) {
		this.enterpriseDao = enterpriseDao;
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void update(){
		String type=req.getParameter("type");
		if(type.equals("客户")){
			String jsonString=req.getParameter("customer");
			Customer customer=Customer.parseJsonString(jsonString);
			customerDao.updateCustomer(customer);
		}else if(type.equals("企业")){
			String jsonString = req.getParameter("enterprise");
			Enterprise enterprise = Enterprise.parseJsonString(jsonString);
			enterpriseDao.updateEnterprise(enterprise);
		}
	}
}
