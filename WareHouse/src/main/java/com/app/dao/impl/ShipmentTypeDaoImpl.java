package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ShipmentTypeDao;
import com.app.model.ShipmentType;
import com.app.model.Uom;
@Repository
public class ShipmentTypeDaoImpl implements ShipmentTypeDao {
	@Autowired
	private HibernateTemplate ht;


	@Override
	public Integer saveShipment(ShipmentType s) {
		return (Integer)ht.save(s);
	}

	@Override
	public void updateShipment(ShipmentType s) {
		ht.update(s);
	}

	@Override
	public void deleteShipment(Integer id) {
		ShipmentType  s1 = new ShipmentType(id);
		
		ht.delete(s1);
	}

	@Override
	public ShipmentType getOneShipment(Integer id) {
		ShipmentType s = ht.get(ShipmentType.class, id);
		return s;
	}


	@Override
	public List<ShipmentType> getAllShipment() {
		List<ShipmentType> list = ht.loadAll(ShipmentType.class);
		return list;
	}

}
