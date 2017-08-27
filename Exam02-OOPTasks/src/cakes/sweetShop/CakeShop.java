package cakes.sweetShop;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import cakes.cakes.Cake;
import cakes.cakes.Cake.CakeKind;
import cakes.cakes.Cake.ICakeType;

public class CakeShop {

    private String name;
    private String adres;
    private String gsmNumber;
    private HashMap<CakeKind, HashMap<ICakeType, TreeMap<Cake, Integer>>> vitrina;
    private HashSet<Supplier> suppliers;

    public HashMap<CakeKind, HashMap<ICakeType, TreeMap<Cake, Integer>>> viewVitrina() {
	return (HashMap<CakeKind, HashMap<ICakeType, TreeMap<Cake, Integer>>>) Collections.unmodifiableMap(vitrina);
    }

    public CakeShop(String name, String adres, String gsmNumber) {
	this.name = name;
	this.adres = adres;
	this.gsmNumber = gsmNumber;
	this.vitrina = new HashMap<>();
	suppliers = new HashSet<>();
    }

    public void addSupplier(Supplier s) {
	if (s != null) {
	    this.suppliers.add(s);
	}
    }

    public void addCake(Cake c, int num) {
	if (num > 0 && c != null) {
	    CakeKind kind = c.getKind();
	    if (!vitrina.containsKey(kind)) {
		vitrina.put(kind, new HashMap<>());
	    }
	    ICakeType type = c.getIType();
	    if (!vitrina.get(kind).containsKey(type)) {
		vitrina.get(kind).put(type, new TreeMap<>());
	    }
	    vitrina.get(kind).get(type).put(c, num);
	}
    }

    public void printCatalog() {
	System.out.println(this.name);
	for (java.util.Map.Entry<CakeKind, HashMap<ICakeType, TreeMap<Cake, Integer>>> e : vitrina.entrySet()) {
	    System.out.println(e.getKey());
	    HashMap<ICakeType, TreeMap<Cake, Integer>> map = e.getValue();
	    for (java.util.Map.Entry<ICakeType, TreeMap<Cake, Integer>> e1 : map.entrySet()) {
		System.out.println("    - " + e1.getKey());
		TreeMap<Cake, Integer> mapche = e1.getValue();
		for (java.util.Map.Entry<Cake, Integer> e2 : mapche.entrySet()) {
		    System.out.println("        : " + e2.getKey() + " - " + e2.getValue() + "psc "
			    + e2.getKey().getPrice() + "lv");
		}
	    }
	}
    }

    public void printSupplier() {
	System.out.println("Suppliers: ");

	for (Supplier s : suppliers) {
	    System.out.println(s);
	}
    }

    public void takeOrder(Order order) {
	Supplier supplier = this.suppliers.iterator().next();
	supplier.addOrder(order);
	supplier.makeDelivery();
    }

    public Cake getCake(CakeKind kind, ICakeType type) {
	Cake cake = null;
	if (this.vitrina.containsKey(kind)) {
	    if (this.vitrina.get(kind).containsKey(type)) {
		TreeMap<Cake, Integer> torti = this.vitrina.get(kind).get(type);
		Entry<Cake, Integer> cakeEntry = torti.firstEntry();
		cake = cakeEntry.getKey();
		if (cakeEntry.getValue() == 1) {
		    torti.remove(cakeEntry.getKey());
		} else {
		    torti.put(cake, cakeEntry.getValue() - 1);
		}
		return cake;
	    }
	    System.out.println("Cake type not found");
	    return cake;
	}
	System.out.println("Cake kind not found");
	return cake;

    }

    public boolean containsKind(CakeKind kind) {
	if (this.vitrina.containsKey(kind)) {
	    return true;
	}
	return false;
    }

    public Set<ICakeType> viewKind(CakeKind kind) {
	return this.vitrina.get(kind).keySet();

    }
}
