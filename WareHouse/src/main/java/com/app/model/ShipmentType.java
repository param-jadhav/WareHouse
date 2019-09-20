package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ShipmentType {
	@Id
	@GeneratedValue
	private Integer id;
	private String shipmentMode;
	private String shipmentCode; 
	private String shipmentEnable;
	private String shipmentGrade;
	private String description;
	
	public ShipmentType() {
		super();
	}
	public ShipmentType(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShipmentMode() {
		return shipmentMode;
	}
	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}
	public String getShipmentCode() {
		return shipmentCode;
	}
	public void setShipmentCode(String shipmentCode) {
		this.shipmentCode = shipmentCode;
	}
	public String getShipmentEnable() {
		return shipmentEnable;
	}
	public void setShipmentEnable(String shipmentEnable) {
		this.shipmentEnable = shipmentEnable;
	}
	public String getShipmentGrade() {
		return shipmentGrade;
	}
	public void setShipmentGrade(String shipmentGrade) {
		this.shipmentGrade = shipmentGrade;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ShipmentType [id=" + id + ", shipmentMode=" + shipmentMode + ", shipmentCode=" + shipmentCode
				+ ", shipmentEnable=" + shipmentEnable + ", shipmentGrade=" + shipmentGrade + ", description="
				+ description + "]";
	}
	

}