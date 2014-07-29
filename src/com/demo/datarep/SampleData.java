package com.demo.datarep;

import java.util.ArrayList;
import java.util.List;

import com.demo.interf.IData;
import com.demo.model.User;
import com.demo.model.UserRole;

// 为了应对数据源的变化，最好再加个观察者。
public class SampleData implements IData{
	public User GetUserInfo()    {      
		//get user info from DB     
		User user = new User();
		user.setName("韩永禄");
		user.setAge(28);
		return user;   
	}
	
	public int GetPasswordChars() {      
		//get required password length from dB      
		return 6;
	}
	
	public List<UserRole> GetUserRoles() {      
		//get user roles from DB
		UserRole role = new UserRole();
		role.setRoleLevel("5");
		role.setRoleName("Android研发工程师");
		List<UserRole> list = new ArrayList<UserRole>();
		list.add(role);
		
		return list;
	}
}
