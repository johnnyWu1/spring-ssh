package com.xiaoji.ssh.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.xiaoji.ssh.dao.UserDao;
import com.xiaoji.ssh.entity.User;


@Repository
public class UserDaoImpl  implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List<User> getUserList() {
		List<User> list = (List<User>)getHibernateTemplate().find("From User");
		return list;
	}

	public void saveUser(User user) {
		getHibernateTemplate().save(user);
		
	}

	public void deleteUser(int id) {
		getHibernateTemplate().delete(getUserByUserId(id));
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(user);
	}

	public User getUserByUserId(int id) {
		User user = (User)getHibernateTemplate().get(User.class, id);
		return user;
	}
	@Override
	public User getUserByUserName(String username) {
		
		List list = getHibernateTemplate().find("From User u where u.username = ?",  username);
		if(list.size()<=0){
			return null;
		}
		User user = (User)list.get(0);
		return user;
	}
	

}
