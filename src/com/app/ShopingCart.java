package com.app;

import java.util.ArrayList;
import java.util.Iterator;

public class ShopingCart {

	
	private ArrayList<Product> items;
	
	ShopingCart(){
		items = new ArrayList<Product>();
	}
	
	
	public double getBalance() {
		
		double sum = 0.00;
		
		for(Iterator i = items.iterator(); i.hasNext();) {
			
			Product item = (Product) i.next();
			sum += item.getPrice();
		}
		
		return sum;
		
	}
	
	
	public void addItem(Product item) {
		items.add(item);
	}
	
	public void romoveItem(Product item) throws ProductNotFoundException{
		if(!items.remove(item)) {
			throw new ProductNotFoundException();
		}
	}
	
	
	public int getItemCount() {
		return items.size();
		
	}
	
	public void empty() {
		items.clear();
	}
	
	
	
	
	
}
