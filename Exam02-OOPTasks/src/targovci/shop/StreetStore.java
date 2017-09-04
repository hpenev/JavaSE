package targovci.shop;

public class StreetStore extends Store implements ISoleTraderShop, IVerigaShop {
    private final static double TAX = 150.00;

    public StreetStore(String address, String workingTime, double area, double tax) {
	super(address, workingTime, area, StreetStore.TAX);
    }

    @Override
    protected double verifyArea(double area) {
	if (area >= 4 && area <= 6) {
	    return area;
	}
	return 5;
    }

}
