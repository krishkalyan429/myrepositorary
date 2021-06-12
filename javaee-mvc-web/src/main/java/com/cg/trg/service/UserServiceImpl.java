package com.cg.trg.service;

import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.trg.bean.User;
import com.cg.trg.dao.UserDAO;
import com.cg.trg.dao.UserDaoImpl;
import com.cg.trg.exception.UserException;

public class UserServiceImpl implements UserService{
	private UserDAO userDao= new UserDaoImpl();

	@Override
	public String addUser(User user) throws UserException {
		try {
			 String message= userDao.addUser(user);
			 return message;
		}catch(PersistenceException e) {
			throw new UserException(e.getMessage(),e);
		}
		
	}

	@Override
	public String deleteUser(Integer id) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Integer id) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValidCredential(String userId, String password) throws UserException {
		try {
			 return  userDao.isValidCredential(userId, password);			
		}catch(PersistenceException e) {
			throw new UserException(e.getMessage(),e);
		}
	}

}