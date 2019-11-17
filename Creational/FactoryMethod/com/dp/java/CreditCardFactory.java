package com.dp.java;

public class CreditCardFactory {

	public static CreditCard createCreditCard(String type) {
		if (type.equalsIgnoreCase("MoneyBack")) {
			return new MoneyBackCreditCard(50000, 0);
		} else if (type.equalsIgnoreCase("Titanium")) {
			return new TitaniumCreditCard(100000, 500);
		} else if (type.equalsIgnoreCase("Platinum")) {
			return new PlatinumCreditCard(500000, 1000);
		}
		throw new IllegalArgumentException("No such credit card");
	}

}
