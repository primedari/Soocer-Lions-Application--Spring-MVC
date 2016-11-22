package com.kgm.dao.inf;

import java.util.List;

import com.kgm.bean.Ticket;


/*Ticket Dao interface*/
public interface TicketDaoInf {
	List<Ticket> getAllTicket();
	Ticket getTicketById(int id);
	boolean deleteById(int id);
	boolean updateById(int id);
	boolean addTick(Ticket ticket);
}
