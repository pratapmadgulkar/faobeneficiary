package org.fao.bdtms.controller;

import org.fao.bdtms.model.CreateUser;
import org.fao.bdtms.response.ServiceResponse;
import org.fao.bdtms.service.ActivityService;
import org.fao.bdtms.vo.ActivityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
	
	@Autowired
	private ActivityService ActivityService;
	
	 @PostMapping
	 public ServiceResponse<ActivityVo> addActivity(@RequestBody ActivityVo activity) {	
			
		    ServiceResponse<ActivityVo> serviceResponse = ActivityService.addActivity(activity);
		    if(serviceResponse.isSuccessful()){
		    	serviceResponse.getResult();	
		    }
	        return serviceResponse;
	     // return ResponseEntity.ok().body("New User has been saved with ID:" + id);
	   }

}
