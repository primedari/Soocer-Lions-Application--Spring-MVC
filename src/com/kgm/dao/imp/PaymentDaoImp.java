package com.kgm.dao.imp;

import java.util.List;

import com.kgm.abstractClass.PaymentAbstractClass;
import com.kgm.bean.Payment;
import com.kgm.dao.inf.PaymentDaoInf;

/* Payment Dao Class*/
public class PaymentDaoImp extends PaymentAbstractClass implements PaymentDaoInf{

	@Override
	public boolean addOrder(Payment pay) {
		// TODO Auto-generated method stub
		return save(pay);
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
