package com.ordermanagement.test;

import java.util.Date;

import net.sf.json.JSONObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ordermanagement.dao.CustomerDao;
import com.ordermanagement.dao.EnterpriseDao;
import com.ordermanagement.model.Customer;
import com.ordermanagement.model.Enterprise;

public class test extends ActionSupport{
	protected static ApplicationContext context=
		new ClassPathXmlApplicationContext("applicationContext.xml");
	public static void main(String[] args){
		EnterpriseDao dao = (EnterpriseDao) context.getBean("enterpriseDao");
		Enterprise enterprise = dao.findEnterprise("1001", "123456");
		System.out.println(enterprise.toJsonString());
		
		
		//enterprise.setAddress("ZhiJiang");
		//dao.updateEnterprise(enterprise);
		//System.out.println(enterprise.toString());
		
//		CustomerDao dao = (CustomerDao) context.getBean("customerDao");
//		Customer c = dao.findCustomer("13111111111", "123456");
//		System.out.println(c.toJsonString());
		
		/*Customer c=new Customer();
		c.setUsername("13111111111");
		c.setPassword("123456");
		c.setTel("13111111111");
		c.setAuthentication(1);
		c.setCname("¿Óœ»…˙");
		c.setCredit(0D);
		c.setLongitude(100.0D);
		c.setLatitude(100.0D);
		Date date=new Date();
		
		c.setRegisterTime(date);
		System.out.println(date.toString());
		c.setTotalConsumption(0D);
		
		String s=c.toJsonString();
		System.out.println(s);
		Customer c1=Customer.parseJsonString(s);
		System.out.println(c1.toJsonString());*/
		
		
	}
}
