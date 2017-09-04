package bank;

import java.util.ArrayList;
import java.util.Random;

import bank.bankProducts.credits.Credit;
import bank.bankProducts.deposits.Deposit;

public class Client {
    private String name;
    private String address;
    private double moneyInCash;
    private double salary;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Credit> credits = new ArrayList<>();
    private Bank bank;

    public Client(String name, String address, double moneyInCash, double salary) {
	this.name = name;
	this.address = address;
	this.moneyInCash = moneyInCash;
	this.salary = salary;
    }

    public void enterBank(Bank bank) {
	this.bank = bank;
    }

    public void leaveBank() {
	this.bank = null;
    }

    public void addDeposit(Deposit deposit) {
	deposits.add(deposit);
    }

    void openDeposit(double money) {
	int months = 0;

	if (new Random().nextBoolean()) {
	    months = 3;
	} else {
	    months = 12;
	}

	if (this.bank.takeDeposit(money, months, this)) {
	    this.moneyInCash -= money;
	}
    }

    void askHomeCredit(double money, int months) {
	// this.bank.giveHomeCredit(money, months, this);
    }

    // void askConsumerCredit(double money, int months) {
    // this.bank.giveConsumerCredit(money, months, this);
    // }

    void creditMontlyPayment() {
	if (credits.size() > 0) {
	    for (Credit credit : credits) {

	    }
	}
    }

}
