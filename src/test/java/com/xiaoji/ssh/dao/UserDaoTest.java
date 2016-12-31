package com.xiaoji.ssh.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiaoji.ssh.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml" })  
public class UserDaoTest {
	
	@Autowired
	private UserDao UserDao;
	
	@Test
	public void testGetUserList(){
		System.out.println("xiaoji");
	}
	
	@Test
	public void testSaveUserList(){
		System.out.println(UserDao.getUserList());
	}
	
	@Test
	public void testGetUserByUserName(){
		System.out.println(UserDao.getUserByUserName("sshdd3"));
	}
	
	@Test
	public void testUpdateUserList(){
		User User = new User();
		User.setUsername("admin");
		User.setPassword("123456");
		UserDao.saveUser(User);
		System.out.println("ok");
	}
}
