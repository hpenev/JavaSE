package musicalInstruments;

import musicalInstruments.instruments.Electronics;
import musicalInstruments.instruments.Hits;
import musicalInstruments.instruments.Keys;
import musicalInstruments.instruments.Strings;
import musicalInstruments.instruments.Winds;

public class Demo {
    public static void main(String[] args) {
	MusicShop magazine = new MusicShop(10000);

	magazine.supplyInstrument(new Strings("Violin"), 3);
	magazine.supplyInstrument(new Strings("Viola"), 3);
	magazine.supplyInstrument(new Strings("Contrabass"), 3);
	magazine.supplyInstrument(new Strings("Harp"), 3);
	magazine.supplyInstrument(new Strings("Guitar"), 3);
	magazine.supplyInstrument(new Strings("Gadulka"), 3);

	magazine.supplyInstrument(new Electronics("Synthesizer"), 3);
	magazine.supplyInstrument(new Electronics("Bass guitar"), 3);
	magazine.supplyInstrument(new Electronics("Electric violin"), 3);

	magazine.supplyInstrument(new Hits("Drums"), 3);
	magazine.supplyInstrument(new Hits("Tambourine"), 3);

	magazine.supplyInstrument(new Keys("Organ"), 3);
	magazine.supplyInstrument(new Keys("Piano"), 3);
	magazine.supplyInstrument(new Keys("Accordion"), 3);

	magazine.supplyInstrument(new Winds("Trumpet"), 3);
	magazine.supplyInstrument(new Winds("Trombone"), 3);
	magazine.supplyInstrument(new Winds("Tube"), 3);
	magazine.supplyInstrument(new Winds("Flute"), 3);
	magazine.supplyInstrument(new Winds("Clarinet"), 3);

	magazine.sellInstrument("Synthesizer", 3);

	magazine.viewCatalogByType();
	System.out.println();
	magazine.viewCatalogByName();
	System.out.println();
	magazine.viewCatalogByPrice(false);
	System.out.println();
	magazine.viewInstrumentsInStock();

    }
}
