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

import com.kgm.bean.Payment;

/* Payment data class  that holds all the information*/
public class PAYMENTDATA extends AbstractController {
	AnnotationConfiguration cfg;
	SessionFactory sf;
	Session s;
	Transaction t;
	Criteria c;

	public PAYMENTDATA() {
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
		c=s.createCriteria(Payment.class);
		List<Payment> result=c.list();
		JSONObject obj = new JSONObject();
		JSONArray array= new JSONArray();
		for(Payment pay:result){
			obj = new JSONObject();
			obj.put("paymentId", pay.getPaymentId());
			obj.put("productId", pay.getProductId());
			obj.put("productSize", pay.getProductSize());
			obj.put("productPrice", pay.getProductPrice());
			obj.put("userName", pay.getUserName());
			obj.put("cvvNumber", pay.getCvvNumber());
			obj.put("expiryDate12", pay.getExpiryDate12());
			obj.put("address", pay.getAddress());
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
