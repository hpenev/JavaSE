package vinetki;

import java.util.LinkedList;
import java.util.Random;

import vinetki.vehicles.VehicleType;
import vinetki.vignetes.DaylyVignette;
import vinetki.vignetes.MontlyVignette;
import vinetki.vignetes.VignetePeriod;
import vinetki.vignetes.Vignette;
import vinetki.vignetes.YearlyVignette;

public class PetrolStation {

    private double money;
    private LinkedList<Vignette> vignettes;

    public PetrolStation(double money) {
	this.money = money;
	this.vignettes = generateVignettes(10000);
    }

    private LinkedList<Vignette> generateVignettes(int number) {
	LinkedList<Vignette> vignettes = new LinkedList<>();
	for (int i = 0; i < number; i++) {
	    VehicleType type = null;

	    switch (new Random().nextInt(3)) {
	    case 0:
		type = VehicleType.CAR;
		break;
	    case 1:
		type = VehicleType.BUS;
		break;
	    case 2:
		type = VehicleType.TRUCK;
		break;
	    }

	    switch (new Random().nextInt(3)) {
	    case 0:
		DaylyVignette daylyVignette = new DaylyVignette(type);
		vignettes.add(daylyVignette);
		break;
	    case 1:
		MontlyVignette montlyVignette = new MontlyVignette(type);
		vignettes.add(montlyVignette);
		break;
	    case 2:
		YearlyVignette yearlyVignette = new YearlyVignette(type);
		vignettes.add(yearlyVignette);
		break;
	    }
	}
	return vignettes;
    }

    public void showAllVignetes() {
	for (Vignette vignette : vignettes) {
	    System.out.println(vignette);
	}
    }

    public Vignette buyVignette(VehicleType vehicleType, VignetePeriod period) {
	for (Vignette vignette : vignettes) {
	    if (vignette.getVehicleType() == vehicleType && period == vignette.getPeriod()) {
		return vignette;
	    }
	}
	return null;
    }

    public void payForVignette(Vignette vignette) {
	this.money += vignette.getPrice();
    }
}
