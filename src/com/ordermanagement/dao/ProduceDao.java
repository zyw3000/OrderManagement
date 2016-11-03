package com.ordermanagement.dao;

import java.util.List;

import com.ordermanagement.model.Produce;

public interface ProduceDao {
	public boolean addProduce(Produce produce);
	public List findProduceByName(String PName);
	public List findProduceByEnterprise(String enterpriseName);
	public List findAllProduces();
	public List findProduceByType(int typeId);
}
