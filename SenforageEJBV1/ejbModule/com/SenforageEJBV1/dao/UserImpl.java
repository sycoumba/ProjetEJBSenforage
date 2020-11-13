package com.SenforageEJBV1.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.SenforageEJBV1.entities.User;

@Stateless(name="US")
public class UserImpl implements UserLocal,UserRemote{
@PersistenceContext
private EntityManager em;
	@Override
	public User add(User user) {
		em.persist(user);
		em.flush();
		return user;
	}

	@Override
	public User getClient(int id) {
	User user=em.find(User.class, id);
	if(user==null) throw new RuntimeException("User introuvable");
		return user;
	}

	@Override
	public List<User> listeUser() {
		
		return null;
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
