package com.ordermanagement.action;

import java.io.IOException;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.ordermanagement.dao.OrderDao;
import com.ordermanagement.model.Order;

public class OrderAction extends BaseActionSupport {
	OrderDao orderDao;
	
	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}


	public void findOrder() throws IOException{
		String id = req.getParameter("id");
		Order o = orderDao.findOrder(id);
		post(o.toJsonString());
	}
	
	public void findAllOrder() throws IOException{
		List<Order> list = orderDao.allOrder();
		JSONArray json = new JSONArray();
		for(Order o: list){
			JSONObject jo = JSONObject.fromObject(o.toJsonString());
			json.add(jo);
		}
		post(json.toString());
	}
	
	public void addOrder() throws IOException{
		String json = req.getParameter("order");
		Order o = Order.parseJsonString(json);
		if(orderDao.addOrder(o)){
			post("successs");
		}
		else post("error");
	}

}
