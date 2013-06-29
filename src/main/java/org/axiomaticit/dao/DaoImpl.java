package org.axiomaticit.dao;

import java.util.Collection;

import org.axiomaticit.model.Model;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DaoImpl<T extends Model> extends HibernateDaoSupport implements Dao<T> {

	@SuppressWarnings("unchecked")
	public T getById(T t) {
		return (T) getHibernateTemplate().get(t.getClass(), t.getId());
	}

	public Collection<T> getAll(Class<T> clazz) {
		return getHibernateTemplate().loadAll(clazz);
	}

	public T save(T t) {
		// check for empty String for 'id'
		if(t.getId().isEmpty())
			t.setId(null);
		
		getHibernateTemplate().saveOrUpdate(t);
		return t;
	}
}