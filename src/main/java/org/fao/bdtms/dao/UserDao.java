package org.fao.bdtms.dao;

import java.util.List;

import org.fao.bdtms.hibernate.entity.UserEntity;
import org.fao.bdtms.model.CreateUser;

public interface UserDao {
	
	  UserEntity saveInternalUserDetails(UserEntity user);
	  /* CreateUser get(long id);
	   List<CreateUser> list();
	   void update(long id, CreateUser user);
	   void delete(long id);*/
}
