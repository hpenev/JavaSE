package shop.objects;

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

    protected void increseQuantity(double quantity) {
	// refer to subClass
    }

    protected void decreseQuantity(double quantity) {
	// refer to subClass
    }

    protected void increseQuantity(int quantity) {
	// refer to subClass
    }

    protected void decreseQuantity(int quantity) {
	// refer to subClass
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
