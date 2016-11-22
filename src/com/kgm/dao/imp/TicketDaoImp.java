package com.kgm.dao.imp;

import java.util.List;


import com.kgm.abstractClass.TickerAbstractClass;
import com.kgm.bean.Ticket;
import com.kgm.dao.inf.TicketDaoInf;
/* Ticket Dao Class*/
public class TicketDaoImp extends TickerAbstractClass implements TicketDaoInf {

	@Override
	public boolean addTick(Ticket ticket) {
		// TODO Auto-generated method stub
		return save(ticket);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return deleteTicketAbs(id);
	}

	@Override
	public List<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicketById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
