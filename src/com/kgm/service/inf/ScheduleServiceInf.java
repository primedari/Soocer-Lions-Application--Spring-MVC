package com.kgm.service.inf;

import java.util.List;

import com.kgm.bean.ScheduleMatch;


/* Schedule Service Interface*/
public interface ScheduleServiceInf {
	boolean addSchedule(ScheduleMatch match);
	List<ScheduleMatch> getAllData();
	boolean deleteById(int id);
	boolean updateById(ScheduleMatch match);
	ScheduleMatch searchById();

}
