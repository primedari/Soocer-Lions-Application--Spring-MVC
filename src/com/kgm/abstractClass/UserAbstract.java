package com.kgm.abstractClass;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.kgm.bean.User;
import com.kgm.controller.LoginController;


/*Database Class for User*/
public class UserAbstract {
	AnnotationConfiguration cfg;
	SessionFactory sf;
	Session s;
	Transaction t;
	Criteria c;
	public UserAbstract(){
        cfg=new AnnotationConfiguration();
		cfg.configure("com/kgm/configatron/hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		s=sf.openSession();
	}
	public boolean save(User user){

		t=s.beginTransaction();
		s.save(user);
		t.commit();
		return true;
	}
	public User loginAbs(User user){
		System.out.println(user.getEmailId());
		String password=user.getPassword();
		c=s.createCriteria(User.class);
		c.add(Restrictions.eq("emailId", user.getEmailId()));
		List<User> list = c.list();
		for(User ur:list)
		{
			System.out.println(ur.getPassword());
			if(ur.getPassword().equals(password))
			{
				return ur;
			}
		}
		return user;
	}
	public User adminLoginAbs(User user){
		String password=user.getPassword();
		c=s.createCriteria(User.class);
		System.out.println("come----here--"+user.getEmailId());
		c.add(Restrictions.eq("emailId", user.getEmailId()));
		List<User> list = c.list();
		for(User ur:list)
		{
			LoginController.userId12=ur.getUserId();
			System.out.println(ur.getUserId());
			System.out.println(ur.getPassword());
			if(ur.getPassword().equals(password)&& user.getEmailId().equals("ps@gmail.com"))
			{
				return ur;
			}
		}
		return user;
	}
	public boolean updateUserAbs(User user){
		System.out.println("---------user-----"+user.getUserId());
		c=s.createCriteria(User.class);
		c.add(Restrictions.eq("userId", user.getUserId()));
		List<User> list = c.list();
		for(User ur:list)
		{
			user.setPassword(ur.getPassword());
		}
		t=s.beginTransaction();
		//s.update(user);
		s.merge(user);
		t.commit();
		return true;
	}
	public boolean deleteUserAbs(int id){
		System.out.println("---------user-----"+id);
		//s.update(user);
	    t=s.beginTransaction();
		User ur=(User)s.load(User.class, id);
		s.delete(ur);
		s.flush();
		t.commit();
		return true;
	}
	public User fetchData(int id){
		t=s.beginTransaction();
		User ur=(User)s.load(User.class, id);
		return ur;
	}
}
