package bank.bankProducts.credits;

import bank.bankProducts.BankProduct;

public class Credit extends BankProduct {

    private double monthlyPayment;

    public Credit(String name, double annualInterestRate) {
	super(name, annualInterestRate);

    }

    @Override
    public boolean isCredit() {
	return true;
    }

    public void takeCredit(double money, int periodInMonths) {
	this.periodInMonths = periodInMonths;
	// https://www.thebalance.com/loan-payment-calculations-315564
	int n = this.periodInMonths;
	double i = this.annualInterestRate / 100 / 12;
	double discountFactor = (Math.pow(1 + i, n) - 1) / (i * Math.pow((1 + i), n));
	this.monthlyPayment = money / discountFactor;
    }
}
