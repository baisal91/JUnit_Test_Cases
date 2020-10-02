package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

;

public class ShoppingCartTest2Test {

	private static ShopingCart cart;

	private static Product p1;
	private static Product p2;
	
	
	@BeforeAll
	public static void callbefore() {
		
		cart = new ShopingCart();
		p1 = new Product("soap", 5.00);
		p2 = new Product("facewash", 5.00);
	}

	@BeforeEach
	public void ShoppingCartTest_2() {
		
		
		cart.addItem(p1);
		cart.addItem(p2);

	}

	@Test
	public void testBalanceItem() {

		assertEquals(10.00, cart.getBalance());

	}

	
	@Test
	@DisplayName("add operation test")
	public void testAddItem() {

		Product p3 = new Product("glass", 4);
		Product p4 = new Product("shoe", 5);

		cart.addItem(p3);
		cart.addItem(p4);

		assertEquals(4, cart.getItemCount());

	}

	@Disabled("don't run")
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
	public  void testEmpty() {
		cart.empty();
		assertEquals(0, cart.getItemCount());
	}

}
