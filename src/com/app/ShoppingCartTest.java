package com.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ShoppingCartTest extends TestCase {
	
	private ShopingCart cart;
	
	private Product p1;
	private Product p2;
	
	
	
	
	protected void setUp() {
		cart = new ShopingCart();
		p1 =  new Product("soap", 5.00);
		p2 =  new Product("facewash", 5.00);
		cart.addItem(p1);
		cart.addItem(p1);
		
	}
	
	@Test
	public void testBalanceItem() {
		
		assertEquals(10.00, cart.getBalance());
		
		
	}
	
	@Test
	public void testAddItem() {
		
		 Product p3 = new Product("glass", 4);
		 Product p4 = new Product("shoe", 5);
		 
		 cart.addItem(p3);
		 cart.addItem(p4);
		
		assertEquals(4, cart.getItemCount());
		
		
	}
	
	
	@Test
	public void testRemoveItem() {
		
		 Product p3 = new Product("glass", 4);
		 Product p4 = new Product("shoe", 5);
		 
	 
		 cart.addItem(p3);
		 cart.addItem(p4);
		 
		 
		 try {
			cart.romoveItem(p3);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 assertEquals(3, cart.getItemCount());
		
		
	}
	
	
	@Test
	public void testEmpty() {
		cart.empty();
		assertEquals(0, cart.getItemCount());
	}
	
	
	
	
	
	protected void tearDown() {
		
	}
	
	

}
