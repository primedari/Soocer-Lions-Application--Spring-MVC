package com.kgm.service.imp;

import java.util.List;

import com.kgm.bean.Ticket;
import com.kgm.dao.imp.TicketDaoImp;
import com.kgm.service.inf.TicketServiceInf;

/*Ticket Service Class*/
public class TicketServiceImp  implements TicketServiceInf{
	private TicketDaoImp ticketDao;
	
	public void setTicketDao(TicketDaoImp ticketDao) {
		this.ticketDao = ticketDao;
	}

	@Override
	public boolean addTick(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.addTick(ticket);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return ticketDao.deleteById(id);
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
