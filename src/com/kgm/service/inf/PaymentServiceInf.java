package com.kgm.service.inf;

import java.util.List;

import com.kgm.bean.Payment;

/* Payment Service Interface*/
public interface PaymentServiceInf {
	Payment getOrderById(int id);
	List<Payment> getAllOrder();
	boolean addOrder(Payment pay);
	boolean deleteById(int id);
	boolean updateOrder(Payment pay);
}
