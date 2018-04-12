package org.fao.bdtms.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACTIVITIES")
public class ActivitiesEntity {
	
	 @Id
	 @Column(name = "ACTIVITY_ID")
	 private int activityId;
	 
	 @Column(name = "ACTIVITY_NAME", length=20)
	 private String activityName;

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	 
	 

}
