package sud.objects.CitizenStuff;

import sud.objects.JuristStuff.Lawyer;

public class Accused extends Citizen {

    private Lawyer[] layers;

    public Accused(String name, String address, int age) {
	super(name, address, age);
    }

}
