package com.app.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CookieValue;
@Entity
public class OrderMethod {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="mode")
	private String orderMode;
	@Column(name="code")
	private String orderCode;
	@Column(name="type")
	private String orderType;
	@Column(name="note")
	private String note;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String>orderAccpt;
	public OrderMethod() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderMode() {
		return orderMode;
	}
	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<String> getOrderAccpt() {
		return orderAccpt;
	}
	public void setOrderAccpt(List<String> orderAccpt) {
		this.orderAccpt = orderAccpt;
	}
	@Override
	public String toString() {
		return "OrderMethod [id=" + id + ", orderMode=" + orderMode + ", orderCode=" + orderCode + ", orderType="
				+ orderType + ", note=" + note + ", orderAccpt=" + orderAccpt + "]";
	}
	
	
	
	
	

}
