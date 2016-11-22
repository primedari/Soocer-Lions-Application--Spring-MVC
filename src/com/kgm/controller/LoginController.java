package com.kgm.controller;

import com.kgm.bean.User;

import com.kgm.service.imp.LoginServiceImp;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * Login Class Controller
 */
@SuppressWarnings("deprecation")
public class LoginController extends SimpleFormController {

	public static int userId12;
	private LoginServiceImp loginService;
   
    public void setLoginService(LoginServiceImp loginService) {
		this.loginService = loginService;
	}

	public LoginController() {
        setCommandClass(User.class);
        setCommandName("User");
    }

    /**
     * onSubmit for Login
     */
    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
            throws Exception {
        @SuppressWarnings("unused")
		ModelAndView mv = new ModelAndView();
        PrintWriter out = response.getWriter();
        System.out.println("====inside controller====");
        @SuppressWarnings("unused")
		boolean flage=false;
        String ret_value = null;
        User user=(User) command;
        HttpSession session = null;
        session = request.getSession();
        System.out.println("====inside controller===="+user.getEmailId());
        	if(user.getEmailId().equals("ps@gmail.com")){
        		 flage=false;
        		 User ur=loginService.adminLogin(user);
		         if(ur.getUserId()>0)
		         {
		        	 System.out.println("===inside controller========="+ur.getUserId());
		        	 session.setAttribute("userId",ur.getUserId());
		        	 session.setAttribute("emailId",ur.getEmailId());
		        	 ret_value="adminloginSuccess" ;
		         }else{
		        	 ret_value="adminloginFail";
		         }
        	}
        	else{
        		 flage=false;
        		 User ur=loginService.login(user);
		         if(ur.getUserId()>0)
		         {
		        	 System.out.println("===inside controller========="+ur.getUserId());
		        	 session.setAttribute("userId",ur.getUserId());
		        	 session.setAttribute("emailId",ur.getEmailId());
		        	 ret_value="loginSuccess" ;
		         }else{
		        	 ret_value="loginFail";
		         }
        	}
         out.write(ret_value);
         return null;
    }
}
