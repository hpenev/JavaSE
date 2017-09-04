package cakes;

import java.util.ArrayList;
import java.util.Random;

import cakes.cakes.KidCake;
import cakes.cakes.KidCake.KidCakeType;
import cakes.cakes.SpecialCake;
import cakes.cakes.SpecialCake.SpecialCakeType;
import cakes.cakes.StandartCake;
import cakes.cakes.StandartCake.StandartCakeType;
import cakes.cakes.WeddingCake;
import cakes.cakes.WeddingCake.WeddingCakeType;
import cakes.clients.Client;
import cakes.clients.CoorporateClient;
import cakes.clients.PrivateClient;
import cakes.sweetShop.CakeShop;
import cakes.sweetShop.Supplier;

public class Demo {

    public static void main(String[] args) {

	CakeShop nedelq = new CakeShop("Sladkarnica Nedelq", "Ul. Dolo 5", "08999875620");

	String[] names = { "Pesho", "Toni", "Moni", "Tosho", "Gosho" };
	String[] gsmNumbers = { "0899949505", "0899949505", "0899949001", "0899949875", "0899749502", "0879969505" };
	for (int i = 0; i < 5; i++) {
	    String name = names[new Random().nextInt(names.length)];
	    String gsmNumber = gsmNumbers[new Random().nextInt(gsmNumbers.length)];
	    Supplier s = new Supplier(name, gsmNumber);
	    nedelq.addSupplier(s);
	}

	nedelq.printSupplier();

	String[] cakeNames = { "Nedelq", "Subota", "Romans", "Naslada", "Celuvka", "Vulshebstvo" };
	String[] opisaniq = { "Mnogo vkusna", "Neveroqtna e", "Golqma naslada" };

	for (int i = 0; i < 30; i++) {

	    int chance = new Random().nextInt(100);
	    String cakeName = cakeNames[new Random().nextInt(cakeNames.length)];
	    String opisanie = opisaniq[new Random().nextInt(opisaniq.length)];
	    double price = new Random().nextDouble() * 10 + new Random().nextInt(80) + 20;
	    int numPieces = new Random().nextInt(10) + 1;
	    int number = new Random().nextInt(5) + 1;

	    if (chance < 25) {
		boolean isMoistCake = new Random().nextBoolean();
		StandartCakeType t = StandartCakeType.values()[new Random()
			.nextInt(StandartCakeType.values().length)];
		StandartCake c = new StandartCake(t, cakeName, opisanie, price, numPieces, isMoistCake);
		nedelq.addCake(c, number);
	    } else {
		if (chance >= 25 && chance < 50) {
		    WeddingCakeType t = WeddingCakeType.values()[new Random()
			    .nextInt(WeddingCakeType.values().length)];
		    int numFloor = new Random().nextInt(3);
		    WeddingCake c = new WeddingCake(t, cakeName, opisanie, price, numPieces, numFloor);
		    nedelq.addCake(c, number);
		} else {
		    if (chance >= 50 && chance < 75) {
			SpecialCakeType t = SpecialCakeType.values()[new Random()
				.nextInt(SpecialCakeType.values().length)];
			SpecialCake c = new SpecialCake(t, cakeName, opisanie, price, numPieces, "Golqmo Subitie");
			nedelq.addCake(c, number);
		    } else {
			KidCakeType t = KidCakeType.values()[new Random().nextInt(KidCakeType.values().length)];
			KidCake c = new KidCake(t, cakeName, opisanie, price, numPieces, "Goshko");
			nedelq.addCake(c, number);
		    }
		}
	    }
	}

	nedelq.printCatalog();

	String[] namesClient = { "Pesho", "Toni", "Moni", "Tosho", "Gosho", "Koko", "Misho", "Tisho" };
	String[] gsmNumbersClient = { "0899949505", "0899949505", "0899949001", "0899949875", "0899749502",
		"0879969505" };

	ArrayList<Client> clients = new ArrayList<>();

	for (int i = 0; i < 10; i++) {
	    String name = namesClient[new Random().nextInt(namesClient.length)];
	    String gsmNumber = gsmNumbersClient[new Random().nextInt(gsmNumbersClient.length)];
	    if (new Random().nextBoolean()) {
		int numVaucher = new Random().nextInt(4) + 1;
		double money = new Random().nextDouble() * 10 + new Random().nextInt(500) + 100;
		double priceVaucher = new Random().nextDouble() * 10 + new Random().nextInt(20) + 1;
		PrivateClient p = new PrivateClient(name, gsmNumber, money, numVaucher, priceVaucher);
		clients.add(p);
	    } else {
		double money = new Random().nextDouble() * 10 + new Random().nextInt(1000) + 500;
		CoorporateClient c = new CoorporateClient(name, gsmNumber, money);
		clients.add(c);
	    }
	}

	for (Client c : clients) {
	    c.addShop(nedelq);
	    System.out.println(c);
	}

	for (Client c : clients) {
	    c.makeOrder();
	}

    }

}
