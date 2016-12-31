package com.xiaoji.ssh.dao;

import java.util.List;

import com.xiaoji.ssh.entity.User;


public interface UserDao{

	public List<User> getUserList();
	
	public void saveUser(User User);
	
	public void deleteUser(int UserId);
	
	public void updateUser(User User);
	
	public User getUserByUserId(int UserId);

	public User getUserByUserName(String username);
}
