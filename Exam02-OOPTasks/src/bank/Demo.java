package bank;

import java.util.Random;

import bank.bankProducts.credits.Credit;
import bank.bankProducts.deposits.Deposit;

public class Demo {
    public static void main(String[] args) {
	Bank bank = new Bank("Bank", "address", 10_000_000);

	Deposit shortDeposit = new Deposit("Short Deposit", 3.00, 3);
	Deposit longDeposit = new Deposit("Long Deposit", 5.00, 12);

	Credit homeCredit = new Credit("Home Credit", 6.00);
	Credit consumerCredit = new Credit("Consumer Credit", 10.00);

	bank.addBankProduct(consumerCredit);
	bank.addBankProduct(homeCredit);
	bank.addBankProduct(longDeposit);
	bank.addBankProduct(shortDeposit);

	Client[] clients = new Client[10];
	for (int i = 0; i < clients.length; i++) {
	    clients[i] = new Client("Client" + (i + 1), "addres", new Random().nextInt(15000) + 5000,
		    new Random().nextInt(2000) + 1000);
	}

	for (Client client : clients) {
	    client.enterBank(bank);
	    client.openDeposit(new Random().nextInt(21) + 80);
	}

    }
}
