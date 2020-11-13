package com.SenforageEJBV1.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.SenforageEJBV1.entities.Client;

@Stateless(name="CL")
public class ClientImpl implements ClientLocal{
	
@PersistenceContext
private EntityManager em;


	@Override
	public int add(Client client) {
		try {
		
			em.persist(client);
		
		
			return 1;
		} catch (Exception ex) {
			return 0;
		}
		
		
	}

	@Override
	public Client getClient(int id) {
	try {
		return em.find(Client.class, id);
	} catch (Exception e) {
		return null;
	}
		
	}

	@Override
	public List<Client> listeClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

}
