package com.SenforageEJBV1.dao;

import java.util.List;

import javax.ejb.Remote;

import com.SenforageEJBV1.entities.Client;

@Remote
public interface ClientRemote {
	public int add(Client client);
	public Client getClient(int id);
	public List<Client> listeClient();
	public int update(Client client);
	public int delete(Client client);
	

}
