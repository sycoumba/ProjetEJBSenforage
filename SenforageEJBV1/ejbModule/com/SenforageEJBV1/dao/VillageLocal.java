package com.SenforageEJBV1.dao;

import java.util.List;

import javax.ejb.Local;

import com.SenforageEJBV1.entities.Village;

@Local
public interface VillageLocal {
	public Village add(Village village);
	public Village getClient(int id);
	public List<Village> listeVillage();
	public int update(Village village);
	public int delete(Village village);

}
