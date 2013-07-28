package com.axiomaticit.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.axiomaticit.dao.Dao;
import com.axiomaticit.model.Item;

@ContextConfiguration(locations={"classpath:dao-test-context.xml"})
public class DaoTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private Dao<Item> daoImpl;
	
	@Test
	public void testGetAll() {
		daoImpl.getAll(Item.class);
	}
	
	@Test
	public void testGetById() {
		Item item = daoImpl.save(new Item("title", "author", "content"));
		daoImpl.getById(item);
	}
	
	@Test
	public void testSave() {
		daoImpl.save(new Item("title", "author", "content"));
	}
}
