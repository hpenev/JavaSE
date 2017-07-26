package shop.objects;

public class Shop {

    private String name;
    private String address;
    private double cash;
    private Product[] products;

    public Shop(String name, String address, double cash) {
	this.name = name;
	this.address = address;
	this.cash = cash;
    }

    public double getCash() {
	return cash;
    }

    void receivePay(double money) {
	this.cash += money;
    }

    public void addProduct(Product product) {
	if (this.products == null) {
	    this.products = new Product[0];
	}

	Product[] temp = new Product[this.products.length + 1];
	for (int i = 0; i < this.products.length; i++) {
	    temp[i] = this.products[i];
	}
	temp[temp.length - 1] = product;

	this.products = temp;
    }

    Product[] getProducts() {
	return products;
    }

    void revision() {
	System.out.println("------Revision------");
	System.out.println(this.name);
	System.out.println(this.cash);
	for (int i = 0; i < this.products.length; i++) {
	    System.out.println(this.products[i]);
	}
	System.out.println("------End------");
    }

    void increaseQuantity(Product product, double quantity) {
	for (int i = 0; i < this.products.length; i++) {
	    if (this.products[i].equals(product)) {
		this.products[i].increseQuantity(quantity);
		break;
	    }
	}
    }

    void decreaseQuantity(Product product, double quantity) {
	for (int i = 0; i < this.products.length; i++) {
	    if (this.products[i].equals(product)) {
		this.products[i].decreseQuantity(quantity);
		break;
	    }
	}
    }
}
