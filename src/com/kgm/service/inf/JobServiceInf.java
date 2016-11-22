package com.kgm.service.inf;

import java.util.List;

import com.kgm.bean.Job;

public interface JobServiceInf {
    List<Job> searchById(int id);
    List<Job> searchByTitle(String title);
    List<Job> findAllJob();
    boolean addJob(Job job);
    boolean updateJob(Job job);
    boolean deleteById(int id);
}
