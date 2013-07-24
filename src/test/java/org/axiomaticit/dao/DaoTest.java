package org.axiomaticit.dao;

import org.axiomaticit.dao.Dao;
import org.axiomaticit.model.Item;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

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
