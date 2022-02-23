package com.happiestminds.springsecurity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.apache.log4j.Logger;

/**
 * @author Pawan.kumar
 *
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "UserName", nullable = false,unique = true)
	private String userName;
	
	@Column(name = "FirstName",nullable=false, unique = false)
	private String firstName;
	
	@Column(name = "MiddleName", nullable = true,  unique = false)
	private String middleName;
	
	@Column(name = "LastName", nullable = false,  unique = false)
	private String lastName;
	
	@Column(name = "MobileNumber", nullable = false,  unique = false)
	private String mobileNumber;
	
	@Column(name = "EmailId", nullable = true,  unique = false)
	private String emailId;
	
	@Column(name = "Password", nullable = false, unique = false)
	private String password;
	
	@Column(name = "Status", nullable = false,  unique = false)
	private String status;
	
	@Column(name = "CreatedOn", nullable = true,  unique = false)
	private Date createdOn;
	
	@Column(name = "CreatedBy", nullable = true,  unique = false)
	private String createdBy;
	
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = { CascadeType.ALL })
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "userId",referencedColumnName="id") }, inverseJoinColumns = {
			@JoinColumn(name = "roleId",referencedColumnName="id") })
	private List<Role> roles = new ArrayList<Role>();

	public User(){
		
	}
	
	
	public User(User user){
		this.firstName=user.getFirstName();
		this.createdBy=user.getCreatedBy();
		this.createdOn=user.getCreatedOn();
		this.emailId=user.getEmailId();
		this.id=user.getId();
		this.lastName=user.getLastName();
		this.middleName=user.getMiddleName();
		this.mobileNumber=user.getMobileNumber();
		this.modifiedBy=user.getModifiedBy();
		this.modifiedOn=user.getModifiedOn();
		this.userName=user.getUserName();
		this.password=user.getPassword();
		this.status=user.getStatus();
		this.roles=user.getRoles();
	}
	

	/*public User(Long id, String userName, String firstName, String middleName, String lastName, String mobileNumber,
			String emailId, String password, String status, Date createdOn, String createdBy, List<Role> roles,
			Date modifiedOn, String modifiedBy) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.password = password;
		this.status = status;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.roles = roles;
		this.modifiedOn = modifiedOn;
		this.modifiedBy = modifiedBy;
	}*/

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name = "ModifiedOn", nullable = true, unique = false)
	private Date modifiedOn;
	@Column(name = "ModifiedBy", nullable = true, unique = false)
	private String modifiedBy;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

	@Override
	public String toString() {
	    return "User [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", middleName="
		    + middleName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
		    + ", password=" + password + ", status=" + status + ", createdOn=" + createdOn + ", createdBy="
		    + createdBy + ", roles=" + roles + ", modifiedOn=" + modifiedOn + ", modifiedBy=" + modifiedBy
		    + "]";
	}
	
	
	

}
