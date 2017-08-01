package sud.objects.citizens;

public class Witness extends Citizen {

    public Witness(String name, String address, int age) {
	super(name, address, age);
    }

    @Override
    public boolean isWitness() {
	return true;
    }
}
