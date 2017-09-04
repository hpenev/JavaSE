package musicalInstruments.instruments;

import java.util.Arrays;
import java.util.HashSet;

import musicalInstruments.MusicInstrumentType;

public class Strings extends Instrument {

    private static HashSet<String> names = new HashSet<>(
	    Arrays.asList("Violin", "Viola", "Contrabass", "Harp", "Guitar",
		    "Gadulka"));

    public Strings(String name) {
	super(name);
	this.type = MusicInstrumentType.STRINGS;
    }

    @Override
    protected boolean validName(String name) {
	if (Strings.names.contains(name)) {
	    return true;
	}
	return false;
    }

}
