package inClass;

public class Person {
    private String name;
    private int age;
    private Person[] friends;
    private double height;
    private double weight;
    private long personalNumber;
    private boolean isMale;
    private double money;
    private Car ownCar;

    Person() {
	this.age = 0;
	this.weight = 4;
    }

    Person(String name) {
	setName(name);
    }

    Person(String name, int age) {
	this(name);
	setAge(age);
    }

    Person(String name, long personalNumber, boolean isMale) {
	this(name);
	this.personalNumber = personalNumber;
	this.isMale = isMale;
    }

    void sellCarForSrap() {
	if (this.ownCar != null) {
	    this.money += this.ownCar.calculateCarPriceForScarp(5.5);
	    this.ownCar = null;
	}
    }

    double getMoney() {
	return money;
    }

    void setMoney(double money) {
	this.money = money;
    }

    void buyCar(Car car) {
	if (car != null) {
	    if (this.money > car.getPrice()) {
		this.ownCar = car;
	    } else {
		System.out.println("Not enough money");
	    }
	}
    }

    void eat() {
	System.out.println("eating");
    }

    void walk() {
	System.out.println("walk");
    }

    void growUp() {
	this.age++;
    }

    void drinkWater(double liters) {
	if (liters > 1) {
	    System.out.println("too much water");
	} else {
	    System.out.println("drinking water");
	}
    }

    String getName() {
	return this.name;
    }

    Person[] getFriends() {
	return this.friends;
    }

    void setFriends(Person[] friends) {
	if (friends != null) {
	    this.friends = friends;
	}
    }

    void setName(String name) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	} else {
	    System.out.println("incorrect name");
	}
    }

    int getAge() {
	return this.age;
    }

    void setAge(int age) {
	if (age > 0) {
	    this.age = age;
	} else {
	    System.out.println("Age should be positive number");
	}
    }

}
