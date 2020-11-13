package com.SenforageEJBV1.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.SenforageEJBV1.entities.User;
import com.SenforageEJBV1.entities.Village;
@Stateless(name="VL")
public class VillageImpl implements VillageLocal,VillageRemote{
@PersistenceContext
	private EntityManager em;
	@Override
	public Village add(Village village) {
		try {
			
			em.persist(village);
			return village;
		} catch (Exception ex) {
			return null;
		}
	
		
		
	}

	@Override
	public Village getClient(int id) {
		Village village=em.find(Village.class, id);
		if(village==null) throw new RuntimeException("Village introuvable");
			return village;
		
	}

	@Override
	public List<Village> listeVillage() {
		Query query=em.createQuery("select v from v");
		return query.getResultList();
	}

	@Override
	public int update(Village village) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Village village) {
		// TODO Auto-generated method stub
		return 0;
	}

}
