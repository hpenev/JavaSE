package imoti_v1.properties;

import java.util.Random;

public class House extends Property {

    public enum IHouseKind implements IPropertyKind {
	HOUSE_FLOOR, ENTIRE_HOUSE
    }

    private IHouseKind kind;
    private IConstructionType constructionType;
    private int paringPlaces;

    public House(String desc, String address, double price, double area, IHouseKind kind,
	    IConstructionType constructionType, int paringPlaces) {
	super(desc, address, price, area);
	this.kind = kind;
	this.constructionType = constructionType;
	this.paringPlaces = paringPlaces;
	this.type = IPropertyType.HOUSE;
    }

    public static IHouseKind getRandomHouseKind() {
	int key = new Random().nextInt(IHouseKind.values().length);

	switch (key) {
	case 0:
	    return IHouseKind.HOUSE_FLOOR;
	case 1:
	    return IHouseKind.ENTIRE_HOUSE;
	}
	return null;
    }
}
