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
import org.hibernate.criterion.Restrictions;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.kgm.bean.Product;

/*Product Class*/
public class PRODUCTDATA extends AbstractController {
	AnnotationConfiguration cfg;
	SessionFactory sf;
	Session s;
	Transaction t;
	Criteria c;

	public PRODUCTDATA() {
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
		int pid=Integer.parseInt(request.getParameter("productId"));
		System.out.println("........come to data..........");
		s=sf.openSession();
		c=s.createCriteria(Product.class);
		c.add(Restrictions.eq("productId", pid));
		List<Product> result=c.list();
		JSONObject obj = new JSONObject();
		JSONArray array= new JSONArray();
		for(Product tkt:result){
			obj = new JSONObject();
			obj.put("productId", tkt.getProductId());
			obj.put("productSize", tkt.getProductSize());
			obj.put("productPrice", tkt.getProductPrice());
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