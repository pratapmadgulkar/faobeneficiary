package org.fao.bdtms.service;

import java.util.List;

import org.fao.bdtms.hibernate.entity.UserEntity;
import org.fao.bdtms.model.CreateUser;
import org.fao.bdtms.response.ServiceResponse;


public interface UserService {
	
	  ServiceResponse<CreateUser>  save(CreateUser user);
	 /*  UserEntity get(long id);
	   List<CreateUser> list();
	   void update(long id, CreateUser user);
	   void delete(long id);*/
}
