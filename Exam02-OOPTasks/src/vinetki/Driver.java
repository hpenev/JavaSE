package vinetki;

import java.util.ArrayList;
import java.util.Random;

import vinetki.vehicles.Vehicle;
import vinetki.vignetes.VignetePeriod;
import vinetki.vignetes.Vignette;

public class Driver {
    private String name;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private double money;
    private PetrolStation petrolStation;

    public Driver(double money) {
	this.money = money;
    }

    public void addVehicle(Vehicle vehicle) {
	this.vehicles.add(vehicle);
    }

    private void buyVignete(Vehicle vehicle) {
	Vignette vignette = petrolStation.buyVignette(vehicle, getRandomVignettePeriod());
	this.petrolStation.payForVignette(vignette);
	this.money -= vignette.getPrice();

	vehicle.setVignette(vignette);
    }

    public void buyVignetteFor5Vehicles() {
	for (int i = 0; i < 5; i++) {
	    Vehicle vehicle = vehicles.get(i);
	    buyVignete(vehicle);
	}
    }

    public void buyVignetteForAll() {
	for (Vehicle vehicle : vehicles) {
	    buyVignete(vehicle);
	}
    }

    private VignetePeriod getRandomVignettePeriod() {
	VignetePeriod period = null;
	switch (new Random().nextInt(3)) {
	case 0:
	    period = VignetePeriod.DAY;
	    break;
	case 1:
	    period = VignetePeriod.MONTH;
	    break;
	case 2:
	    period = VignetePeriod.YEAR;
	    break;
	default:
	    break;
	}
	return period;
    }

    public ArrayList<Vehicle> getVehiclesWithoutVignette() {
	// TODO
	return null;
    }

    public void setPetrolStation(PetrolStation petrolStation) {
	this.petrolStation = petrolStation;
    }

    @Override
    public String toString() {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append("Driver has: ");
	stringBuilder.append("\n");
	stringBuilder.append("money = " + this.money);
	stringBuilder.append("\n");
	for (int i = 0; i < this.vehicles.size(); i++) {
	    stringBuilder.append(this.vehicles.get(i));
	    stringBuilder.append("\n");
	}
	return stringBuilder.toString();
    }
}
