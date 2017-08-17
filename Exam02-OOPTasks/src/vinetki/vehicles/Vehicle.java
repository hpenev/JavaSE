package vinetki.vehicles;

import vinetki.vignetes.Vignette;

public abstract class Vehicle {
    private VehicleType vehicleType;
    private Vignette vignette;
    private int manufactureYear;

    public void setVignette(Vignette vignette) {
	this.vignette = vignette;
    }

    public Vehicle(VehicleType vehicleType) {
	this.vehicleType = vehicleType;
    }

    public boolean isBus() {
	return false;
    }

    public boolean isCar() {
	return false;
    }

    public boolean isTruck() {
	return false;
    }

    public VehicleType getVehicleType() {
	return vehicleType;
    }

    @Override
    public String toString() {
	return this.vehicleType + " s vinetka " + this.vignette;
    }
}
