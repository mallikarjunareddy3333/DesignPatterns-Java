package com.dp.java;

public class PlatinumCreditCard extends CreditCard {
	
	public PlatinumCreditCard(int creditLimit, int annualCharges) {
		this.cardType = "Platinum";
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharges;
	}
	
}
