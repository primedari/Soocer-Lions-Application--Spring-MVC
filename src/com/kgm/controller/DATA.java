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

/* Data class to capture the details of match*/
public class DATA extends AbstractController {
	AnnotationConfiguration cfg;
	SessionFactory sf;
	Session s;
	Transaction t;
	Criteria c;

	public DATA() {
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
		s=sf.openSession();
		c=s.createCriteria(ScheduleMatch.class);
		List<ScheduleMatch> result=c.list();
		JSONObject obj = new JSONObject();
		JSONArray array= new JSONArray();
		for(ScheduleMatch match:result){
			obj = new JSONObject();
			obj.put("scheduleId", match.getScheduleId());
			obj.put("scheduleBetween", match.getScheduleBetween());
			obj.put("date", match.getDate());
			obj.put("place", match.getPlace());
			obj.put("price", match.getPrice());
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
