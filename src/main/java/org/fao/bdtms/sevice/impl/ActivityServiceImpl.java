package org.fao.bdtms.sevice.impl;

import org.fao.bdtms.dao.ActivityDao;
import org.fao.bdtms.hibernate.entity.ActivityEntity;
import org.fao.bdtms.model.CreateUser;
import org.fao.bdtms.response.ServiceResponse;
import org.fao.bdtms.response.ServiceStatusCodeType;
import org.fao.bdtms.vo.ActivityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class ActivityServiceImpl {
	
	@Autowired
	private ActivityDao activityDao;
	
	 public ServiceResponse<ActivityVo> addActivity(@RequestBody ActivityVo activityVo){
		 ServiceResponse<ActivityVo> serviceResponse = ServiceResponse
					.getInstance();
		 ActivityEntity activityEntity =new  ActivityEntity();
		 activityEntity.setCountry(activityVo.getCountry());
		 activityEntity.setActivityName(activityVo.getActivityName());
		 activityEntity.setActivityCode(activityVo.getActivityCode());
		 activityEntity.setStartDate(activityVo.getStartDate());
		 activityEntity.setStatus(activityVo.getStatus());
		 activityEntity.setActivityType(activityVo.getActivityType());
		 activityEntity.setDescription(activityVo.getDescription());
		 activityEntity.setDistributionCycle(activityVo.getDistributionCycle());
		 
		 activityEntity = activityDao.saveActivity(activityEntity);
		 
		 activityVo.setActivityName(activityEntity.getActivityName());
		 activityVo.setActivityType(activityEntity.getActivityType());
		 serviceResponse.setResult(activityVo);
		 serviceResponse.setSuccessful(Boolean.TRUE);
		 serviceResponse.setStatusCode(ServiceStatusCodeType.SUCCESS);
		 
		return serviceResponse;
		 
	 }

}
