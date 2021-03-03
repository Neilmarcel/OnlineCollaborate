package com.coll.OnlineCollaborate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaborate.dao.IUserDao;
import com.coll.OnlineCollaborate.model.User;
import com.coll.OnlineCollaborate.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserDao userDao;

	@Override
	public List<User> userListbyStatus(String status) {
		// TODO Auto-generated method stub
		return userDao.userListbyStatus(status);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	@Override
	public User getUserById(int userid) {
		// TODO Auto-generated method stub
		return userDao.getUserById(userid);
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserByUsername(username);
	}

	@Override
	public User validateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.validateUser(user);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(userId);
	}

	@Override
	public boolean deactiveUser(int userId) {
		// TODO Auto-generated method stub
		return userDao.deactiveUser(userId);
	}

	@Override
	public boolean updateUserProfile(String file, Integer userId) {
		// TODO Auto-generated method stub
		return userDao.updateUserProfile(file, userId);
	}

	@Override
	public boolean activeUser(int userId) {
		// TODO Auto-generated method stub
		return userDao.activeUser(userId);
	}

	@Override
	public List<User> getAllDeactiveUser() {
		// TODO Auto-generated method stub
		return userDao.getAllDeactiveUser();
	}
}
