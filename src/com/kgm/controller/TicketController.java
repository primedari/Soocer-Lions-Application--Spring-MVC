package com.kgm.controller;

import java.io.PrintWriter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.kgm.bean.Ticket;
import com.kgm.bean.User;
import com.kgm.service.imp.TicketServiceImp;


/*Ticket Controller*/

@SuppressWarnings({ "deprecation", "unused" })
public class TicketController extends SimpleFormController{
	
	private TicketServiceImp ticketService;

	public void setTicketService(TicketServiceImp ticketService) {
		this.ticketService = ticketService;
	}
	public TicketController() {
		setCommandClass(Ticket.class);
		setCommandName("Ticket");
		System.out.println("===inside ticket controller constructer=========");
	}

	/**
	 * @inheritDoc
	 */
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		PrintWriter out = response.getWriter();
		String ret_value = null;
		Ticket ticket=(Ticket)command;
		//User ticket=(User)command;
		System.out.println("===inside ticket controller========="+ticket.getOperation());
		if(ticket.getOperation()!=null){
			if(ticket.getOperation().equals("add")){
				boolean result=ticketService.addTick(ticket);
				if(result==true){
					ret_value="ticketbooksuccess";
				}else{
					ret_value="ticketbookfail";
				}
			}
			if(ticket.getOperation().equals("delete")){
				boolean result=ticketService.deleteById(ticket.getTicketId());
				if(result==true){
					ret_value="ticketDeleteSuccess";
				}else{
					ret_value="ticketDeleteFail";
				}
			}
		}
		out.write(ret_value);
		return null;
	}

}
