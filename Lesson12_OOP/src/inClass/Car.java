package inClass;

public class Car {
    String model;
    double maxSpeed = 200;
    double currentSpeed;
    int maxGear = 6;
    int gear;
    String color;
    int year;
    Person owner;
    double price;
    boolean isSportCar;

    Car() {

    }

    Car(String modelParam, boolean isSportCarParam, String colorParam) {
	this();
	if (modelParam != null && !modelParam.isEmpty()) {
	    model = modelParam;
	}

	isSportCar = isSportCarParam;

	if (colorParam != null && !colorParam.isEmpty()) {
	    color = modelParam;
	}

	currentSpeed = 0;
	gear = 1;
    }

    boolean isMoreExpensive(Car car) {
	return this.price > car.price;
    }

    void beep() {
	System.out.println("Beeep");
    }

    void accelerate() {
	if (currentSpeed <= maxSpeed) {
	    currentSpeed += 5;
	} else {
	    System.out.println("max speed reached");

	}
    }

    void changeGearUp() {
	if (gear < maxGear) {
	    gear++;
	} else {
	    System.out.println("Already at max gear");

	}
    }

    void changeGearDown() {
	if (gear > 1) {
	    gear--;
	} else {
	    System.out.println("Already at min gear");
	}
    }

    void changeGear(int nextGear) {
	if (gear > 0 && gear <= maxGear) {
	    gear = nextGear;
	} else {
	    System.out.println("no such gear");
	}
    }

    void changeColor(String newColor) {
	color = newColor;
    }
}
