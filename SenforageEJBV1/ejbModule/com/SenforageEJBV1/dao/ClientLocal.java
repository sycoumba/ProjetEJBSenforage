package com.SenforageEJBV1.dao;

import java.util.List;

import javax.ejb.Local;

import com.SenforageEJBV1.entities.Client;
@Local
public interface ClientLocal {
	public int add(Client client);
	public Client getClient(int id);
	public List<Client> listeClient();
	public int update(Client client);
	public int delete(Client client);
	

}
