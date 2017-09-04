package imoti.properties;

public class Parcel extends Property {
    private boolean isInRegulation;

    public Parcel(String description, double price, boolean isInRegulation) {
	super(description, price);
	this.isInRegulation = isInRegulation;
    }
}
