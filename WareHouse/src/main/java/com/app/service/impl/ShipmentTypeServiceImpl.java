package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ShipmentTypeDao;
import com.app.model.ShipmentType;
import com.app.servce.ShipmentTypeService;
@Service
public class ShipmentTypeServiceImpl implements ShipmentTypeService {
	@Autowired
	
      private ShipmentTypeDao dao;
	@Override
	@Transactional
	public Integer saveShipment(ShipmentType s) {
		return dao.saveShipment(s);
	}

	@Override
	@Transactional
	public void updateShipment(ShipmentType s) {
		dao.updateShipment(s);
		

	}

	@Override
	@Transactional
	public void deleteShipment(Integer id) {
		
		
		dao.deleteShipment(id);
	}

	@Override
	@Transactional(readOnly=true)
	public ShipmentType getOneShipment(Integer id) {
		return dao.getOneShipment(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<ShipmentType> getAllShipment() {
		return dao.getAllShipment();
	}

}
