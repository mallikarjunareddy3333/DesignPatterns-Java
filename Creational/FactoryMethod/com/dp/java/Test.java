package com.dp.java;

public class Test {

	public static void main(String[] args) {
		
		CreditCard creditcard = CreditCardFactory.createCreditCard("Platinum");
		System.out.println(creditcard.toString());
		
		CreditCard creditcard2 = CreditCardFactory.createCreditCard("titanium");
		System.out.println(creditcard2.toString());
		
	}

}
