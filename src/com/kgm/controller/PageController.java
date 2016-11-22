package com.kgm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*Navigation within application */

public class PageController extends AbstractController {
    private String ERROR = "error";
    private String USER_LOGIN = "login";
    private String USER_REGISTRATION= "register";
    //private String CONTACT_US= "contact";
    private String ABOUT_US= "about";
    private String ADMIN= "admin";
    
    private String SHOPPING="shopping";
    private String PAYMENT1="payment1";
    private String PAYMENT2="payment2";
    private String PAYMENT3="payment3";
    private String DASH="dash";
    private String SCHEDULE="schedule";
    private String USERMANAGE="usermanage";
    private String USERHOME="userHome";
    private String SCHEDULEVIEW="scheduleview";
    private String BOOKTICKET="booktkt";
    private String VIEWTICKET="viewtkt";
   // private String CANCEL="CancelTicket";
    private String MANAGETICKET="ticketmanage";	
    private String PERSONALINFO="personalinfo";
    private String PAYMENTMANAG="paymentmanage";
    public PageController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
       
        String page = request.getParameter("page");
        if (page.equalsIgnoreCase("error")) {
            mv.setViewName(ERROR);
        } else if (page.equalsIgnoreCase("login")) {
            mv.setViewName(USER_LOGIN);
        }
        else if (page.equalsIgnoreCase("sign-up")) {
            mv.setViewName(USER_REGISTRATION);
        }
        else if (page.equalsIgnoreCase("admin")) {
            mv.setViewName(ADMIN);
        }
        else if (page.equalsIgnoreCase("userHome")) {
            mv.setViewName(USERHOME);
        }
        else if (page.equalsIgnoreCase("about")) {
            mv.setViewName(ABOUT_US);
        }
        else if (page.equalsIgnoreCase("shopping")) {
            mv.setViewName(SHOPPING);
        }
        else if (page.equalsIgnoreCase("payment1")) {
        	String s=request.getParameter("productId");
        	request.setAttribute("productId", s);
            mv.setViewName(PAYMENT1);
        }
        else if (page.equalsIgnoreCase("payment2")) {
            mv.setViewName(PAYMENT2);
        }
        else if (page.equalsIgnoreCase("payment3")) {
            mv.setViewName(PAYMENT3);
        }
        else if (page.equalsIgnoreCase("dash")) {
            mv.setViewName(DASH);
        }
        else if (page.equalsIgnoreCase("schedule")) {
            mv.setViewName(SCHEDULE);
        }
        else if (page.equalsIgnoreCase("usermanage")) {
            mv.setViewName(USERMANAGE);
        }
        else if (page.equalsIgnoreCase("scheduleview")) {
            mv.setViewName(SCHEDULEVIEW);
        }
        else if (page.equalsIgnoreCase("booktkt")) {
            mv.setViewName(BOOKTICKET);
        }
        else if (page.equalsIgnoreCase("viewtkt")) {
            mv.setViewName(VIEWTICKET);
        }
        else if (page.equalsIgnoreCase("CancelTicket")) {
            mv.setViewName(SCHEDULEVIEW);
        }
        else if (page.equalsIgnoreCase("ticketmanage")) {
            mv.setViewName(MANAGETICKET);
        }
        else if (page.equalsIgnoreCase("personalinfo")) {
            mv.setViewName(PERSONALINFO);
        }
        else if (page.equalsIgnoreCase("paymentmanage")) {
            mv.setViewName(PAYMENTMANAG);
        }
        return mv;
    }
}
