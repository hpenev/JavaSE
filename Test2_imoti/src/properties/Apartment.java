package properties;

import java.util.Random;

public class Apartment extends Property {

    public enum IApartmentKind implements IPropertyKind {
	STUDIO, GARSONIERA, DVUSTAEN, TRISTAEN, MEZONET
    }

    public Apartment(String desc, String address, double price, double area, IApartmentKind kind,
	    IConstructionType constructionType) {
	super(desc, address, price, area);
	this.kind = kind;
	this.constructionType = constructionType;
	this.type = IPropertyType.APARTMENT;
    }

    private IApartmentKind kind;
    private IConstructionType constructionType;

    public static IApartmentKind getRandomApartamentKind() {
	int key = new Random().nextInt(IApartmentKind.values().length);

	switch (key) {
	case 0:
	    return IApartmentKind.STUDIO;
	case 1:
	    return IApartmentKind.GARSONIERA;
	case 2:
	    return IApartmentKind.DVUSTAEN;
	case 3:
	    return IApartmentKind.TRISTAEN;
	case 4:
	    return IApartmentKind.MEZONET;
	}
	return null;
    }
}
