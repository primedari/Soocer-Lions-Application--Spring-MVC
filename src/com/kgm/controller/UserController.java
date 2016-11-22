package com.kgm.controller;

/* User Controller*/
import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.validation.BindException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpSession;
import com.kgm.bean.User;
import com.kgm.service.imp.UserServiceImp;

@SuppressWarnings("deprecation")
public class UserController extends SimpleFormController {
	private UserServiceImp userService;
	
	boolean login = false;

	public void setUserService(UserServiceImp userService) {
		this.userService = userService;
	}

	public UserController() {
		setCommandClass(User.class);
		setCommandName("User");
		System.out.println("===inside user controller constructer=========");
	}

	/**
	 * @inheritDoc
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		@SuppressWarnings("unused")
		ModelAndView mv = new ModelAndView();
		PrintWriter out = response.getWriter();
		String ret_value = null;
		User ur=(User)command;
		HttpSession session = null;
		session = request.getSession();
		System.out.println("===inside user controller========="+ur.getOparation());
		System.out.println("===inside user controller========="+ur.getUserId());
		int userId=0;
		if(ur.getOparation().equals("reg"))
		{
			@SuppressWarnings("unused")
			boolean result=userService.addUser(ur);
			ret_value="regSuccess";
		}else{
		userId=(Integer)session.getAttribute("userId");
		System.out.println("===else userId========="+userId);
		}
		if(ur.getOparation()!=null && userId>0){
			if(ur.getOparation().equals("userAdd"))
			{
				@SuppressWarnings("unused")
				boolean result=userService.addUser(ur);
				ret_value="regSuccess";
			}
			if(ur.getOparation().equals("userAddAdmin"))
			{
				ur.setPassword("password");
				boolean result=userService.addUser(ur);
				if(result==true)
				{
				  ret_value="regByAdminSuccess";
				}else{
					ret_value="regByAdminFail";
				}
			}
			if(ur.getOparation().equals("editByAdmin"))
			{
				boolean result=userService.updateUser(ur);
				if(result==true)
				{
				  ret_value="editByAdminSuccess";
				}else{
					ret_value="editByAdminFail";
				}
			}
			if(ur.getOparation().equals("editByUser"))
			{
				boolean result=userService.updateUser(ur);
				if(result==true)
				{
				  ret_value="editByUserSuccess";
				}else{
					ret_value="editByUserFail";
				}
			}
			if(ur.getOparation().equals("userDelete"))
			{
				boolean result=userService.userDeleteByid(ur.getUserId());
				if(result==true)
				{
				  ret_value="deleteByAdminSuccess";
				}else{
					ret_value="deleteByAdminFail";
				}
			}
			if(ur.getOparation().equals("fetch"))
			{
			User user=userService.findById(userId);
			JSONObject obj = new JSONObject();
			JSONArray array= new JSONArray();
			obj = new JSONObject();
			obj.put("userId", user.getUserId());
			obj.put("firstName", user.getFirstName());
			obj.put("lastName", user.getLastName());
			obj.put("age", user.getAge());
			obj.put("address", user.getAddress());
			obj.put("phoneNO", user.getPhoneNO());
			obj.put("emailId", user.getEmailId());
			array.add(obj);
			System.out.println(array.toJSONString());
			ret_value=array.toJSONString();
			}else if (ur.getOparation().equalsIgnoreCase("logout")) {
			      
			       session = request.getSession();
			       
			       session.invalidate();
			       
			}
		}
		out.write(ret_value);
		return null;
	}
}
