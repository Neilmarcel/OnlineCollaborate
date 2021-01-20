package com.coll.OnlineCollaborate.daoImpl;

import java.util.List;

import com.coll.OnlineCollaborate.dao.IUserDao;
import com.coll.OnlineCollaboration.model.User;

public class UserDaoImpl implements IUserDao{

	@Override
	public List<User> userListbyStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from User",User.class).getResultLi;
	}

	@Override
	public User getUserById(int Userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUsername(String UserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User validateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deactiveUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
