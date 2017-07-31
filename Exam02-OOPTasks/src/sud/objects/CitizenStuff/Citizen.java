package sud.objects.CitizenStuff;

import java.util.ArrayList;
import java.util.Random;

import sud.objects.CaseStuff.Case;

public abstract class Citizen {
    private String name;
    private String address;
    private int age;
    private Case workingCase;

    public String getName() {
	return name;
    }

    public Citizen(String name, String address, int age) {
	this.name = name;
	this.address = address;
	this.age = age;
    }

    // public abstract String answerToJurist();

    public abstract boolean isAccused();

    public abstract boolean isAccuser();

    public abstract boolean isWitness();

    public static ArrayList<Accused> filterAccused(ArrayList<Citizen> citizens) {
	ArrayList<Accused> accuseds = new ArrayList<>();
	for (Citizen citizen : citizens) {
	    if (citizen.isAccused()) {
		accuseds.add((Accused) citizen);
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

    public static Accused getRandomAccused(ArrayList<Citizen> citizens) {
	Random rnd = new Random();
	ArrayList<Accused> accuseds = filterAccused(citizens);
	Accused randomAccused = accuseds.get(rnd.nextInt(accuseds.size()));
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
