package cakes.cakes;

public abstract class Cake {

    public interface ICakeType {
    }

    public enum CakeKind {
	STANDART, WEDDING, SPECIAL, KID
    }

    private String name;
    private String description;
    protected double price;
    protected int numPieces;
    private CakeKind kind;

    public double getPrice() {
	return price;
    }

    public Cake(String name, String description, double price, int numPieces, CakeKind kind) {
	if (!name.trim().isEmpty() && name != null) {
	    this.name = name;
	} else {
	    this.name = "Phantom cake";
	}
	if (!description.trim().isEmpty() && description != null) {
	    this.description = description;
	} else {
	    this.description = "Nqma takava torta.";
	}
	if (this.price > 0) {
	    this.price = price;
	} else {
	    this.price = 5;
	}
	if (this.numPieces > 0) {
	    this.numPieces = numPieces;
	} else {
	    this.numPieces = 5;
	}
	this.kind = kind;
    }

    public CakeKind getKind() {
	return kind;
    }

    public abstract ICakeType getIType();

    @Override
    public String toString() {
	return this.name;
    }

}
