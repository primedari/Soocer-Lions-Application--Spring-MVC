package com.kgm.controller;

import java.io.PrintWriter;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.kgm.bean.ScheduleMatch;
import com.kgm.bean.User;

/*UserDATA*/
@SuppressWarnings("unused")
public class USERDATA extends AbstractController {
	AnnotationConfiguration cfg;
	SessionFactory sf;
	Session s;
	Transaction t;
	Criteria c;

	public USERDATA() {
		cfg=new AnnotationConfiguration();
		cfg.configure("com/kgm/configatron/hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		//s=sf.openSession();
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		PrintWriter out = response.getWriter();
		System.out.println("........come to data..........");
		s=sf.openSession();
		c=s.createCriteria(User.class);
		List<User> result=c.list();
		JSONObject obj = new JSONObject();
		JSONArray array= new JSONArray();
		for(User usr:result){
			obj = new JSONObject();
			obj.put("userId", usr.getUserId());
			obj.put("firstName", usr.getFirstName());
			obj.put("lastName", usr.getLastName());
			obj.put("age", usr.getAge());
			obj.put("address", usr.getAddress());
			obj.put("phoneNO", usr.getPhoneNO());
			obj.put("emailId", usr.getEmailId());
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

