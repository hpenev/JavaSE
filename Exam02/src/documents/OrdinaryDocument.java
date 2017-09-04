package documents;

public class OrdinaryDocument extends Document {

    public OrdinaryDocument(String name) {
	super(name);
    }

    @Override
    public boolean isOrdinary() {
	return true;
    }
}
