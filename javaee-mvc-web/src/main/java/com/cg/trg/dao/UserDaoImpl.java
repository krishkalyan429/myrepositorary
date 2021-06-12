package com.cg.trg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import com.cg.trg.bean.User;

public class UserDaoImpl implements UserDAO{
	private Logger daoLogger= Logger.getLogger(UserDaoImpl.class);
	private EntityManagerFactory emf= 
			Persistence.createEntityManagerFactory("javaee-mvc-web");

	@Override
	public String addUser(User user) throws PersistenceException {
		EntityManager entityManager=null;
		try {
			entityManager = emf.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(user);
			entityManager.getTransaction().commit();
			daoLogger.info("User: "+user.getUserId()+" added to database");
			return "User Added";
		}catch(PersistenceException e) {
			entityManager.getTransaction().rollback();
			daoLogger.error(e.getMessage(),e);
			throw e;
		}finally {
			entityManager.close();
		}
		
	}

	@Override
	public String deleteUser(Integer id) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(User user) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Integer id) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValidCredential(String userId, String password) throws PersistenceException {
		EntityManager entityManager=null;
		try {
			entityManager = emf.createEntityManager();
			String jql= "Select u from User u where u.userId = :uid and password= :pwd";
			TypedQuery<User> query= 
					entityManager.createQuery(jql, User.class)
					.setParameter("uid", userId)
					.setParameter("pwd", password);
			User user= query.getSingleResult();
			if(user!=null) {
				daoLogger.info("User: "+userId+" is valid");
				return true;
			}else {
				throw new PersistenceException("Invalid Credentials");
			}			
			
		}catch(PersistenceException e) {			
			daoLogger.error(e.getMessage(),e);
			throw e;
		}finally {
			entityManager.close();
		}
	}

}