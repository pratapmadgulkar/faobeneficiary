package org.fao.bdtms.dao.impl;

import org.fao.bdtms.dao.UserDao;
import org.fao.bdtms.hibernate.entity.UserEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {

	  @Autowired
	   private SessionFactory sessionFactory;
	  
	public UserEntity saveInternalUserDetails(UserEntity user) {		
		  sessionFactory.getCurrentSession().save(user);
	      return user;
	}

	/*@Override
	public CreateUser get(long id) {
		return sessionFactory.getCurrentSession().get(CreateUser.class, id);
	}

	@Override
	public List<CreateUser> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long id, CreateUser user) {
		 Session session = sessionFactory.getCurrentSession();
		 session.flush();
		
	}

	@Override
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		  CreateUser user = session.byId(CreateUser.class).load(id);
	      session.delete(user);
		
	}*/
	

	
}
