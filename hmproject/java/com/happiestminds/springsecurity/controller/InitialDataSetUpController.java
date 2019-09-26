package com.happiestminds.springsecurity.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.happiestminds.springsecurity.model.Privilege;
import com.happiestminds.springsecurity.model.Role;
import com.happiestminds.springsecurity.model.User;
import com.happiestminds.springsecurity.repository.IPrivilegeRepository;
import com.happiestminds.springsecurity.repository.IRoleRepository;
import com.happiestminds.springsecurity.repository.IUserRepository;



//@Service
//@Transactional
@RestController
@RequestMapping("/initial")
public class InitialDataSetUpController {
    
    @Autowired
    private PasswordEncoder passwordEncoder;

	@Autowired
	private IUserRepository userRepository;

	@Autowired
	private IRoleRepository roleRepository;

	@Autowired
	private IPrivilegeRepository privilegeRepository;

	
	@RequestMapping(value = "/setup", method = RequestMethod.GET, produces = "application/json")
	public String setInitialDataIntoDB() {

		System.out.println("setInitialDataIntoDB is called");

		Privilege insertPrivilege = createPrivilegeIfNotFound("INSERT_PRIVILEGE");
		Privilege updatePrivilege = createPrivilegeIfNotFound("UPDATE_PRIVILEGE");
		Privilege createPrivilege = createPrivilegeIfNotFound("CREATE_PRIVILEGE");
		Privilege deletePrivilege = createPrivilegeIfNotFound("DELETE_PRIVILEGE");
		Privilege viewPrivilege = createPrivilegeIfNotFound("VIEW_PRIVILEGE");
		Privilege readPrivilege = createPrivilegeIfNotFound("READ_PRIVILEGE");
		  Privilege writePrivilege = createPrivilegeIfNotFound("WRITE_PRIVILEGE");

		// Privilege viewprivilege1 =
		// privilegeRepository.findByName("VIEW_PRIVILEGE");
		// Privilege readprivilege1 =
		// privilegeRepository.findByName("READ_PRIVILEGE");
		List<Privilege> adminPrivileges = Arrays.asList(insertPrivilege, readPrivilege, writePrivilege, updatePrivilege,
				createPrivilege, deletePrivilege, viewPrivilege);

		List<Privilege> userPrivileges = Arrays.asList(insertPrivilege, readPrivilege, createPrivilege, viewPrivilege);

		createRoleIfNotFound("ADMIN", adminPrivileges);
		//createRoleIfNotFound("ROLE_USER", userPrivileges);
		//Role adminRole = roleRepository.findByName("ROLE_ADMIN");
		//Role userRole = roleRepository.findByName("ROLE_USER");
		createUserIfNotFound();
		//createUserIfNotFound();

		return "successfully inserted";
	}

	private Privilege createPrivilegeIfNotFound(String name) {

		Privilege privilege = privilegeRepository.findByPrivilegeName(name);
		if (privilege == null) {
			privilege = new Privilege();
			privilege.setPrivilege(name);
			privilege.setStatus("Active");
			privilege.setDescription(name);
			privilege.setCreatedBy("pawan");
			privilege.setCreatedOn(new Date());
			privilege.setModifiedBy("pawan");
			privilege.setModifiedOn(new Date());
			privilegeRepository.save(privilege);
		}
		return privilege;
	}

	public Role createRoleIfNotFound(String name, List<Privilege> privileges) {

		Role role = roleRepository.findByRoleName(name);
		if (role == null) {
			role = new Role();
			role.setRoleName(name);
			role.setDescription(name);
			role.setStatus("Active");
			role.setCreatedBy("pawan");
			role.setCreatedOn(new Date());
			role.setModifiedBy("pawan");
			role.setModifiedOn(new Date());
			role.setPrivileges(privileges);
			roleRepository.save(role);
		}
		return role;
	}

	public User createUserIfNotFound() {

		System.out.println("User details is ::");
		User usr = new User();
		usr.setUserName("pawanhm");
		User user = userRepository.findByUserName(usr.getUserName());
		System.out.println("User details is ::"+user);
		if (user!=null) {
			usr.setUserName("AnkitITM");
			usr.setFirstName("Ankit");
			usr.setLastName("kumar");
			usr.setPassword(passwordEncoder.encode("ankit"));
			usr.setMobileNumber("9992131375");
			usr.setEmailId("saroj@test.com");
			Role userRole = roleRepository.findByRoleName("ROLE_USER");
			System.out.println("For user_role mapping after calling roleFindByName(ROLE_USER)::"+userRole);
			usr.setRoles(Arrays.asList(userRole));
			usr.setStatus("Active");
			usr.setCreatedBy("pawan");
			usr.setCreatedOn(new Date());
			usr.setModifiedBy("pawan");
			usr.setModifiedOn(new Date());
			userRepository.save(usr);
			return usr;
		} else {
			usr.setUserName(usr.getUserName());
			usr.setFirstName("pawan");
			usr.setLastName("kumar");
			usr.setMiddleName("k");
			System.out.println("passwordEncoder::"+passwordEncoder);
			usr.setPassword(passwordEncoder.encode("pawan"));
			usr.setMobileNumber("8892131375");
			usr.setEmailId("sachin@test.com");
			Role adminRole = roleRepository.findByRoleName("ADMIN");
			System.out.println("IN user_role mapping after calling roleFindByName(ROLE_ADMIN)::"+adminRole);
			usr.setRoles(Arrays.asList(adminRole));
			usr.setStatus("Active");
			usr.setCreatedBy("pawan");
			usr.setCreatedOn(new Date());
			usr.setModifiedBy("pawan");
			usr.setModifiedOn(new Date());
			userRepository.save(usr);
			return usr;
		}

	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String welcome(){
		System.out.println("welcome to spring security");
		String welcomemessage="welcome to spring security";
		return welcomemessage;
	}
	
	
	@Bean
	PasswordEncoder getEncoder() {
	    return new BCryptPasswordEncoder();
	}
}
