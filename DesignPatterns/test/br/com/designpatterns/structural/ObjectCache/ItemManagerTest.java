package br.com.designpatterns.structural.ObjectCache;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemManagerTest {

	private String[] codes = { "000001", "000002", "000003", "000004", "000005", "000006", "000007" };
	
	@Test
	public void should_activate_item_successfully() {
		ItemManagerTestable itemManager = new ItemManagerTestable();
		for (String code : codes) {
			itemManager.activate(code);
			assertNotNull("Notify Listeners called", itemManager.getLastMessage());
			assertEquals("Item activated sucessfully", itemManager.getLastMessage());
		}
	}

	@Test
	public void should_be_already_activated_in_database() {
		ItemManagerTestable itemManager = new ItemManagerTestable();
		for (String code : codes) {
			itemManager.activate(code);
			assertNotNull("Notify Listeners called", itemManager.getLastMessage());
			assertEquals("Item activated sucessfully", itemManager.getLastMessage());
		}
		
		itemManager.activate("000001");
		assertNotNull("Notify Listeners called", itemManager.getLastMessage());
		assertEquals("Item already activated - DB access", itemManager.getLastMessage());
		
		itemManager.activate("000002");
		assertNotNull("Notify Listeners called", itemManager.getLastMessage());
		assertEquals("Item already activated - DB access", itemManager.getLastMessage());
	}
	
	@Test
	public void should_be_already_activated_in_cache() {
		ItemManagerTestable itemManager = new ItemManagerTestable();
		for (String code : codes) {
			itemManager.activate(code);
			assertNotNull("Notify Listeners called", itemManager.getLastMessage());
			assertEquals("Item activated sucessfully", itemManager.getLastMessage());
		}
		
		itemManager.activate("000003");
		assertNotNull("Notify Listeners called", itemManager.getLastMessage());
		assertEquals("Item already activated - cache", itemManager.getLastMessage());
		
		itemManager.activate("000007");
		assertNotNull("Notify Listeners called", itemManager.getLastMessage());
		assertEquals("Item already activated - cache", itemManager.getLastMessage());
	}
	
		
	

}
