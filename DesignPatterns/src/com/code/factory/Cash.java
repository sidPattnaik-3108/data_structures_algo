package com.code.factory;

public class Cash implements Payments{

	@Override
	public void pay() {
		System.out.println("CASH PAYMENT");
	}
}
