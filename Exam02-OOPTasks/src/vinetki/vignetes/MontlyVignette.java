package vinetki.vignetes;

import vinetki.vehicles.VehicleType;

public class MontlyVignette extends Vignette {

    public MontlyVignette(VehicleType vehicleType) {
	super(VignetePeriod.MONTH, vehicleType);
    }

}
