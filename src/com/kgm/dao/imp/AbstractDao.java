package com.kgm.dao.imp;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.hibernate.cfg.AnnotationConfiguration;
public abstract class AbstractDao<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	@Autowired
	private AnnotationConfiguration cfg;
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.cfg=new AnnotationConfiguration();
		cfg.configure("com/kgm/configatron/hibernate.cfg.xml");
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	protected SessionFactory getSessionFactory(){
		return cfg.buildSessionFactory();
	}

	protected Session getSession(){
		return getSessionFactory().getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}
	public void save(T entity) {
		getSession().save(entity);
	}
	public void delete(T entity) {
		getSession().delete(entity);
	}
	
	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(persistentClass);
	}
	
	
}
