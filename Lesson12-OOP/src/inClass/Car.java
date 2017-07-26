package inClass;

public class Car {
    private String model;
    private double maxSpeed = 200;
    private double currentSpeed;
    private int maxGear = 6;
    private int gear;
    private String color;
    private int year;
    private Person owner;
    private double price;

    double getPrice() {
	return price;
    }

    void setPrice(double price) {
	if (price > 0) {
	    this.price = price;
	}
    }

    void changeOwner(Person owner) {
	if (owner != null) {
	    this.owner = owner;
	}
    }

    private boolean isSportCar;

    String getModel() {
	return this.model;
    }

    void setModel(String model) {
	if (model != null && !model.isEmpty()) {
	    this.model = model;
	}
    }

    Car() {

    }

    int getYear() {
	return this.year;
    }

    void setYear(int year) {
	if (year > 1500 && year < 2020) {
	    this.year = year;
	} else {
	    System.out.println("Incorrect year");
	}
    }

    Car(String model, boolean isSportCar, String color) {
	this();
	setModel(model);
	this.isSportCar = isSportCar;
	setColor(color);
	this.currentSpeed = 0;
	this.gear = 1;
    }

    double calculateCarPriceForScarp(double metalPrice) {
	double coef = 0.2;

	if (this.getColor().toLowerCase().equals("black") || this.getColor().toLowerCase().equals("white")) {
	    coef += 0.05;
	}
	if (this.isSportCar) {
	    coef += 0.05;
	}
	return metalPrice * coef;
    }

    String getColor() {
	return this.color;
    }

    void setColor(String color) {
	if (color != null && !color.isEmpty()) {
	    this.color = color;
	}
    }

    boolean isMoreExpensive(Car car) {
	return this.price > car.price;
    }

    void beep() {
	System.out.println(this.model + ": Beeep");
    }

    void accelerate() {
	if (currentSpeed <= maxSpeed) {
	    currentSpeed += 5;
	} else {
	    System.out.println("max speed reached");
	}
    }

    Person getOwner() {
	return this.owner;
    }

    void setOwner(Person owner) {
	if (owner != null) {
	    this.owner = owner;
	} else {
	    System.out.println("There must be an owner");
	}
    }

    void changeGearUp() {
	if (this.gear < this.maxGear) {
	    this.gear++;
	} else {
	    System.out.println("Already at max gear");

	}
    }

    void changeGearDown() {
	if (this.gear > 1) {
	    this.gear--;
	} else {
	    System.out.println("Already at min gear");
	}
    }

    void changeGear(int nextGear) {
	if (this.gear > 0 && this.gear <= this.maxGear) {
	    this.gear = nextGear;
	} else {
	    System.out.println("no such gear");
	}
    }

    void changeColor(String newColor) {
	this.color = newColor;
    }
}
