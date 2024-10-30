package com.code.factory;

public class FactoryDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Payments payment  = bank.paymentTypes("Cash");
		payment.pay();
		
		Payments payment2  = bank.paymentTypes("Upi");
		payment2.pay();
		
		Payments payment3  = bank.paymentTypes("Online");
		payment3.pay();
	}

}
