package com.kgm.dao.inf;

import java.util.List;

import com.kgm.bean.Payment;


/* PaymentDao Interface*/
public interface PaymentDaoInf {
	Payment getOrderById(int id);
	List<Payment> getAllOrder();
	boolean addOrder(Payment pay);
	boolean deleteById(int id);
	boolean updateOrder(Payment pay);
}
