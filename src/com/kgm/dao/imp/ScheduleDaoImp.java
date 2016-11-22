package com.kgm.dao.imp;

import java.util.List;

import com.kgm.abstractClass.ScheduleAbstractClass;
import com.kgm.bean.ScheduleMatch;
import com.kgm.dao.inf.ScheduleDaoInf;


/* Schedule Dao Class*/
public class ScheduleDaoImp extends ScheduleAbstractClass implements ScheduleDaoInf{

	@Override
	public boolean addSchedule(ScheduleMatch match) {
		// TODO Auto-generated method stub
		System.out.println("...........dao........");
		return save(match);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return deleteSceduleAbs(id);
	}

	@Override
	public List<ScheduleMatch> getAllData() {
		// TODO Auto-generated method stub
		return getData();
	}

	@Override
	public ScheduleMatch searchById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateById(ScheduleMatch match) {
		// TODO Auto-generated method stub
		return updateDataAbs(match);
	}

}
