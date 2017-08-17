package vinetki.vehicles;

public class Truck extends Vehicle {

    public Truck() {
	super(VehicleType.TRUCK);
    }

    @Override
    public boolean isTruck() {
	return true;
    }
}
