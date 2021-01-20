package com.coll.OnlineCollaborate.dao;

import java.util.List;

import com.coll.OnlineCollaboration.model.User;
public interface IUserDao {
	
	List<User> userListbyStatus(String status);
	List<User> getAllUsers();
	User getUserById(int Userid);
	User getUserByUsername(String UserName);
	User validateUser(User user);
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(int userId);
	boolean deactiveUser(int userId);
	
}
