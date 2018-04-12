package org.fao.bdtms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class CreateUser implements Serializable  {
	  
	  
	   /**
	 * 
	 */
	private static final long serialVersionUID = -3736991831716549549L;
	
		private Long id;
		private String country;
		private String orgName;
		private String userType;
		private String email;
		private String alternateEmail;
		private String firstName;
		private String lastName;
		private String jobTitle;
		private int workPhone;
		private int cellPhone;
		private Date activateFrom;
		private Date activateTill;
		private String notes; 
		private String createdBy;
		private String modifiedBy;		
	   

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
	
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(int workPhone) {
		this.workPhone = workPhone;
	}
	public Date getActivateFrom() {
		return activateFrom;
	}
	public void setActivateFrom(Date activateFrom) {
		this.activateFrom = activateFrom;
	}
	public Date getActivateTill() {
		return activateTill;
	}
	public void setActivateTill(Date activateTill) {
		this.activateTill = activateTill;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
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
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	public int getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(int cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	   
	   
	   
	   

}
