package abstraction;

public class Granade implements Explodable {

    @Override
    public void blowUp() {
	System.out.println("blow up - Granade");
    }

}
