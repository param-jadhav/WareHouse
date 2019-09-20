package com.app.dao;


import java.util.List;

import com.app.model.WHUserType;

public interface IWHUserTypeDao {
	public Integer saveWHUser(WHUserType w);
	public void updateWHUser(WHUserType W);
	public void deleteWHUser(Integer id);
	public WHUserType getOneWHUser(Integer id);
	public List<WHUserType> getAllWHUser();
}
