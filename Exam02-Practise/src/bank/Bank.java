package bank;

import java.util.ArrayList;

import bank.bankProducts.BankProduct;
import bank.bankProducts.credits.Credit;
import bank.bankProducts.deposits.Deposit;

public class Bank {
    private String name;
    private String address;
    private ArrayList<BankProduct> bankProducts = new ArrayList<>();
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Credit> creidts = new ArrayList<>();
    private double money;

    public Bank(String name, String address, double money) {
	this.name = name;
	this.address = address;
	this.money = money;
    }

    public void addBankProduct(BankProduct bankProduct) {
	this.bankProducts.add(bankProduct);
    }

    boolean takeDeposit(double money, int months, Client client) {
	for (BankProduct bankProduct : bankProducts) {
	    if (bankProduct.isDeposit() && bankProduct.getPeriodInMonths() == months) {
		Deposit deposit = (Deposit) bankProduct;

		client.addDeposit(deposit);
		this.money += money;
		return true;
	    }
	}

	System.out.println("No deposit with this months");
	return false;
    }

    void interestDepositPayment() {

    }

    // void giveConsumerCredit(double money, int months, Client client) {
    // ConsumerCredit consumerCredit = new ConsumerCredit("Consumer credit", 6,
    // months, money, client);
    // this.bankProducts.add(consumerCredit);
    // }
    //
    // void giveHomeCredit(double money, int months, Client client) {
    // HomeCredit homeCredit = new HomeCredit("home credit", 6, months, money,
    // client);
    // this.bankProducts.add(homeCredit);
    // }
}
