package vinetki.vignetes;

import java.time.LocalDate;

import vinetki.vehicles.VehicleType;

public abstract class Vignette {
    private LocalDate date;
    private Color color;
    private VignetePeriod period;
    private VehicleType vehicleType;
    private double price;

    private static final int daylyCarVignettePrice = 5;
    private static final int daylyTruckVignettePrice = 7;
    private static final int daylyBusVignettePrice = 9;

    private static final int monthlyFactor = 10;
    private static final int yearlyFactor = 6 * monthlyFactor;

    public Vignette(VignetePeriod period, VehicleType vehicleType) {
	this.period = period;
	this.vehicleType = vehicleType;

	// set dayly price
	if (vehicleType == VehicleType.CAR) {
	    this.color = Color.ForCar;
	    this.price = daylyCarVignettePrice;
	}
	if (vehicleType == VehicleType.TRUCK) {
	    this.color = Color.ForTruck;
	    this.price = daylyTruckVignettePrice;
	}
	if (vehicleType == VehicleType.BUS) {
	    this.color = Color.ForBus;
	    this.price = daylyBusVignettePrice;
	}

	// if is not dayly correct price
	if (period == VignetePeriod.MONTH) {
	    this.price *= monthlyFactor;
	}

	if (period == VignetePeriod.YEAR) {
	    this.price *= yearlyFactor;
	}
    }

    public VignetePeriod getPeriod() {
	return period;
    }

    public VehicleType getVehicleType() {
	return vehicleType;
    }

    public double getPrice() {
	return price;
    }

    @Override
    public String toString() {
	StringBuilder vignette = new StringBuilder();
	vignette.append("\nVignette color: " + this.color);
	vignette.append("\nVignette price: " + this.price);
	vignette.append("\nVignette period: " + this.period);
	vignette.append("\nVignette type: " + this.vehicleType);
	return vignette.toString();
    }

}
