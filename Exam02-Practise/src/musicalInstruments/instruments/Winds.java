package musicalInstruments.instruments;

import java.util.Arrays;
import java.util.HashSet;

import musicalInstruments.MusicInstrumentType;

public class Winds extends Instrument {

    private static HashSet<String> names = new HashSet<>(
	    Arrays.asList("Trumpet", "Trombone", "Tube", "Flute", "Clarinet"));

    public Winds(String name) {
	super(name);
	this.type = MusicInstrumentType.WIND;
    }

    @Override
    protected boolean validName(String name) {
	if (Winds.names.contains(name)) {
	    return true;
	}
	return false;
    }

}
