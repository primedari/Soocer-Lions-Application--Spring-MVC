package com.kgm.abstractClass;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.kgm.bean.Payment;

/*Database Class for save Payment*/
public class PaymentAbstractClass {
	AnnotationConfiguration cfg;
	SessionFactory sf;
	Session s;
	
	Transaction t;
	Criteria c;
	public PaymentAbstractClass(){
        cfg=new AnnotationConfiguration();
		cfg.configure("com/kgm/configatron/hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		
	}
	public boolean save(Payment pay){
		
		s=sf.openSession();
		t=s.beginTransaction();
		s.save(pay);
		t.commit();
		s.close();
		return true;
	}
}
