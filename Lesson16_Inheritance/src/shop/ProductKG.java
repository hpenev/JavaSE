package shop;

public class ProductKG extends Product {
    private double kgInStock;

    public ProductKG(String name, double price, double kgInStock) {
	super(name, price);
	this.kgInStock = kgInStock;
    }

    void increseQuantity(double quantity) {
	this.kgInStock += quantity;
    }

    void decreseQuantity(double quantity) {
	this.kgInStock -= quantity;
    }

    @Override
    public String toString() {
	StringBuilder stringBuilder = new StringBuilder(super.toString());
	stringBuilder.append("kg in stock " + kgInStock);
	return stringBuilder.toString();
    }
}
