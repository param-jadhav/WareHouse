package com.app.servce;

import java.util.List;

import com.app.model.OrderMethod;

public interface OrderService {
	public Integer saveOrderMethod(OrderMethod o);
	public void updateOrderMethod(OrderMethod  o);
	public void deleteOrderMethod(Integer id);
	public OrderMethod getOneOrderMethod(Integer id);
	public List<OrderMethod> getAllOrderMethod();

}
