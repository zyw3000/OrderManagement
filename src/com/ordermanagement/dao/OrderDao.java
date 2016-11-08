package com.ordermanagement.dao;

import java.util.List;

import com.ordermanagement.model.Order;

public interface OrderDao {
	public boolean addOrder(Order order);
	public Order findOrder(String id);
	public List allOrder();

}
