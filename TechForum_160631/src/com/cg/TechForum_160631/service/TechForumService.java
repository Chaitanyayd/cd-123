package com.cg.TechForum_160631.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.TechForum_160631.dao.ITechForumDao;



@Service("techforumservice")
@Transactional
public class TechForumService implements ITechForumService{

	@Autowired
	ITechForumDao techforumdao;
	
	@Override
	public int searchId(int Id) {
		// TODO Auto-generated method stub
		return techforumdao.searchId(Id);
	}

}
