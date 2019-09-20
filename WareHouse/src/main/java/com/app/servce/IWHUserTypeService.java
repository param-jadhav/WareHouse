package com.app.servce;

import java.util.List;

import com.app.model.WHUserType;

public interface IWHUserTypeService {
	public Integer saveWHUser(WHUserType w);
	public void updateWHUser(WHUserType W);
	public void deleteWHUser(Integer id);
	public WHUserType getOneWHUser(Integer id);
	public List<WHUserType> getAllWHUser();
}


