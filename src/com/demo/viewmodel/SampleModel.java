package com.demo.viewmodel;

import java.util.List;

import com.demo.interf.IData;
import com.demo.interf.IModel;
import com.demo.model.User;
import com.demo.model.UserRole;

public class SampleModel implements IModel{
	private User user = null;
	
	private int passwordChars = -1;
	
	private List<UserRole> userRoleList = null;
	
	public SampleModel(IData data) {
		this.user = data.GetUserInfo();
		this.userRoleList = data.GetUserRoles();
		this.passwordChars = data.GetPasswordChars();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getPasswordChars() {
		return passwordChars;
	}

	public void setPasswordChars(int passwordChars) {
		this.passwordChars = passwordChars;
	}

	public List<UserRole> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<UserRole> userRoleList) {
		this.userRoleList = userRoleList;
	}
}
