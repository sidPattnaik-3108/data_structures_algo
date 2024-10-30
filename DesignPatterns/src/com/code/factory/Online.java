package com.code.factory;

public class Online implements Payments{

	@Override
	public void pay() {
		System.out.println("ONLINE PAYMENT");
	}
}
