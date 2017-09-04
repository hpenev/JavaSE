package vinetki.vehicles;

public class Bus extends Vehicle {

    public Bus() {
	super(VehicleType.BUS);
    }

    @Override
    public boolean isBus() {
	return true;
    }

}
