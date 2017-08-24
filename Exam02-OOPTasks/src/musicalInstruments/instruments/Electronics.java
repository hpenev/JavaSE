package musicalInstruments.instruments;

import java.util.Arrays;
import java.util.HashSet;

import musicalInstruments.MusicInstrumentType;

public class Electronics extends Instrument {

    private static HashSet<String> names = new HashSet<>(
	    Arrays.asList("Synthesizer", "Bass guitar", "Electric violin"));

    public Electronics(String name) {
	super(name);
	this.type = MusicInstrumentType.ELECTRONIC;
    }

    @Override
    protected boolean validName(String name) {
	if (Electronics.names.contains(name)) {
	    return true;
	}
	return false;
    }

}
