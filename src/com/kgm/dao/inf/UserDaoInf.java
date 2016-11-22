package com.kgm.dao.inf;

import java.util.List;

import com.kgm.bean.User;


/*User Dao interface*/
public interface UserDaoInf {
	List <User> findAllUser();
    User findById(int id);
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean userDeleteById(int id);
}
