package org.axiomaticit.dao;

import java.util.Collection;

public interface Dao<T> {

	public T getById(T t);
	
	public Collection<T> getAll(Class<T> clazz);
	
	public T save(T t);
}