package com.securespringapp.springsecurity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "role")
public class Role implements Serializable {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "RoleName", nullable = false,unique = false)
	private String roleName;
	
	@Column(name = "Status", nullable = false,unique = false)
	private String status;
	
	@Column(name = "Description", unique = false)
	private String description;
	
	@Column(name = "CreatedOn", nullable = true, unique = false)
	private Date createdOn;
	
	@Column(name = "CreatedBy", nullable = true, unique = false)
	private String createdBy;
	
	@Column(name = "ModifiedOn", nullable = true,  unique = false)
	private Date modifiedOn;
	
	@Column(name = "ModifiedBy", nullable = true, unique = false)
	private String modifiedBy;

	@ManyToMany(fetch = FetchType.EAGER,cascade = { CascadeType.ALL })
	@JoinTable(name = "role_privilege", 
	joinColumns = { @JoinColumn(name = "roleId",referencedColumnName = "id") },
	inverseJoinColumns = {
	@JoinColumn(name = "privilegeId",referencedColumnName = "id") })
	
	private Collection<Privilege> privileges = new ArrayList<Privilege>();

	@ManyToMany(mappedBy = "roles")
	private Collection<User> users = new ArrayList<User>();
	
	
	
	
	
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

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	

	public String getRoleName() {
	    return roleName;
	}

	public void setRoleName(String roleName) {
	    this.roleName = roleName;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	public Collection<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Collection<Privilege> privileges) {
		this.privileges = privileges;
	}

	
	@Override
	    public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", status=" + status + ", description=" + description
			+ ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn +"]";
		}
	
	
}
