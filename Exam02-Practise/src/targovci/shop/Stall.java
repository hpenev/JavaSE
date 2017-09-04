package targovci.shop;

public class Stall extends Store implements ISoleTraderShop {
    // sergiq
    private final static double TAX = 50.00;

    public Stall(String address, String workingTime, double area, double tax) {
	super(address, workingTime, area, Stall.TAX);
    }

    @Override
    protected double verifyArea(double area) {
	if (area >= 2 && area <= 10) {
	    return area;
	}
	return 5;
    }

}
