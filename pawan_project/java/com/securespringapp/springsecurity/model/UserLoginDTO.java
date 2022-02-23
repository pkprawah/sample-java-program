package com.happiestminds.springsecurity.model;

public class UserLoginDTO {
    private String userName ;
    private String email;
    private String password ;
    private String status ;
    private boolean isAlreadyLogin ;
    
    public UserLoginDTO(){
	
    }
    
    public UserLoginDTO(String userName, String email, String password, String status, boolean isAlreadyLogin) {
	super();
	this.userName = userName;
	this.email = email;
	this.password = password;
	this.status = status;
	this.isAlreadyLogin = isAlreadyLogin;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
    public boolean isAlreadyLogin() {
        return isAlreadyLogin;
    }
    public void setAlreadyLogin(boolean isAlreadyLogin) {
        this.isAlreadyLogin = isAlreadyLogin;
    }

    @Override
    public String toString() {
	return "UserLoginDTO [userName=" + userName + ", email=" + email + ", password=" + password + ", status="
		+ status + ", isAlreadyLogin=" + isAlreadyLogin + "]";
    }
    
    

}
