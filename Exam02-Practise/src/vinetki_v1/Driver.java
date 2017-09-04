package vinetki_v1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;

import vinetki_v1.vehicles.Vehicle;
import vinetki_v1.vignettes.Vignette;
import vinetki_v1.vignettes.Vignette.Validity;

public class Driver {

    private String name;
    private HashSet<Vehicle> vehicles;
    private double money;
    private GasStation gasStation;

    public Driver(String name) {
	this.name = name;
	this.money = new Random().nextInt(5000) + 5000;
	this.vehicles = new HashSet<>();
    }

    /**
     * Get random index of vehicles
     * 
     * @return random index of one vehicle
     */
    public int getRandom() {
	return new Random().nextInt(this.vehicles.size());
    }

    /**
     * Buy vignettes for one specific vehicle
     * 
     * @param index
     *            - number of the vehicle
     * @param months
     *            - how months
     */
    public void buyVignette(int index, Validity validity) {
	Vehicle[] v = this.vehicles.toArray(new Vehicle[this.vehicles.size()]);
	this.gasStation.buyVignette(v[index]);
    }

    /**
     * Buy vignettes for all vehicles
     */
    public void buyVignettes() {
	for (Vehicle vehicle : vehicles) {
	    Vignette v = this.gasStation.buyVignette(vehicle);
	    vehicle.setVignette(v);
	    this.money -= v.getPrice();
	    this.gasStation.payVignette(v.getPrice());
	}
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Driver other = (Driver) obj;
	if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(money);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    @Override
    public String toString() {
	StringBuilder result = new StringBuilder();
	result.append(this.name + " " + this.money);
	result.append("\n");
	for (Vehicle vehicle : vehicles) {
	    result.append("->" + vehicle);
	    result.append("\n");
	}
	return result.toString();
    }

    public void setGasStation(GasStation gasStation) {
	this.gasStation = gasStation;
    }

    /**
     * View vehicles with expiried vignette
     * 
     * @param date
     *            - date to look at.
     */
    public void viewVehiclesWithExpiredVignette(LocalDate date) {

    }

    public void addVehicle(Vehicle vehicle) {
	this.vehicles.add(vehicle);
    }

    public Vehicle getRandomVehicle() {
	Vehicle[] vehiclesArr = this.vehicles.toArray(new Vehicle[vehicles.size()]);
	return vehiclesArr[new Random().nextInt(vehiclesArr.length)];
    }

}
