package org.fao.bdtms.vo;

import java.io.Serializable;
import java.util.Date;

public class ActivityVo implements Serializable{

	private Long id;
	private String country;
	private String activityName;
	private String activityCode;
	private Date startDate;
	private String status;
	private String activityType;
	private Long distributionCycle;
	private String Description;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public Long getDistributionCycle() {
		return distributionCycle;
	}
	public void setDistributionCycle(Long distributionCycle) {
		this.distributionCycle = distributionCycle;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
