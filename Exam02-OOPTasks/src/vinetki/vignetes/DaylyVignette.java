package vinetki.vignetes;

import vinetki.vehicles.VehicleType;

public class DaylyVignette extends Vignette {

    public DaylyVignette(VehicleType vehicleType) {
	super(VignetePeriod.DAY, vehicleType);
    }

}
