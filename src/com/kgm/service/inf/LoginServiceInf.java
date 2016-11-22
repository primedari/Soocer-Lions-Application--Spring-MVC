package com.kgm.service.inf;

import com.kgm.bean.User;


/* Login Service Interface*/
public interface LoginServiceInf {
	User login(User user);
	User adminLogin(User user);
}
