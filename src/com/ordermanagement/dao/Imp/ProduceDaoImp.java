package com.ordermanagement.dao.Imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ordermanagement.dao.ProduceDao;
import com.ordermanagement.model.Produce;

public class ProduceDaoImp extends HibernateDaoSupport implements ProduceDao {

	public boolean addProduce(Produce produce) {
		List list = getHibernateTemplate().find("from Produce where pname=?",new String[]{produce.getPname()});
		if(list.size()>0){
			return false;
		}
		else{
			getHibernateTemplate().save(produce);
			return true;
		}
	}

	public List findAllProduces() {
		List list = getHibernateTemplate().find("from Produce");
		return list;
	}

	public List findProduceByEnterprise(String enterpriseName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List findProduceByName(String PName) {
		List list = getHibernateTemplate().find("from Produce where pname='%" +PName + "%'");
		return list;
	}

	public List findProduceByType(int typeId) {
		//List list = getHibernateTemplate().find("from Produce where type");
		return null;
	}

}
