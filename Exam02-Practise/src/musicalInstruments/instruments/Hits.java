package musicalInstruments.instruments;

import java.util.Arrays;
import java.util.HashSet;

import musicalInstruments.MusicInstrumentType;

public class Hits extends Instrument {

    private static HashSet<String> names = new HashSet<>(Arrays.asList("Drums", "Tambourine"));

    public Hits(String name) {
	super(name);
	this.type = MusicInstrumentType.HIT;
    }

    @Override
    protected boolean validName(String name) {
	if (Hits.names.contains(name)) {
	    return true;
	}
	return false;
    }

}
