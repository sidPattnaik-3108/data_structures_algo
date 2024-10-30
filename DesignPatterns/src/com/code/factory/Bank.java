package com.code.factory;

public class Bank {

	public Payments paymentTypes(String type) {
		if (type == null)
			return null;

		if ("CASH".equalsIgnoreCase(type)) {
			return new Cash();
		} else if ("UPI".equalsIgnoreCase(type)) {
			return new Upi();
		} else if ("ONLINE".equalsIgnoreCase(type)) {
			return new Online();
		}
		return null;
	}

}
