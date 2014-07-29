package com.demo.interf;

import java.util.List;

import com.demo.model.User;
import com.demo.model.UserRole;

public interface IData {
	public User GetUserInfo();
	
	public int GetPasswordChars();
	
	public List<UserRole> GetUserRoles();
}
