package com.SenforageEJBV1.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.soap.SOAPBinding.Use;

import com.SenforageEJBV1.entities.User;


@Remote
public interface UserRemote {
	public User add(User user);
	public User getClient(int id);
	public List<User> listeUser();
	public int update(User user);
	public int delete(User user);
}
