package org.axiomaticit.dao;

import java.util.Collection;

import org.axiomaticit.model.Item;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DaoImpl<T extends Item> extends HibernateDaoSupport implements Dao<T> {

	@Override
	public T getById(T t) {
		return (T) getHibernateTemplate().get(t.getClass(), t.getId());
	}

	@Override
	public Collection<T> getAll(Class clazz) {
		return getHibernateTemplate().loadAll(clazz);
	}

	@Override
	public T save(T t) {
		getHibernateTemplate().saveOrUpdate(t);
		return t;
	}
}