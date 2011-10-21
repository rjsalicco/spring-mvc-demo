package org.axiomaticit.dao.test;

import org.axiomaticit.dao.Dao;
import org.axiomaticit.model.Item;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(value="classpath:dao-test-context.xml")
public class DaoTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private Dao<Item> daoImpl;
	
	@Test
	public void testGetAll() {
		daoImpl.getAll(Item.class);
	}
	
	@Test
	public void testSave() {
		daoImpl.save(new Item("title", "author", "content"));
	}
}
