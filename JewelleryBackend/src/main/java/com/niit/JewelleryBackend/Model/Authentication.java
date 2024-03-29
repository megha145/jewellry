package com.niit.JewelleryBackend.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Authentication {
	@Id
    String roleId;
    String role_Name ="ROLE_USER";
    String UserName;
    
    
    
	public Authentication() {
		
		this.roleId = "role"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRole_Name() {
		return role_Name;
	}
	public void setRole_Name(String role_Name) {
		this.role_Name = role_Name;
	}
	public String getUserName() {
		return UserName;
	}
	
	public void setUserName(String userName) {
		UserName = userName;
	}
}
