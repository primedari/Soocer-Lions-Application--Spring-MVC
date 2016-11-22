package com.kgm.service.imp;

import java.util.List;

import com.kgm.abstractClass.TickerAbstractClass;
import com.kgm.bean.ScheduleMatch;
import com.kgm.dao.imp.ScheduleDaoImp;
import com.kgm.service.inf.ScheduleServiceInf;

/*ScheduleService Class*/
public class ScheduleServiceImp extends TickerAbstractClass implements ScheduleServiceInf{
	private ScheduleDaoImp scheduleDao;
	
	public void setScheduleDao(ScheduleDaoImp scheduleDao) {
		this.scheduleDao = scheduleDao;
	}

	@Override
	public boolean addSchedule(ScheduleMatch match) {
		// TODO Auto-generated method stub
		return scheduleDao.addSchedule(match);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return scheduleDao.deleteById(id);
	}

	@Override
	public List<ScheduleMatch> getAllData() {
		// TODO Auto-generated method stub
		return scheduleDao.getAllData();
	}

	@Override
	public ScheduleMatch searchById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateById(ScheduleMatch match) {
		// TODO Auto-generated method stub
		return scheduleDao.updateById(match);
	}

}
