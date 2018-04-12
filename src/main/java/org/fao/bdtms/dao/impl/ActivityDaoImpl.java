package org.fao.bdtms.dao.impl;

import org.fao.bdtms.dao.ActivityDao;
import org.fao.bdtms.hibernate.entity.ActivityEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ActivityDaoImpl implements ActivityDao{

	 @Autowired
	   private SessionFactory sessionFactory;
	
	public ActivityEntity saveActivity(ActivityEntity activity) {
		sessionFactory.getCurrentSession().save(activity);
		return null;
	}
	

}
