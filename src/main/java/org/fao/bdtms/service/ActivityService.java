package org.fao.bdtms.service;

import org.fao.bdtms.model.CreateUser;
import org.fao.bdtms.response.ServiceResponse;
import org.fao.bdtms.vo.ActivityVo;
import org.springframework.web.bind.annotation.RequestBody;

public interface ActivityService {
	
	 public ServiceResponse<ActivityVo> addActivity(@RequestBody ActivityVo activityVo);

}
