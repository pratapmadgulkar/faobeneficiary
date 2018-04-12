package org.fao.bdtms.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACTIVITY")
public class ActivityEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACTIVITY_ID")
	private Long id;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "ACTIVITY_NAME")
	private String activityName;
	
	@Column(name = "ACTIVITY_CODE")
	private String activityCode;
	
	@Column(name = "START_DATE")
	private Date startDate;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "ACTIVITY_TYPE")
	private String activityType;
	
	@Column(name = "DISTRIBUTION_CYCLE")
	private Long distributionCycle;
	
	@Column(name = "DESCRIPTION")
	private String Description;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	 
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
