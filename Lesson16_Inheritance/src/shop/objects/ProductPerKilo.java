package shop.objects;

public class ProductPerKilo extends Product {
    private double quantityInKg;

    public ProductPerKilo(String name, double price, double quantityInKg) {
	super(name, price);
	this.quantityInKg = quantityInKg;
    }

    protected void increseQuantity(double quantity) {
	System.out.println("increse quantity ProductKG");
	this.quantityInKg += quantity;
    }

    protected void decreseQuantity(double quantity) {
	System.out.println("Decrese quantity ProductKG");
	this.quantityInKg -= quantity;
    }

    @Override
    public String toString() {
	StringBuilder stringBuilder = new StringBuilder(super.toString());
	stringBuilder.append("kg in stock " + quantityInKg);
	return stringBuilder.toString();
    }
}
