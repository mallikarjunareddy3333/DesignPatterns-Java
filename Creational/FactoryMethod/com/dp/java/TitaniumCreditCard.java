package com.dp.java;

public class TitaniumCreditCard extends CreditCard {
	public TitaniumCreditCard(int creditLimit, int annualCharges) {
		this.cardType = "Titanium";
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharges;
	}
}
