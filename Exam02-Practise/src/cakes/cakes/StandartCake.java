package cakes.cakes;

public class StandartCake extends Cake implements Comparable<StandartCake> {

    public enum StandartCakeType implements ICakeType {
	BISCUIT, EKLER, FRIUT, CHOCOLATE
    }

    private boolean isMoistCake;
    private StandartCakeType type;

    public StandartCake(StandartCakeType type, String name, String description, double price, int numPieces,
	    boolean isMoistCake) {
	super(name, description, price, numPieces, CakeKind.STANDART);
	this.type = type;
	this.isMoistCake = isMoistCake;
    }

    @Override
    public int compareTo(StandartCake o) {
	int razlika = Double.compare(this.price, o.price);
	if (razlika > 0) {
	    return 1;
	}
	if (razlika < 0) {
	    return -1;
	}
	// za da moje dve torti s ednkva cena da vlqzat v treemapa
	return 1;
    }

    @Override
    public ICakeType getIType() {
	return this.type;
    }

}
