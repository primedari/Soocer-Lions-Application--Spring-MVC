package com.kgm.dao.inf;

import com.kgm.bean.User;


/* Login Dao Interface*/
public interface LoginDaoInf {
	User login(User user);
	User adminLogin(User user);
}
