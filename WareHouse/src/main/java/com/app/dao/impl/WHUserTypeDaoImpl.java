package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IWHUserTypeDao;
import com.app.model.Uom;
import com.app.model.WHUserType;
@Repository
public class WHUserTypeDaoImpl implements IWHUserTypeDao {
	@Autowired
	private HibernateTemplate ht;
	

	@Override
	public Integer saveWHUser(WHUserType w) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(w);
	}

	@Override
	public void updateWHUser(WHUserType W) {
		// TODO Auto-generated method stub
		ht.update(W);
	}

	@Override
	public void deleteWHUser(Integer id) {
		// TODO Auto-generated method stub
		WHUserType s = new WHUserType(id);
	     ht.delete(s);
	     
	}

	@Override
	public WHUserType getOneWHUser(Integer id) {
		// TODO Auto-generated method stub
		WHUserType s = ht.get(WHUserType.class, id);
		return s;
		
	}

	@Override
	public List<WHUserType> getAllWHUser() {
		// TODO Auto-generated method stub
		List<WHUserType> list = ht.loadAll(WHUserType.class);
		return list;
	}

}
