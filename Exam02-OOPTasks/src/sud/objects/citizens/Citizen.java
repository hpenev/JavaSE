package sud.objects.citizens;

import java.util.ArrayList;
import java.util.Random;

public abstract class Citizen {

    protected String name;

    private String address;

    private int age;

    public String getName() {

	return name;
    }

    public Citizen(String name, String address, int age) {
	this.name = name;
	this.address = address;
	this.age = age;
    }

    public boolean isAccused() {
	return false;
    }

    public boolean isAccuser() {
	return false;
    }

    public boolean isWitness() {
	return false;
    }

    public static ArrayList<Defendant> filterAccused(ArrayList<Citizen> citizens) {
	ArrayList<Defendant> accuseds = new ArrayList<>();
	for (Citizen citizen : citizens) {
	    if (citizen.isAccused()) {
		accuseds.add((Defendant) citizen);
	    }
	}
	return accuseds;
    }

    public static ArrayList<Accuser> filterAccuser(ArrayList<Citizen> citizens) {
	ArrayList<Accuser> accusers = new ArrayList<>();
	for (Citizen citizen : citizens) {
	    if (citizen.isAccuser()) {
		accusers.add((Accuser) citizen);
	    }
	}
	return accusers;
    }

    public static ArrayList<Witness> filterWitness(ArrayList<Citizen> citizens) {
	ArrayList<Witness> witnesses = new ArrayList<>();

	for (Citizen citizen : citizens) {
	    if (citizen.isWitness()) {
		witnesses.add((Witness) citizen);
	    }
	}
	return witnesses;
    }

    public static Defendant getRandomDefendant(ArrayList<Citizen> citizens) {
	Random rnd = new Random();
	ArrayList<Defendant> accuseds = filterAccused(citizens);
	Defendant randomAccused = accuseds.get(rnd.nextInt(accuseds.size()));
	return randomAccused;
    }

    public static Accuser getRandomAccuser(ArrayList<Citizen> citizens) {
	Random rnd = new Random();
	ArrayList<Accuser> accusers = filterAccuser(citizens);
	Accuser randomAccuser = accusers.get(rnd.nextInt(accusers.size()));
	return randomAccuser;
    }

    public static ArrayList<Witness> getRandomWitnesses(ArrayList<Citizen> citizens) {
	Random rnd = new Random();
	ArrayList<Witness> allWitness = filterWitness(citizens);
	ArrayList<Witness> witnesses = new ArrayList<>();

	for (int i = 0; i < rnd.nextInt(allWitness.size()); i++) {
	    witnesses.add(allWitness.get(rnd.nextInt(allWitness.size())));
	}

	return witnesses;
    }

}
