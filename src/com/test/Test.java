package com.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.kgm.bean.User;


public class Test {
	
	public static void main(String args[]){
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/kgm/configatron/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		User u=new User();
		s.save(u);
		t.commit();
		s.close();
		sf.close();
		System.out.println("Done");
	}

}
