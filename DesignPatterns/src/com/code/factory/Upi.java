package com.code.factory;

public class Upi implements Payments {
	@Override
	public void pay() {
		System.out.println("UPI PAYMENT");
	}
}
