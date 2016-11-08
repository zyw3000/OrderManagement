package com.ordermanagement.test;

import java.util.List;

import net.sf.json.JSONArray;

import org.hibernate.Hibernate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ordermanagement.dao.OrderDao;
import com.ordermanagement.model.Order;

public class tets2 {

	protected static ApplicationContext context=
		new ClassPathXmlApplicationContext("applicationContext.xml");
	public static void main(String[] args) {
		OrderDao dao = (OrderDao) context.getBean("orderDao");
		List<Order> list = dao.allOrder();
		JSONArray json = new JSONArray();
		for(Order o: list){
			//JSONObject jo = JSONObject.fromObject(o);
			json.add(o.toJsonString());
		}
		System.out.println(json.toString());
			
//		OrderDao dao = (OrderDao) context.getBean("orderDao");
//		Order o = dao.findOrder("1");
//		System.out.println(o.toJsonString());
	}

}
