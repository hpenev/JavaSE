package bank.bankProducts.deposits;

import bank.bankProducts.BankProduct;

public class Deposit extends BankProduct {

    private double montlyInterestPayment;

    public Deposit(String name, double annualInterestRate, int periodInMonths) {
	super(name, annualInterestRate, periodInMonths);
    }

    public void takeDeposit(double money) {
	// https://www.thebalance.com/loan-payment-calculations-315564
	int n = this.periodInMonths;
	double i = this.annualInterestRate / 100 / 12;
	double discountFactor = (Math.pow(1 + i, n) - 1) / (i * Math.pow((1 + i), n));
	this.montlyInterestPayment = money / discountFactor;
    }

    @Override
    public boolean isDeposit() {
	return true;
    }

}
