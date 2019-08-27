package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
	void printOwing(String name, List<Order> orders) {
		Iterator<Order> elements = orders.iterator();
		double outstanding = 0.0;

		// print owings
		while (elements.hasNext()) {
			Order each = (Order) elements.next();
			outstanding += each.getAmount();
		}
		

	}

	public void printBannerAndDetails(String name, double outstanding) {
		// print banner
		System.out.println("*****************************");
		System.out.println("****** Customer totals ******");
		System.out.println("*****************************");
		// print details
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);
	}
}

class Order {
	private final double amount;

	public Order(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}
