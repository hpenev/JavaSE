package sudKrasi;

import java.util.ArrayList;

import sudKrasi.citizens.Accuser;
import sudKrasi.citizens.Citizen;
import sudKrasi.citizens.Defendant;
import sudKrasi.citizens.Witness;
import sudKrasi.jurists.Judge;
import sudKrasi.jurists.Jurist;
import sudKrasi.jurists.Jury;
import sudKrasi.jurists.Lawyer;
import sudKrasi.jurists.Procecutor;

public class VelikoTurnovo {

    public static void main(String[] args) {

	ArrayList<Jurist> lica = new ArrayList<>();
	for (int i = 0; i < 3; i++) {
	    lica.add(new Judge("Judge " + i, 3, 10));
	}
	for (int i = 0; i < 10; i++) {
	    lica.add(new Jury("Jury " + i, 2, 50));
	}
	for (int i = 0; i < 5; i++) {
	    lica.add(new Lawyer("Lawyer " + i, 15, 100));
	}
	for (int i = 0; i < 2; i++) {
	    lica.add(new Procecutor("Procecutor " + i, 12, 300));
	}

	ArrayList<Citizen> grajdani = new ArrayList<>();
	for (int i = 0; i < 5; i++) {
	    // TODO get lawyers for accuser
	    grajdani.add(new Accuser("Accuser " + i, 44, "Kilifarevo", new ArrayList<>()));
	}
	for (int i = 0; i < 5; i++) {
	    // TODO get lawyers for accuser
	    grajdani.add(new Defendant("Defendant " + i, 22, "Gabrovo", new ArrayList<>()));
	}
	for (int i = 0; i < 10; i++) {
	    grajdani.add(new Witness("Baba " + i, 82, "Gabrovo"));
	}
	ArrayList<Case> dela = new ArrayList<>();
	for (int i = 0; i < 3; i++) {
	    // TODO do super easy shit here
	    // dela.add(new CivilCase(judge, jury, accuser, witnesses,
	    // defendant))
	}
	for (int i = 0; i < 3; i++) {
	    // TODO do super easy shit here
	    // dela.add(new CriminalCase(judge, jury, accuser, witnesses,
	    // defendant))
	}
	Court c = new Court("vt", "vt", lica, dela);

	for (int i = 0; i < dela.size(); i++) {
	    dela.get(i).execute();
	}
    }
}
