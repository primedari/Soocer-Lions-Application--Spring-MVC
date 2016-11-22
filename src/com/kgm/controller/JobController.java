package com.kgm.controller;

import com.kgm.bean.Job;
import com.kgm.bean.User;
import com.kgm.service.imp.JobServiceImp;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


 
@SuppressWarnings("deprecation")
public class JobController extends SimpleFormController {
	
	@SuppressWarnings("unused")
	private JobServiceImp jobService;
   

	public void setJobService(JobServiceImp jobService) {
		this.jobService = jobService;
	}

	public JobController() {
        setCommandClass(Job.class);
        setCommandName("Job");
    }

    /**
     * @inheritDoc
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
        //UserBean userBean = (UserBean) ;
        //RegistrationBean lb = (RegistrationBean) command;
        User rb=(User) command;
        String emailId=rb.getEmailId();
        String password=rb.getPassword();
        System.out.println("===EMAILiD=="+emailId+"===PASSWORD=="+password);
         
         out.write(ret_value);
         return null;
    }
}
