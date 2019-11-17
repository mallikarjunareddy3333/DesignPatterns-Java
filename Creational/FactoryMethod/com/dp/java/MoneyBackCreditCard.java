package com.dp.java;

public class MoneyBackCreditCard extends CreditCard {
	
	public MoneyBackCreditCard(int creditLimit, int annualCharges) {
		this.cardType = "MoneyBack";
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharges;
	}
}
