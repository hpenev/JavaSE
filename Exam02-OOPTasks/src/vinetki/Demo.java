package vinetki;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import vinetki.vehicles.Bus;
import vinetki.vehicles.Car;
import vinetki.vehicles.Truck;
import vinetki.vehicles.Vehicle;

public class Demo {
    public static void main(String[] args) {
	PetrolStation petrolStation = new PetrolStation(5000);
	petrolStation.showAllVignetes();

	ArrayList<Driver> drivers = new ArrayList<>();

	for (int i = 0; i < 20; i++) {
	    Driver driver = new Driver(new Random().nextInt(15000) + 5000);
	    driver.setPetrolStation(petrolStation);
	    drivers.add(driver);
	}

	Stack<Vehicle> vehicles = new Stack<>();

	for (int i = 0; i < 200; i++) {
	    switch (new Random().nextInt(3)) {
	    case 0:
		Car car = new Car();
		vehicles.push(car);
		break;
	    case 1:
		Bus bus = new Bus();
		vehicles.push(bus);
		break;
	    case 2:
		Truck truck = new Truck();
		vehicles.push(truck);
		break;
	    default:
		break;
	    }
	}

	for (int i = 0; i < drivers.size(); i++) {
	    for (int j = 0; j < 10; j++) {
		drivers.get(i).addVehicle(vehicles.pop());
	    }
	}

	for (int i = 0; i < drivers.size(); i++) {
	    if (i % 3 == 0) {
		for (int j = 0; j < 5; j++) {
		    drivers.get(i).buyVignetteFor5Vehicles();
		}
	    } else {
		drivers.get(i).buyVignetteForAll();
	    }
	}

	for (int i = 0; i < drivers.size(); i++) {
	    System.out.println(drivers.get(i));
	}
    }
}
