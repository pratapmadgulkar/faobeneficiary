package org.fao.bdtms.sevice.impl;

import java.util.HashSet;
import java.util.Set;

import org.fao.bdtms.dao.UserDao;
import org.fao.bdtms.hibernate.entity.ActivitiesEntity;
import org.fao.bdtms.hibernate.entity.UserEntity;
import org.fao.bdtms.model.CreateUser;
import org.fao.bdtms.response.ServiceResponse;
import org.fao.bdtms.response.ServiceStatusCodeType;
import org.fao.bdtms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {
	
	@Autowired
	  private UserDao userDao;

	@Transactional
	public ServiceResponse<CreateUser>  save(CreateUser user) {	
		ServiceResponse<CreateUser> serviceResponse = ServiceResponse
				.getInstance();
		UserEntity usrEntity=new UserEntity();
		usrEntity.setCountry(user.getCountry());		
		usrEntity.setUserType("I");
		usrEntity.setEmail(user.getEmail());
		usrEntity.setAlternateEmail(user.getAlternateEmail());
		usrEntity.setFirstName(user.getFirstName());
		usrEntity.setLastName(user.getLastName());
		usrEntity.setWorkPhone(user.getWorkPhone());
		usrEntity.setCellPhone(user.getCellPhone());
		usrEntity.setJobTitle(user.getJobTitle());
		usrEntity.setActivateFrom(user.getActivateFrom());
		usrEntity.setActivateTill(user.getActivateTill());
		
		   ActivitiesEntity c1=new ActivitiesEntity();
	       c1.setActivityId(500);
	       c1.setActivityName("ACTIVITY A");
	 
	       ActivitiesEntity c2=new ActivitiesEntity();
	       c2.setActivityId(501);
	       c2.setActivityName("ACTIVITY B");
	 
	       Set s=new HashSet();
	       s.add(c1);
	       s.add(c2);	 
	       usrEntity.setActivites(s);
		
		usrEntity=userDao.saveInternalUserDetails(usrEntity);
		
		user.setId(usrEntity.getId());
		user.setFirstName(usrEntity.getFirstName());
		user.setJobTitle(usrEntity.getJobTitle());
		serviceResponse.setResult(user);
		serviceResponse.setSuccessful(Boolean.TRUE);
		serviceResponse.setStatusCode(ServiceStatusCodeType.SUCCESS);
		return serviceResponse;
		//return userDao.saveInternalUserDetails(usrEntity);
	}

	/*@Override
	public CreateUser get(long id) {	
		return userDao.get(id);
	}

	@Override
	public List<CreateUser> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}

	@Override
	public void update(long id, CreateUser user) {
		userDao.update(id, user);
		
	}

	@Override
	public void delete(long id) {
		userDao.delete(id);
		
	}*/

}
