package com.dp.java;

public abstract class CreditCard {

	String cardType;
	int creditLimit;
	int annualCharge;

	public String getCardType() {
		return cardType;
	}

	public void setAnnualCharge(int annualCharge) {
		this.annualCharge = annualCharge;
	}

	public int getAnnualCharge() {
		return annualCharge;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getCreditLimit() {
		return creditLimit;
	}
	
	@Override
	public String toString() {
		return "CreditCard [cardType=" + cardType + ", creditLimit=" + creditLimit + ", annualCharge=" + annualCharge
				+ "]";
	}
	
}
