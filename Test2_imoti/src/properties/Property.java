package properties;

import java.util.Random;

import agency.Agent;
import clients.Seller;

public abstract class Property {

    public interface IPropertyKind {

    }

    protected enum IPropertyType {
	APARTMENT, HOUSE, PARCEL
    }

    public enum IConstructionType {
	EPK, TUHLA, PANEL, KIRPICH
    }

    private String desc;
    private String address;
    private double price;
    private double area;
    private Agent agent;
    protected IPropertyType type;
    private IPropertyKind kind;
    private Seller seller;

    public void setAgent(Agent agent) {
	this.agent = agent;
    }

    public Agent getAgent() {
	return agent;
    }

    public double getPrice() {
	return price;
    }

    public Property(String desc, String address, double price, double area) {
	this.desc = desc;
	this.address = address;
	this.price = price;
	this.area = area;
    }

    public static IConstructionType getRandomConstructionType() {
	int key = new Random().nextInt(IConstructionType.values().length);

	switch (key) {
	case 0:
	    return IConstructionType.EPK;
	case 1:
	    return IConstructionType.KIRPICH;
	case 2:
	    return IConstructionType.PANEL;
	case 3:
	    return IConstructionType.TUHLA;
	}
	return null;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	long temp;
	temp = Double.doubleToLongBits(area);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((desc == null) ? 0 : desc.hashCode());
	result = prime * result + ((kind == null) ? 0 : kind.hashCode());
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Property other = (Property) obj;
	if (address == null) {
	    if (other.address != null)
		return false;
	} else if (!address.equals(other.address))
	    return false;
	if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
	    return false;
	if (desc == null) {
	    if (other.desc != null)
		return false;
	} else if (!desc.equals(other.desc))
	    return false;
	if (kind == null) {
	    if (other.kind != null)
		return false;
	} else if (!kind.equals(other.kind))
	    return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
	    return false;
	if (type != other.type)
	    return false;
	return true;
    }

}
