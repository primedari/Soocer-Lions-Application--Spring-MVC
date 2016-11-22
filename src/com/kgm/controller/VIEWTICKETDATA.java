package com.kgm.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.kgm.bean.Ticket;

/*View Ticket data */
public class VIEWTICKETDATA extends AbstractController {
	AnnotationConfiguration cfg;
	SessionFactory sf;
	Session s;
	Transaction t;
	Criteria c;

	public VIEWTICKETDATA() {
		cfg=new AnnotationConfiguration();
		cfg.configure("com/kgm/configatron/hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		//s=sf.openSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		@SuppressWarnings("unused")
		ModelAndView mv = new ModelAndView();
		PrintWriter out = response.getWriter();
		System.out.println("........come to data..........");
		HttpSession session = null;
		session = request.getSession();
		s=sf.openSession();
		String emailId=(String)session.getAttribute("emailId");
		System.out.println("........come to data.........."+emailId);
		c=s.createCriteria(Ticket.class);
		c.add(Restrictions.eq("emailId", emailId));
		List<Ticket> result=c.list();
		JSONObject obj = new JSONObject();
		JSONArray array= new JSONArray();
		for(Ticket tkt:result){
			obj = new JSONObject();
			obj.put("ticketId", tkt.getTicketId());
			obj.put("firstName", tkt.getFirstName());
			obj.put("lastName", tkt.getLastName());
			obj.put("phone", tkt.getPhone());
			obj.put("emailId", tkt.getEmailId());
			obj.put("Address", tkt.getAddress());
			obj.put("numberOfTicket", tkt.getNumberOfTicket());
			obj.put("scheduleBetween", tkt.getScheduleBetween());
			obj.put("price", tkt.getPrice());
			array.add(obj);
			
		}
		s.close();
		sf.close();
		System.out.println(array.toJSONString());
		String ret_value=array.toJSONString();
		out.write(ret_value);
		return null;
	}

}
