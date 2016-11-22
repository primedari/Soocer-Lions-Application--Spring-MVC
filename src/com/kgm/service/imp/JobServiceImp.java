package com.kgm.service.imp;

import java.util.List;

import com.kgm.bean.Job;
import com.kgm.dao.imp.JobDaoImp;
import com.kgm.service.inf.JobServiceInf;

public class JobServiceImp implements JobServiceInf{

	private JobDaoImp jobDao;
	
	public void setJobDao(JobDaoImp jobDao) {
		this.jobDao = jobDao;
	}

	@Override
	public boolean addJob(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Job> findAllJob() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateJob(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

}
