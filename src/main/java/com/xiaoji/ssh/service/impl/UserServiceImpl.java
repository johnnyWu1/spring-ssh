package com.xiaoji.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoji.ssh.dao.UserDao;
import com.xiaoji.ssh.entity.User;
import com.xiaoji.ssh.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);		
	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);		
	}

	@Override
	public User getUserByUserId(int id) {
		return userDao.getUserByUserId(id);
	}

	@Override
	public boolean checkLogin(String username, String password) {
		
		User user = userDao.getUserByUserName(username);
		if(user == null){
			return false;
		}
		if(username!= null &&username.equals(user.getUsername())){
			return true;
		}
		return false;
	}
	
	
}
