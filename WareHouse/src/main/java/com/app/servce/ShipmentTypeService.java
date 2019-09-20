package com.app.servce;

import java.util.List;

import com.app.model.ShipmentType;

public interface ShipmentTypeService {
	public Integer saveShipment(ShipmentType s);
	public void updateShipment(ShipmentType s);
	public void deleteShipment(Integer id);
	public ShipmentType getOneShipment(Integer id);
	public List<ShipmentType> getAllShipment();

}
