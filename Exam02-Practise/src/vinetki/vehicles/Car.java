package vinetki.vehicles;

public class Car extends Vehicle {

    public Car() {
	super(VehicleType.CAR);
    }

    @Override
    public boolean isCar() {
	return true;
    }
}
