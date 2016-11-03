package com.ordermanagement.dao.Imp;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ordermanagement.dao.EnterpriseDao;
import com.ordermanagement.model.Enterprise;

public class EnterpriseDaoImp extends HibernateDaoSupport implements
		EnterpriseDao {

	public boolean addEnterprise(Enterprise enterprise) {
		List list = (List) getHibernateTemplate().find("from Enterprise where username=?",
				new String(enterprise.getUsername()));
		if(list.size()>0)
			return false;
		else{
			getHibernateTemplate().save(enterprise);
			return true;
		}
	}

	public Enterprise findEnterprise(String username, String password) {
		System.out.println(username + password);
		Enterprise enterprise;
		List list = (List) getHibernateTemplate().find("from Enterprise where username=? and password=?", 
				new String[]{username, password});
		if(list.size()>0){
			enterprise = (Enterprise) list.get(0);
			return enterprise;
		}
		return null;
	}

	public boolean updateEnterprise(Enterprise enterprise) {
//		Enterprise newEnterprise;
//		List list = getHibernateTemplate().find("from Enterprise e where e.username=? and e.password=?",
//				new String[]{enterprise.getUsername(), enterprise.getPassword()});
//		if(list.size()>0){
//			newEnterprise = (Enterprise) list.get(0);
//			
//			getHibernateTemplate().update(newEnterprise);
//			return true;
//		}else
//			return false;
		getHibernateTemplate().update(enterprise);
		return true;
	}

}
