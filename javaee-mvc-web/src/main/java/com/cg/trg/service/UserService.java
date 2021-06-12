package com.cg.trg.service;

import java.util.List;


import com.cg.trg.bean.User;
import com.cg.trg.exception.UserException;

public interface UserService {
	public abstract String addUser(User user) throws UserException;
	public abstract String deleteUser(Integer id) throws UserException;
	public abstract String updateUser(User user) throws UserException;
	public abstract User getUserById(Integer id) throws UserException;
	public abstract List<User> getAllUsers() throws UserException;
	public abstract Boolean isValidCredential(String userId,String password) throws UserException;
}