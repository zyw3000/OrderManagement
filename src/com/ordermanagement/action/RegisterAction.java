package com.ordermanagement.action;

import java.io.IOException;
import java.util.Date;

import net.sf.json.JSONObject;

import com.ordermanagement.dao.CustomerDao;
import com.ordermanagement.dao.EnterpriseDao;
import com.ordermanagement.model.Customer;
import com.ordermanagement.model.Enterprise;

public class RegisterAction extends BaseActionSupport {
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
	public void register() throws IOException{
		String type=req.getParameter("type");
		if(type.equals("客户")){
			String jsonString = req.getParameter("customer");
			Customer customer=Customer.parseJsonString(jsonString);
			String tel=customer.getTel();
			customer.setUsername(tel);
			customer.setPassword(tel.substring(tel.length()-7,tel.length()-1));
			customer.setRegisterTime(new Date());
			if(customerDao.addCustomer(customer)){
				post(customerDao.findCustomer(customer.getUsername(), customer.getPassword()).toJsonString());
			}
		}else if(type.equals("企业")){
			String jsonString = req.getParameter("enterprise");
			Enterprise enterprise = Enterprise.parseJsonString(jsonString);
			String username = enterprise.getTel();
			enterprise.setUsername(username);
			enterprise.setPassword(username);
			enterprise.setRegisterTime(new Date());
			if(enterpriseDao.addEnterprise(enterprise)){
				post(enterpriseDao.findEnterprise(enterprise.getUsername(), enterprise.getPassword()).toJsonString());
			}
			
		}
		
		
		
		
	}
}
