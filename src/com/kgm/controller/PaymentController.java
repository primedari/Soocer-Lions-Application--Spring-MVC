package com.kgm.controller;

import java.io.PrintWriter;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.kgm.bean.Payment;
import com.kgm.service.imp.PaymentServiceImp;


/*Payment Controller Class*/
@SuppressWarnings({ "deprecation", "unused" })
public class PaymentController extends SimpleFormController{
	private PaymentServiceImp paymentService;

	public void setPaymentService(PaymentServiceImp paymentService) {
		this.paymentService = paymentService;
	}
	public PaymentController(){
		setCommandClass(Payment.class);
		setCommandName("Payment");
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		PrintWriter out = response.getWriter();
		System.out.println("......come to payment controller...");
		String ret_value="";
		Payment sm=(Payment)command;
		System.out.println("......come to payment controller..."+sm.getProductPrice());
		if(sm.getOperation()!=null){
			if(sm.getOperation().equals("pay")){
				boolean result=paymentService.addOrder(sm);
				System.out.println("......come to result..."+sm.getProductPrice());
				if(result==true){
					ret_value="addpaymentsuccess";
				}else{
					ret_value="addpaymentfail";
				}
			}
		}
		out.write(ret_value);
		return null;
	}

}
