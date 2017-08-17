package vinetki.vignetes;

import vinetki.vehicles.VehicleType;

public class YearlyVignette extends Vignette {

    public YearlyVignette(VehicleType vehicleType) {
	super(VignetePeriod.YEAR, vehicleType);
    }
}
