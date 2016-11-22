package com.kgm.abstractClass;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.kgm.bean.ScheduleMatch;

/*Database Class for Schedule*/
public class ScheduleAbstractClass {
	AnnotationConfiguration cfg;
	SessionFactory sf;
	Session s;
	Transaction t;
	Criteria c;
	public ScheduleAbstractClass(){
		cfg=new AnnotationConfiguration();
		cfg.configure("com/kgm/configatron/hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		s=sf.openSession();
	}
	public boolean save( ScheduleMatch match){
		
		t=s.beginTransaction();
		s.save(match);
		t.commit();
		return true;
	}
	protected List<ScheduleMatch> getData(){
		c=s.createCriteria(ScheduleMatch.class);
		s.close();
		return c.list();
	}
	public boolean updateDataAbs(ScheduleMatch match){
		System.out.println("---------getScheduleId-----"+match.getScheduleId());
		s=sf.openSession();
		t=s.beginTransaction();
		s.update(match);
		t.commit();
		return true;
	}
	public boolean deleteSceduleAbs(int id){
		System.out.println("---------user-----"+id);
		//s.update(user);
	   t=s.beginTransaction();
	   ScheduleMatch sc=(ScheduleMatch)s.load(ScheduleMatch.class, id);
		s.delete(sc);
		s.flush();
		t.commit();
		return true;
	}
}

