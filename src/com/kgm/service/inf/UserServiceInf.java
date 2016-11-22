package com.kgm.service.inf;

import java.util.List;

import com.kgm.bean.User;


/* User Service Interface*/
public interface UserServiceInf {
	
	List <User> findAllUser();
    User findById(int id);
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean userDeleteByid(int id);
    
}
