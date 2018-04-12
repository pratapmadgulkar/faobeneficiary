package org.fao.bdtms.dao;

import org.fao.bdtms.hibernate.entity.ActivityEntity;
import org.fao.bdtms.hibernate.entity.UserEntity;

public interface ActivityDao {
	 ActivityEntity saveActivity(ActivityEntity activity);

}
