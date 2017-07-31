package sud.objects.CitizenStuff;

public class Witness extends Citizen {

    public Witness(String name, String address, int age) {
	super(name, address, age);
    }

    @Override
    public boolean isAccused() {
	return false;
    }

    @Override
    public boolean isAccuser() {
	return false;
    }

    @Override
    public boolean isWitness() {
	return true;
    }
}
