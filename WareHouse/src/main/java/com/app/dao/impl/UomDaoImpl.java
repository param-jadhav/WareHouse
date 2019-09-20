package com.app.dao.impl;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.UomDao;
import com.app.model.Uom;
@Repository

public class UomDaoImpl implements UomDao {
	@Autowired
	private HibernateTemplate ht;
	

	@Override
	public Integer saveUom(Uom u) {
		// TODO Auto-generated method stub
		
		return (Integer)ht.save(u);
		}

	@Override
	public void updateUom(Uom u) {
		// TODO Auto-generated method stub
       ht.update(u);
	}

	@Override
	public void deleteUom(Integer id) {
     Uom s = new Uom(id);
     ht.delete(s);
     

	}

	@Override
	public Uom getOneUom(Integer id) {
		// TODO Auto-generated method stub
		Uom s = ht.get(Uom.class, id);
		return s;
	}

	@Override
	public List<Uom> getAllUom() {
		// TODO Auto-gehterated method stub
		List<Uom> list = ht.loadAll(Uom.class);
		return list;
	}

	@Override
	public List<Object[]> getUomTypeAndCount() {

		String hql=" select uomType,count(uomType) from com.app.model.Uom group by uomType ";
		return (List<Object[]>) ht.find(hql);
		
	}

}
