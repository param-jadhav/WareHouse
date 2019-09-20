package com.app.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UomDao;
import com.app.model.Uom;
import com.app.servce.UomService;
@Service
public class UomServiceImpl implements UomService {
	@Autowired
	private UomDao dao;

	@Override
	@Transactional 
	public Integer saveUom(Uom u) {
		// TODO Auto-generated method stub
		return dao.saveUom(u);
		
	}

	@Override
	@Transactional
	public void updateUom(Uom u) {
		// TODO Auto-generated method stub
		dao.updateUom(u);

	}

	@Override
	@Transactional
	public void deleteUom(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteUom(id);

	}

	@Override 
	@Transactional(readOnly=true)
	public Uom getOneUom(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneUom(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Uom> getAllUom() {
		// TODO Auto-generated method stub
		return dao.getAllUom();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Object[]> getUomTypeAndCount() {
		// TODO Auto-generated method stub
		return dao.getUomTypeAndCount();
	}

}
