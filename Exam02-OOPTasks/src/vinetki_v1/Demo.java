package vinetki_v1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import vinetki_v1.vehicles.Bus;
import vinetki_v1.vehicles.Car;
import vinetki_v1.vehicles.Truck;
import vinetki_v1.vehicles.Vehicle;
import vinetki_v1.vignettes.Vignette.Validity;

public class Demo {
    public static void main(String[] args) {
	GasStation gasStation = new GasStation(10000);
	gasStation.showVignettesInStock();

	String[] names = { "Noah", "Liam", "William", "Mason", "James", "Benjamin", "Jacob", "Michael", "Elijah",
		"Ethan", "Alexander", "Oliver", "Daniel", "Lucas", "Matthew", "Aiden", "Jackson", "Logan", "David",
		"Joseph" };

	HashSet<Driver> drivers = new HashSet<>();
	while (drivers.size() < 20) {
	    Driver d = new Driver(names[new Random().nextInt(names.length)]);
	    d.setGasStation(gasStation);
	    drivers.add(d);
	}

	System.out.println("====================================");

	for (Driver driver : drivers) {
	    System.out.println(driver);
	}

	System.out.println("====================================");

	ArrayList<Vehicle> vehicles = new ArrayList<>();
	while (vehicles.size() < 200) {
	    int randomVehicle = new Random().nextInt(3);
	    Vehicle vehicle = null;
	    String[] marks = { "Alfa Romeo", "Aston Martin", "Audi", "Bentley", "Benz", "BMW", "Bugatti", "Cadillac",
		    "Chevrolet", "Chrysler", "Citroen", "Corvette", "DAF", "Dacia", "Daewoo", "Daihatsu", "Datsun",
		    "De Lorean", "Dino", "Dodge", "Farboud", "Ferrari", "Fiat", "Ford", "Honda", "Hummer", "Hyundai",
		    "Jaguar", "Jeep", "KIA", "Koenigsegg", "Lada", "Lamborghini", "Lancia", "Land Rover", "Lexus",
		    "Ligier", "Lincoln", "Lotus", "Martini", "Maserati", "Maybach", "Mazda", "McLaren", "Mercedes",
		    "Mercedes-Benz", "Mini", "Mitsubishi", "Nissan", "Noble", "Opel", "Peugeot", "Pontiac", "Porsche",
		    "Renault", "Rolls-Royce", "Rover", "Saab", "Seat", "Skoda", "Smart", "Spyker", "Subaru", "Suzuki",
		    "Toyota", "Vauxhall", "Volkswagen", "Volvo" };

	    String model = marks[new Random().nextInt(marks.length)];
	    int year = new Random().nextInt(30) + 1990;

	    switch (randomVehicle) {
	    case 0:
		vehicle = new Car(model, year);
		break;
	    case 1:
		vehicle = new Truck(model, year);
		break;
	    case 2:
		vehicle = new Bus(model, year);
		break;
	    }
	    vehicles.add(vehicle);
	}

	for (Driver driver : drivers) {
	    for (int i = 0; i < 10; i++) {
		driver.addVehicle(vehicles.get(0));
		vehicles.remove(0);
	    }
	    System.out.println(driver);
	}

	System.out.println("====================================");

	int i = 0;

	for (Driver driver : drivers) {
	    if (i % 3 == 0) {
		for (int j = 0; j < 5; j++) {
		    int randomValidity = new Random().nextInt(3);
		    Validity validity = null;

		    switch (randomValidity) {
		    case 0:
			validity = Validity.DAY;
			break;
		    case 1:
			validity = Validity.MONTH;
			break;
		    case 2:
			validity = Validity.YEAR;
			break;
		    }

		    driver.buyVignette(driver.getRandom(), validity);

		}
	    } else {

	    }

	    i++;
	}
    }
}
