package com.axiomaticit.dao;

import static org.junit.Assert.*;

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
		assertNotNull(daoImpl.getAll(Item.class));
	}
	
	@Test
	public void testGetById() {
		Item item = daoImpl.save(new Item("title", "author", "content"));
		assertNotNull(daoImpl.getById(item));
	}
	
	@Test
	public void testSave() {
		assertNotNull(daoImpl.save(new Item("title", "author", "content")));
	}
}
