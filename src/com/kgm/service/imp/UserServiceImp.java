package com.kgm.service.imp;

import java.util.List;

import com.kgm.bean.User;
import com.kgm.dao.imp.UserDaoImp;
import com.kgm.service.inf.UserServiceInf;

/*User Service Class*/
public class UserServiceImp implements UserServiceInf{
    private UserDaoImp userDao;
    
    
	public void setUserDao(UserDaoImp userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public boolean userDeleteByid(int id) {
		// TODO Auto-generated method stub
		return userDao.userDeleteById(id);
	}

}
