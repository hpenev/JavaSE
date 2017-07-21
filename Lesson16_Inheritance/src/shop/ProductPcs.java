package shop;

public class ProductPcs extends Product {
    private int pcsInStock;

    public ProductPcs(String name, double price, int pcsInStock) {
	super(name, price);
	this.pcsInStock = pcsInStock;
    }

    void increseQuantity(double quantity) {
	this.pcsInStock += quantity;
    }

    void decreseQuantity(double quantity) {
	this.pcsInStock -= quantity;
    }

    @Override
    public String toString() {
	StringBuilder stringBuilder = new StringBuilder(super.toString());
	stringBuilder.append("pcs in stock " + this.pcsInStock);
	return stringBuilder.toString();
    }
}
