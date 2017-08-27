package musicalInstruments;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import musicalInstruments.instruments.Instrument;

public class MusicShop {

    private double profit;
    private double cash;
    private TreeMap<Instrument, Integer> catalogue;
    private TreeMap<Instrument, Integer> selledInstruments;

    public double getCash() {
	return cash;
    }

    public MusicShop(double money) {
	this.cash = money;
	this.catalogue = new TreeMap<>();
	this.selledInstruments = new TreeMap<>();
    }

    public void supplyInstrument(Instrument instrument, int pieces) {
	if (!this.catalogue.containsKey(instrument)) {
	    this.catalogue.put(instrument, 0);
	}
	int currentPieces = this.catalogue.get(instrument);
	pieces += currentPieces;
	this.catalogue.put(instrument, pieces);
    }

    public void sellInstrument(String name, int number) {
	for (Entry<Instrument, Integer> entry : this.catalogue.entrySet()) {
	    Instrument instrument = entry.getKey();
	    Integer pieces = entry.getValue();
	    if (instrument.getName().equals(name)) {
		if (pieces >= number) {
		    System.out.println("SOLD: " + number + " " + instrument);
		    entry.setValue(entry.getValue() - number);
		    this.cash += instrument.getPrice() * number;
		    this.profit += instrument.getPrice() * number;
		    this.selledInstruments.put(instrument, number);
		    return;
		} else {
		    System.out.println("not enough in stock");
		    return;
		}
	    }
	}
	System.out.println("Instrument not found");
    }

    private TreeSet<Instrument> getAllInstuments() {
	TreeSet<Instrument> allInstrument = new TreeSet<>();
	for (Instrument entry : this.catalogue.keySet()) {
	    allInstrument.add(entry);
	}
	return allInstrument;
    }

    private TreeSet<Instrument> sortCatalogBy(Comparator<Instrument> comparator) {
	TreeSet<Instrument> sorted = new TreeSet<>(comparator);
	sorted.addAll(getAllInstuments());
	return sorted;
    }

    public void viewCatalogByType() {
	Comparator<Instrument> type = new Comparator<Instrument>() {
	    @Override
	    public int compare(Instrument o1, Instrument o2) {
		if (o1.getType().equals(o2.getType())) {
		    if (o1.getName().equals(o2.getName())) {
			return Double.compare(o1.getPrice(), o2.getPrice());
		    }
		    return o1.getName().compareTo(o2.getName());
		}
		return o1.getType().compareTo(o2.getType());
	    }
	};

	TreeSet<Instrument> sortedByType = sortCatalogBy(type);

	for (Instrument instrument : sortedByType) {
	    System.out.println("Type: " + instrument.getType() + " Name: " + instrument.getName() + " Price: "
		    + instrument.getPrice());
	}

    }

    public void viewCatalogByName() {
	Comparator<Instrument> name = new Comparator<Instrument>() {
	    @Override
	    public int compare(Instrument o1, Instrument o2) {
		if (o1.getName().equals(o2.getName())) {
		    if (o1.getType().equals(o2.getType())) {
			return Double.compare(o1.getPrice(), o2.getPrice());
		    }
		    return o1.getType().compareTo(o2.getType());
		}
		return o1.getName().compareTo(o2.getName());
	    }
	};

	TreeSet<Instrument> sortedByName = sortCatalogBy(name);

	for (Instrument instrument : sortedByName) {
	    System.out.println("Name: " + instrument.getName() + " Type: " + instrument.getType() + " Price: "
		    + instrument.getPrice());

	}
    }

    public void viewCatalogByPrice(boolean ascendingOrder) {
	Comparator<Instrument> price = new Comparator<Instrument>() {
	    @Override
	    public int compare(Instrument o1, Instrument o2) {
		if (o1.getPrice() == o2.getPrice()) {
		    if (o1.getName().equals(o2.getName())) {
			return o1.getType().compareTo(o2.getType());
		    }
		    return o1.getName().compareTo(o2.getName());
		}
		return Double.compare(o1.getPrice(), o2.getPrice());
	    }
	};

	TreeSet<Instrument> sortedByPrice = sortCatalogBy(price);
	if (!ascendingOrder) {
	    sortedByPrice = (TreeSet<Instrument>) sortedByPrice.descendingSet();
	}

	for (Instrument instrument : sortedByPrice) {
	    System.out.println("Price: " + instrument.getPrice() + " Name: " + instrument.getName() + " Type: "
		    + instrument.getType());
	}
    }

    public void viewInstrumentsInStock() {
	System.out.println("Instruments in stock:");

	for (Entry<Instrument, Integer> entry : this.catalogue.entrySet()) {
	    if (entry.getValue() == 0) {
		continue;
	    }
	    Instrument instrument = entry.getKey();
	    System.out.println(entry.getValue() + "psc " + "Name: " + instrument.getName() + " Type: "
		    + instrument.getType() + " Price: "
		    + instrument.getPrice());
	}
    }

    public void showSelledInstrument() {
	SortedSet<Map.Entry<Instrument, Integer>> sortedSet = MusicShop.entriesSortedByValues(this.selledInstruments);

	for (Entry<Instrument, Integer> entry : sortedSet) {
	    System.out.println(entry.getKey().getName() + "->" + entry.getValue() + "pcs");

	}
    }

    public void showProfit() {
	System.out.println("Total earnings: " + this.profit);
    }

    static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
	SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
		new Comparator<Map.Entry<K, V>>() {
		    @Override
		    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
			int res = e1.getValue().compareTo(e2.getValue());
			return res != 0 ? res : 1;
		    }
		});
	sortedEntries.addAll(map.entrySet());
	return sortedEntries;
    }

    public void showBestSeller() {
	LinkedList<Instrument> topSeller = new LinkedList<>();
	SortedSet<Map.Entry<Instrument, Integer>> sortedSet = MusicShop.entriesSortedByValues(this.selledInstruments);
	for (Entry<Instrument, Integer> entry : sortedSet) {
	    topSeller.add(entry.getKey());
	}
	System.out.println("TopSeller: " + topSeller.getLast());
    }

    public void showMostNotSellingProduct() {
	LinkedList<Instrument> topSeller = new LinkedList<>();
	SortedSet<Map.Entry<Instrument, Integer>> sortedSet = MusicShop.entriesSortedByValues(this.selledInstruments);
	for (Entry<Instrument, Integer> entry : sortedSet) {
	    topSeller.add(entry.getKey());
	}
	System.out.println("Most Not Selling: " + topSeller.getFirst());
    }

}
