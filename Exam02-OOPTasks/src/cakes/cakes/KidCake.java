package cakes.cakes;

public class KidCake extends Cake implements Comparable<KidCake> {

    public enum KidCakeType implements ICakeType {
	BIRTHDAY, KRUSHTENE, PROSHTAPULNIK
    }

    private String kidName;
    private KidCakeType type;

    public KidCake(KidCakeType type, String name, String description, double price, int numPieces, String kidName) {
	super(name, description, price, numPieces, CakeKind.KID);
	this.type = type;
	this.kidName = kidName;
    }

    @Override
    public int compareTo(KidCake o) {
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
