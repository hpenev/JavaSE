package imoti_v1;

import java.util.ArrayList;
import java.util.Random;

import imoti_v1.agency.Agency;
import imoti_v1.clients.Buyer;
import imoti_v1.clients.Seller;
import imoti_v1.properties.Apartment;
import imoti_v1.properties.House;
import imoti_v1.properties.Parcel;
import imoti_v1.properties.Property;

public class Demo {
    public static void main(String[] args) {
	Agency agency = new Agency("Talanti Estates", "bul bulgaria 69", "0888555333");

	String[] names = { "Pesho", "Gosho", "Ivan", "Tsvetan", "Rumen", "Pavel", "Vasil", "Teodor" };
	String[] phones = { "0888111222", "0888333444", "0888555666", "0888777888", "0888999000" };

	ArrayList<Seller> sellers = new ArrayList<>();
	for (int i = 0; i < 30; i++) {
	    String name = names[new Random().nextInt(names.length)];
	    String phone = phones[new Random().nextInt(phones.length)];
	    Seller seller = new Seller(name, phone, generateProperty());
	    sellers.add(seller);
	}

	for (Seller seller : sellers) {
	    seller.registerProperty(agency);
	}

	ArrayList<Buyer> buyers = new ArrayList<>();
	for (int i = 0; i < 10; i++) {
	    String name = names[new Random().nextInt(names.length)];
	    String phone = phones[new Random().nextInt(phones.length)];
	    int money = new Random().nextInt(120_000) + 70_000;
	    Buyer buyer = new Buyer(name, phone, money);
	    buyers.add(buyer);
	}

	for (Buyer buyer : buyers) {
	    buyer.searchProperty(agency);
	}

	for (Buyer buyer : buyers) {
	    buyer.askView(agency.getRandomProperty());
	    buyer.askView(agency.getRandomProperty());
	    buyer.askView(agency.getRandomProperty());
	}

	for (Buyer buyer : buyers) {
	    Property property = buyer.getRandomProperty();
	    buyer.wannaBuy(property, agency);
	}

	System.out.println(agency.getMoney());

    }

    public static Property generateProperty() {

	String[] desc = { "strahoten", "unikalen", "idealen", "prevyzhoden" };
	String[] addr = { "kv Mladost", "kv Drujba", "kv Manastirski livadi", "kv Studentski grad" };

	String description = desc[new Random().nextInt(desc.length)];
	String address = addr[new Random().nextInt(addr.length)];
	int area = new Random().nextInt(260) + 40;
	Property property = null;

	while (property == null) {
	    int chance = new Random().nextInt(4);
	    switch (chance) {
	    case 0:
		int priceAppartament = new Random().nextInt(80000) + 70000;
		property = new Apartment(description, address, priceAppartament, area,
			Apartment.getRandomApartamentKind(),
			Property.getRandomConstructionType());
		break;
	    case 1:
		int priceHouse = new Random().nextInt(30000) + 50000;
		int parkingLots = new Random().nextInt(5);
		property = new House(description, address, priceHouse, area, House.getRandomHouseKind(),
			Property.getRandomConstructionType(), parkingLots);
		break;
	    case 2:
		int priceParcel = new Random().nextInt(55000) + 30000;
		boolean isInRegulaciq = new Random().nextBoolean();
		property = new Parcel(description, address, priceParcel, area,
			Parcel.getRandomParcelKind(), isInRegulaciq);
		break;
	    default:
		break;
	    }
	}

	return property;
    }
}
