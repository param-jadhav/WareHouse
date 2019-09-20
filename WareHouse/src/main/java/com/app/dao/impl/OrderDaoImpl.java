package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IOrderMethodDao;
import com.app.model.OrderMethod;
import com.app.model.ShipmentType;
@Repository
public class OrderDaoImpl implements IOrderMethodDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveOrderMethod(OrderMethod o) {
		return (Integer)ht.save(o);
	}

	@Override
	public void updateOrderMethod(OrderMethod o) {
		ht.update(o);
	}
	

	@Override
	public void deleteOrderMethod(Integer id) {
		OrderMethod  s1 = new OrderMethod();
		s1.setId(id);
		ht.delete(s1);
	}

	@Override
	public OrderMethod getOneOrderMethod(Integer id) {
		OrderMethod s = ht.get(OrderMethod.class, id);
		return s;
	}

	@Override
	public List<OrderMethod> getAllOrderMethod() {
		List<OrderMethod> list1 = ht.loadAll(OrderMethod.class);
		return list1;
		
	}

}
