package com.kgm.service.imp;

import com.kgm.bean.User;
import com.kgm.dao.imp.LoginDaoImp;
import com.kgm.service.inf.LoginServiceInf;

/*LoginService Class*/
public class LoginServiceImp implements LoginServiceInf{
	private LoginDaoImp loginDao;
	
	public void setLoginDao(LoginDaoImp loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return loginDao.login(user);
	}

	@Override
	public User adminLogin(User user) {
		// TODO Auto-generated method stub
		return loginDao.adminLogin(user);
	}

}
