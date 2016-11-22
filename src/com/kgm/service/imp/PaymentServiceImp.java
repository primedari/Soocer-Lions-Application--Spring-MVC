package com.kgm.service.imp;

import java.util.List;

import com.kgm.bean.Payment;
import com.kgm.dao.imp.PaymentDaoImp;
import com.kgm.service.inf.PaymentServiceInf;

/*Payment Service Class*/
public class PaymentServiceImp implements PaymentServiceInf {
	private PaymentDaoImp paymentDao;

	public void setPaymentDao(PaymentDaoImp paymentDao) {
		this.paymentDao = paymentDao;
	}

	@Override
	public boolean addOrder(Payment pay) {
		// TODO Auto-generated method stub
		System.out.println("......dao.........");
		return paymentDao.addOrder(pay);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Payment> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getOrderById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOrder(Payment pay) {
		// TODO Auto-generated method stub
		return false;
	}

}
