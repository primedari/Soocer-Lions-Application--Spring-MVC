package com.kgm.abstractClass;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.kgm.bean.Ticket;

/*Database Class for Ticket*/
public class TickerAbstractClass {
	AnnotationConfiguration cfg;
	SessionFactory sf;
	Session s;
	Transaction t;
	Criteria c;
	public TickerAbstractClass(){
		cfg=new AnnotationConfiguration();
		cfg.configure("com/kgm/configatron/hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		s=sf.openSession();
	}
	public boolean save(Ticket ticket){

		t=s.beginTransaction();
		s.save(ticket);
		t.commit();
		return true;
	}
	public boolean deleteTicketAbs(int id){
		System.out.println("---------Ticket-----"+id);
		//s.update(user);
	   t=s.beginTransaction();
	   Ticket tkt=(Ticket)s.load(Ticket.class, id);
		s.delete(tkt);
		s.flush();
		t.commit();
		return true;
	}
}
