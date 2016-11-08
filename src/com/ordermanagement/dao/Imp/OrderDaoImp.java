package com.ordermanagement.dao.Imp;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ordermanagement.dao.OrderDao;
import com.ordermanagement.model.Order;

public class OrderDaoImp extends HibernateDaoSupport implements OrderDao {

	public boolean addOrder(Order order) {
		getHibernateTemplate().save(order);
		return true;
	}

	public List allOrder() {
		List list = getHibernateTemplate().find("from Order");
		return list;
	}

	public Order findOrder(String id) {
		Order o;
		Integer i = Integer.parseInt(id);
		System.out.println(i);
		List list = getHibernateTemplate().find("from Order where id=?", i);
		if(list.size()>0){
			o = (Order) list.get(0);
			Hibernate.initialize(o.getCustomer());
			Hibernate.initialize(o.getProduce());
			return o;
		}
		else
			return null;
	}

}
