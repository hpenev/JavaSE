package shop;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
	this.name = name;
	this.price = price;
    }

    String getName() {
	return name;
    }

    public boolean equals(Product other) {
	if (this.name.equals(other.getName())) {
	    return true;
	}
	return false;
    }

    void increseQuantity(double quantity) {

    }

    void decreseQuantity(double quantity) {

    }

    double getPrice() {
	return price;
    }

    @Override
    public String toString() {
	StringBuilder sBuilder = new StringBuilder();
	sBuilder.append("name: " + this.name);
	sBuilder.append("\n");
	sBuilder.append("price: " + this.price);
	sBuilder.append("\n");
	return sBuilder.toString();
    }
}
