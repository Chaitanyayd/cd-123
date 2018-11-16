package com.cg.TechForum_160631.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository("techforumdao")
public class TechForumDao implements ITechForumDao{

	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public int searchId(int Id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
