package cakes.cakes;

public class WeddingCake extends Cake implements Comparable<WeddingCake> {

    public enum WeddingCakeType implements ICakeType {
	BIG, SMALL, MIDDLE
    }

    private int numFloor;
    private WeddingCakeType type;

    public WeddingCake(WeddingCakeType type, String name, String description, double price, int numPieces,
	    int numFloor) {
	super(name, description, price, numPieces, CakeKind.WEDDING);
	this.type = type;
	this.numFloor = numFloor;
    }

    @Override
    public int compareTo(WeddingCake o) {
	// za da moje v treemapa da vlqzat dve torti s ednakuv broi parcheta
	if (this.numPieces - o.numPieces == 0) {
	    return -1;
	}
	return this.numPieces - o.numPieces;
    }

    @Override
    public ICakeType getIType() {
	return this.type;
    }

}
