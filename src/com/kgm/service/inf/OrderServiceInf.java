package com.kgm.service.inf;

import java.util.List;

import com.kgm.bean.Payment;


/* Order Service Interface*/
public interface OrderServiceInf {
	Payment getOrderById(int id);
	List<Payment> getAllOrder();
	boolean addOrder(Payment pay);
	boolean deleteById(int id);
	boolean updateOrder(Payment pay);

}
