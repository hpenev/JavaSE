package musicalInstruments.instruments;

import java.util.Arrays;
import java.util.HashSet;

import musicalInstruments.MusicInstrumentType;

public class Keys extends Instrument {

    private static HashSet<String> names = new HashSet<>(Arrays.asList("Organ", "Piano", "Accordion"));

    public Keys(String name) {
	super(name);
	this.type = MusicInstrumentType.KEY;
    }

    @Override
    protected boolean validName(String name) {
	if (Keys.names.contains(name)) {
	    return true;
	}
	return false;
    }

}
