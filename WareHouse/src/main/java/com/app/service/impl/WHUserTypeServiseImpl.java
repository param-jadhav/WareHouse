package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IWHUserTypeDao;
import com.app.model.WHUserType;
import com.app.servce.IWHUserTypeService;
@Service
public class WHUserTypeServiseImpl implements IWHUserTypeService {
	@Autowired
	private IWHUserTypeDao dao;

	@Override
	public Integer saveWHUser(WHUserType w) {
		// TODO Auto-generated method stub
		return dao.saveWHUser(w);
	}

	@Override
	public void updateWHUser(WHUserType W) {
		// TODO Auto-generated method stub
		dao.updateWHUser(W);

	}

	@Override
	public void deleteWHUser(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteWHUser(id);

	}

	@Override
	public WHUserType getOneWHUser(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneWHUser(id);
	}

	@Override
	public List<WHUserType> getAllWHUser() {
		// TODO Auto-generated method stub
		return dao.getAllWHUser();
	}

}
