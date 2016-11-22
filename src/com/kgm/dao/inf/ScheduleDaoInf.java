package com.kgm.dao.inf;

import java.util.List;

import com.kgm.bean.ScheduleMatch;


/*Schedule Dao interface*/
public interface ScheduleDaoInf {
	boolean addSchedule(ScheduleMatch match);
	List<ScheduleMatch> getAllData();
	boolean deleteById(int id);
	boolean updateById(ScheduleMatch match);
	ScheduleMatch searchById();
}
