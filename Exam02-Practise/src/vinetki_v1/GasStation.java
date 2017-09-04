package vinetki_v1;

import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

import vinetki_v1.vehicles.Vehicle;
import vinetki_v1.vignettes.BusVignette;
import vinetki_v1.vignettes.CarVignette;
import vinetki_v1.vignettes.TruckVignette;
import vinetki_v1.vignettes.Vignette;
import vinetki_v1.vignettes.Vignette.Validity;

public class GasStation {

    private double money;
    private TreeMap<Vignette, Integer> vignettes;

    public GasStation(double money) {
	this.money = money;
	vignettes = new TreeMap<>();
	generateVignette(10_000);
    }

    private void generateVignette(int number) {
	for (int i = 0; i < number; i++) {

	    int randomValidity = new Random().nextInt(3);
	    Validity validity = null;

	    switch (randomValidity) {
	    case 0:
		validity = Validity.DAY;
		break;
	    case 1:
		validity = Validity.MONTH;
		break;
	    case 2:
		validity = Validity.YEAR;
		break;
	    }

	    Vignette v = null;
	    int randomVignette = new Random().nextInt(3);

	    switch (randomVignette) {
	    case 0:
		v = new CarVignette(validity);
		break;
	    case 1:
		v = new TruckVignette(validity);
		break;
	    case 2:
		v = new BusVignette(validity);
		break;
	    }

	    putVignetteInCollection(v);
	}

    }

    private void putVignetteInCollection(Vignette v) {
	if (this.vignettes.containsKey(v)) {
	    int numbers = this.vignettes.get(v).intValue();
	    this.vignettes.put(v, ++numbers);
	} else {
	    this.vignettes.put(v, 1);
	}

    }

    public Vignette buyVignette(Vehicle vehicle) {
	return null;
    }

    public void payVignette(double price) {
	this.money += price;
    }

    public void showVignettesInStock() {
	for (Entry<Vignette, Integer> entry : this.vignettes.entrySet()) {
	    System.out.println(entry.getKey() + " -> " + entry.getValue() + " br");
	}
    }
}
