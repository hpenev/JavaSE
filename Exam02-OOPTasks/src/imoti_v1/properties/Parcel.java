package imoti_v1.properties;

import java.util.Random;

public class Parcel extends Property {
    public enum IParcelKind implements IPropertyKind {
	FIELD, MEADOW, FOREST
    }

    private IParcelKind kind;
    private boolean isInRegulaciq;

    public Parcel(String desc, String address, double price, double area, IParcelKind kind,
	    boolean isInRegulaciq) {
	super(desc, address, price, area);
	this.kind = kind;
	this.isInRegulaciq = isInRegulaciq;
	this.type = IPropertyType.PARCEL;
    }

    public static IParcelKind getRandomParcelKind() {
	int key = new Random().nextInt(IParcelKind.values().length);

	switch (key) {
	case 0:
	    return IParcelKind.FIELD;
	case 1:
	    return IParcelKind.MEADOW;
	case 2:
	    return IParcelKind.FOREST;
	}
	return null;
    }
}
