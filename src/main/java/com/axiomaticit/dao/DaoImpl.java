package com.axiomaticit.dao;

import java.util.Collection;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.axiomaticit.model.Model;

public class DaoImpl<T extends Model> extends HibernateDaoSupport implements Dao<T> {

	@SuppressWarnings("unchecked")
	public T getById(T t) {
		return (T) getHibernateTemplate().get(t.getClass(), t.getId());
	}

	public Collection<T> getAll(Class<T> clazz) {
		return getHibernateTemplate().loadAll(clazz);
	}

	@Transactional
	public T save(T t) {
		// check for empty String for 'id'
		if(t.getId() != null && t.getId().isEmpty())
			t.setId(null);
		
		getHibernateTemplate().saveOrUpdate(t);
		return t;
	}
}