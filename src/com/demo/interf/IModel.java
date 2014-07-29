package com.demo.interf;

import java.util.List;

import com.demo.model.User;
import com.demo.model.UserRole;

public interface IModel {
	public User getUser();
	
	public int getPasswordChars();
	
	public List<UserRole> getUserRoleList();
}
