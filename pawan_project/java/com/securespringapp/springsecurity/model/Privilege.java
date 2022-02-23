package com.securespringapp.springsecurity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "privilege")
public class Privilege  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
	@Column(name = "PrivilegeName", nullable = false, unique = false)
	private String privilege;
	@Column(name = "Description", nullable = false, unique = false)
	private String description;
	@Column(name = "Status", nullable = false, unique = false)
	private String status;
	@Column(name = "CreatedOn", nullable = true,unique = false)
	private Date createdOn;
	@Column(name = "CreatedBy", nullable = false,unique = false)
	private String createdBy;
	@Column(name = "ModifiedOn", nullable = true,unique = false)
	private Date modifiedOn;
	@Column(name = "ModifiedBy", nullable = true,unique = false)
	private String modifiedBy;

	@ManyToMany(mappedBy = "privileges")
	private Collection<Role> roles = new ArrayList<Role>();

	public Long getId() {
		return id;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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

	
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getPrivilege() {
	    return privilege;
	}

	public void setPrivilege(String privilege) {
	    this.privilege = privilege;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
	    return "Privilege [id=" + id + ", privilege=" + privilege + ", description=" + description + ", status="
		    + status + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn
		    + ", modifiedBy=" + modifiedBy + ", roles=" + roles + "]";
	}

	

	

}
