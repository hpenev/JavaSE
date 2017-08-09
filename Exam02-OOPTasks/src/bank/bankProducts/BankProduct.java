package bank.bankProducts;

import bank.Client;

public abstract class BankProduct {

    private String name;
    protected double annualInterestRate;
    protected int periodInMonths;
    private double money;
    private Client client;

    public BankProduct(String name, double annualInterestRate, int periodInMonths) {
	this.name = name;
	this.annualInterestRate = annualInterestRate;
	this.periodInMonths = periodInMonths;
    }

    public int getPeriodInMonths() {
	return periodInMonths;
    }

    public BankProduct(String name, double annualInterestRate) {
	this.name = name;
	this.annualInterestRate = annualInterestRate;
    }

    public boolean isDeposit() {
	return false;
    }

    public boolean isCredit() {
	return false;
    }
}
