package inClass;

public class CarShop {
    private Car[] cars;

    CarShop(int capacity) {
	if (capacity > 0) {
	    this.cars = new Car[capacity];
	} else {
	    System.out.println("invalid Capacity");
	}
    }

    boolean addCar(Car car) {
	boolean isCarAdded = false;
	if (this.cars == null) {
	    return false;
	}

	for (int i = 0; i < cars.length; i++) {
	    if (this.cars[i] == null) {
		this.cars[i] = car;
		isCarAdded = true;
		break;
	    }
	}

	return isCarAdded;
    }

    Car getNextCar() {
	if (this.cars == null) {
	    return null;
	}

	for (int i = 0; i < cars.length; i++) {
	    if (this.cars[i] != null) {
		return this.cars[i];
	    }
	}

	return null;
    }

    void sellNextCar(Person buyer) {
	if (this.cars == null) {
	    System.out.println("No cars in the CarShop");
	}

	for (int i = 0; i < cars.length; i++) {
	    if (this.cars[i] != null) {
		this.cars[i].changeOwner(buyer);
		this.cars[i] = null;
		return;
	    }
	}

	System.out.println("All cars in the CarShop are sold");
    }

    // TODO implement 21

    void showAllCarsInTheShop() {
	if (this.cars == null) {
	    System.out.println("No cars in the CarShop");
	    return;
	}

	for (int i = 0; i < cars.length; i++) {
	    if (this.cars[i] != null) {
		System.out.println();
		System.out.println("Model: " + this.cars[i].getModel());
		System.out.println("Price: " + this.cars[i].getPrice());
		System.out.println("Color: " + this.cars[i].getColor());
	    }
	}
    }

}
