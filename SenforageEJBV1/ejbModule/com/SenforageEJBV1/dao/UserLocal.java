package com.SenforageEJBV1.dao;

import java.util.List;

import javax.ejb.Local;

import com.SenforageEJBV1.entities.User;


@Local
public interface UserLocal {
	public User add(User user);
	public User getClient(int id);
	public List<User> listeUser();
	public int update(User user);
	public int delete(User user);
}
