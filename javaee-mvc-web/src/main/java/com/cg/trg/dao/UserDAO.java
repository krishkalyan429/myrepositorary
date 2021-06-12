package com.cg.trg.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.trg.bean.User;

public interface UserDAO {
	public abstract String addUser(User user) throws PersistenceException;
	public abstract String deleteUser(Integer id) throws PersistenceException;
	public abstract String updateUser(User user) throws PersistenceException;
	public abstract User getUserById(Integer id) throws PersistenceException;
	public abstract List<User> getAllUsers() throws PersistenceException;
	public abstract Boolean isValidCredential(String userId,String password) throws PersistenceException;
}
