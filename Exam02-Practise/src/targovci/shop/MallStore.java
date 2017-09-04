package targovci.shop;

public class MallStore extends Store implements IVerigaShop {

    private final static double TAX = 150.00;

    public MallStore(String address, String workingTime, double area, double tax) {
	super(address, workingTime, area, MallStore.TAX);
    }

    @Override
    protected double verifyArea(double area) {
	if (area >= 10 && area <= 100) {
	    return area;
	}
	return 50;
    }

}
