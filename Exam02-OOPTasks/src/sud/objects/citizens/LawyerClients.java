package sud.objects.citizens;

import java.util.ArrayList;

import sud.objects.jutists.Lawyer;

public abstract class LawyerClients extends Citizen {

    protected ArrayList<Lawyer> layers;

    public LawyerClients(String name, String address, int age) {
	super(name, address, age);
    }

    public void setLayers(ArrayList<Lawyer> layers) {
	this.layers = layers;
    }

    public ArrayList<Lawyer> getLayers() {
	return layers;
    }

}
