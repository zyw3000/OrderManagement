package com.ordermanagement.dao.Imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ordermanagement.dao.CustomerDao;
import com.ordermanagement.model.Customer;

public class CustomerDaoImp extends HibernateDaoSupport implements CustomerDao {

	public boolean addCustomer(Customer customer) {
		List list=getHibernateTemplate().find("from Customer where Tel=?",customer.getTel());
		if(list.size()>0)return false;
		else {
			getHibernateTemplate().save(customer);
			return true;
		}
	}

	public Customer findCustomer(String username, String password) {
		List list=getHibernateTemplate().find("from Customer where username=? and password=?",new String[]{username,password});
		if(list.size()>0)return (Customer)list.get(0);
		return null;
	}

}
