package targovci.shop;

public abstract class Store {
    protected String address;
    protected String workingTime;
    protected double area;
    protected double tax;

    public Store(String address, String workingTime, double area, double tax) {
	this.address = address;
	this.workingTime = workingTime;
	this.area = verifyArea(area);
	this.tax = tax;
    }

    protected abstract double verifyArea(double area);

}
