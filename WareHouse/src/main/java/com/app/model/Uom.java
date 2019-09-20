package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Uom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String uomType;
	private String uomModel;
	private String description;
	public Uom() {
		super();
	}
	public Uom(Integer id) {
		super();
		this.id = id;
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUomType() {
		return uomType;
	}
	public void setUomType(String uomType) {
		this.uomType = uomType;
	}
	public String getUomModel() {
		return uomModel;
	}
	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Uom [id=" + id + ", uomType=" + uomType + ", uomModel=" + uomModel + ", description=" + description
				+ "]";
	}
	
	
	
	

}
