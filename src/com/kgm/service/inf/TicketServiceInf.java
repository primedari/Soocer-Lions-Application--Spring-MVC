package com.kgm.service.inf;

import java.util.List;

import com.kgm.bean.Ticket;


/* Ticket Service Interface*/
public interface TicketServiceInf {
	List<Ticket> getAllTicket();
	Ticket getTicketById(int id);
	boolean deleteById(int id);
	boolean updateById(int id);
	boolean addTick(Ticket ticket);

}
