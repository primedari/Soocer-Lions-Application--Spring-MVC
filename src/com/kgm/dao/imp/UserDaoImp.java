package com.kgm.dao.imp;

import java.util.List;


import com.kgm.abstractClass.UserAbstract;
import com.kgm.bean.User;
import com.kgm.dao.inf.UserDaoInf;
import com.test.Test;
@SuppressWarnings("unused")

/* User Dao Class*/
public class UserDaoImp extends UserAbstract implements UserDaoInf{
	
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		save(user);
		return true;
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return fetchData(id);
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return updateUserAbs(user);
	}

	@Override
	public boolean userDeleteById(int id) {
		// TODO Auto-generated method stub
		return deleteUserAbs(id);
	}

}
