package org.fao.bdtms.hibernate.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserEntity {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "USER_ID")
	     private Long id;	
	    @Column(name = "COUNTRY")
		private String country;	   
	    @Column(name = "USER_TYPE")
		private String userType;
	    @Column(name = "EMAIL")
		private String email;
	    @Column(name = "ALTERNATE_EMAIL")
	    private String alternateEmail;
	    @Column(name = "FIRST_NAME")
		private String firstName;
	    @Column(name = "LAST_NAME")
		private String lastName;
	    @Column(name = "JOB_TITLE")
		private String jobTitle;
	    @Column(name = "WORK_PHONE")
		private long workPhone;
	    @Column(name = "CELL_PHONE")
	    private int cellPhone;	   
		@Column(name = "ACTIVATE_FROM")
		private Date activateFrom;
	    @Column(name = "ACTIVATE_TILL")
		private Date activateTill;
	    @Column(name = "NOTES")
		private String notes; 
	    @Column(name = "CREATED_BY")
		private String createdBy;
	    @Column(name = "MODIFIED_BY")
		private String modifiedBy;
	    
	    @OneToMany(fetch=FetchType.LAZY, targetEntity=ActivitiesEntity.class, cascade=CascadeType.ALL)
		@JoinColumn(name = "USER_ID", referencedColumnName="USER_ID")		 
		private Set Activites;
	   
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
	public long getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(long workPhone) {
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
		public Set getActivites() {
			return Activites;
		}
		public void setActivites(Set activites) {
			Activites = activites;
		}
	 

}
