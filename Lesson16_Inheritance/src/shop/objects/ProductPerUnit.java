package shop.objects;

public class ProductPerUnit extends Product {
    private int quantityInPcs;

    public ProductPerUnit(String name, double price, int quantityInPcs) {
	super(name, price);
	this.quantityInPcs = quantityInPcs;
    }

    protected void increseQuantity(int quantity) {
	System.out.println("increse quantity ProductUnit");
	this.quantityInPcs += quantity;
    }

    protected void decreseQuantity(int quantity) {
	System.out.println("Decrese quantity ProductUnit");
	this.quantityInPcs -= quantity;
    }

    @Override
    public String toString() {
	StringBuilder stringBuilder = new StringBuilder(super.toString());
	stringBuilder.append("pcs in stock " + this.quantityInPcs);
	return stringBuilder.toString();
    }
}
