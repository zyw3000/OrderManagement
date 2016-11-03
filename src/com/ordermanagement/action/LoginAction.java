package com.ordermanagement.action;

import java.io.IOException;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.ordermanagement.dao.CustomerDao;
import com.ordermanagement.dao.EnterpriseDao;
import com.ordermanagement.model.Customer;
import com.ordermanagement.model.Enterprise;

public class LoginAction extends BaseActionSupport {
	
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
	public void login() throws IOException{
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String type=req.getParameter("type");
		if(type.equals("客户")){
			Customer  c=customerDao.findCustomer(username, password);
			post(c.toJsonString());
		}else if(type.equals("企业")){
			Enterprise e = enterpriseDao.findEnterprise(username, password);
			post(e.toJsonString());
		}
		
	}
}
