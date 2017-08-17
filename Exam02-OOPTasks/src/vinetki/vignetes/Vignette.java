package vinetki.vignetes;

import java.time.LocalDate;

import vinetki.vehicles.Vehicle;
import vinetki.vehicles.VehicleType;

public abstract class Vignette {
    private LocalDate date;
    private Color color;
    private VignetePeriod period;
    private Vehicle vehicle;
    private double price;

    private static final int daylyCarVignettePrice = 5;
    private static final int daylyTruckVignettePrice = 7;
    private static final int daylyBusVignettePrice = 9;

    private static final int monthlyFactor = 10;
    private static final int yearlyFactor = 6 * monthlyFactor;

    public Vignette(VignetePeriod period, VehicleType vehicleType) {
	this.period = period;

	// TODO: Da pitam Krasi za po elegantno reshenie
	if (period == VignetePeriod.DAY) {
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
	}

	if (period == VignetePeriod.MONTH) {
	    if (vehicleType == VehicleType.CAR) {
		this.color = Color.ForCar;
		this.price = daylyCarVignettePrice * monthlyFactor;
	    }
	    if (vehicleType == VehicleType.TRUCK) {
		this.color = Color.ForTruck;
		this.price = daylyTruckVignettePrice * monthlyFactor;
	    }
	    if (vehicleType == VehicleType.BUS) {
		this.color = Color.ForBus;
		this.price = daylyBusVignettePrice * monthlyFactor;
	    }
	}

	if (period == VignetePeriod.YEAR) {
	    if (vehicleType == VehicleType.CAR) {
		this.color = Color.ForCar;
		this.price = daylyCarVignettePrice * yearlyFactor;
	    }
	    if (vehicleType == VehicleType.TRUCK) {
		this.color = Color.ForTruck;
		this.price = daylyTruckVignettePrice * yearlyFactor;
	    }
	    if (vehicleType == VehicleType.BUS) {
		this.color = Color.ForBus;
		this.price = daylyBusVignettePrice * yearlyFactor;
	    }
	}
    }

    public double getPrice() {
	return price;
    }

    public void place(Vehicle vehicle) {
	this.vehicle = vehicle;
    }

    @Override
    public String toString() {
	return "Vignette color " + this.color + " and price " + this.price;
    }

}
