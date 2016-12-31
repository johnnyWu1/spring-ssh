package com.xiaoji.ssh.service;

import java.util.List;

import com.xiaoji.ssh.entity.User;

public interface UserService {
public List<User> getUserList();
	
	public void saveUser(User User);
	
	public void deleteUser(int UserId);
	
	public void updateUser(User User);
	
	public User getUserByUserId(int UserId);
	
	public boolean checkLogin(String username, String password);
}
