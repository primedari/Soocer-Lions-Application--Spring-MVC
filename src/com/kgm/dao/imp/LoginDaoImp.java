package com.kgm.dao.imp;

import com.kgm.abstractClass.UserAbstract;
import com.kgm.bean.User;
import com.kgm.dao.inf.LoginDaoInf;

/* Login Dao Class*/
public class LoginDaoImp extends UserAbstract implements LoginDaoInf{
   
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return loginAbs(user);
	}

	@Override
	public User adminLogin(User user) {
		// TODO Auto-generated method stub
		return adminLoginAbs(user);
	}

}
