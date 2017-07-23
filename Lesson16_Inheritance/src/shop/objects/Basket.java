package shop.objects;

public class Basket {
    private Product[] products;
    private double[] quantity;

    Basket() {
	this.products = new Product[0];
	this.quantity = new double[0];
    }

    void addInBasket(Product product, double quantity) {
	boolean hasProductInBasket = false;
	for (int i = 0; i < this.productInBasket(); i++) {
	    if (this.getProduct(i).equals(product)) {
		this.increaseQuantity(product, quantity);
		hasProductInBasket = true;
	    }
	}
	if (!hasProductInBasket) {
	    this.addNewProduct(product, quantity);
	}
    }

    private void addNewProduct(Product product, double quantity) {
	Product[] tempProduct = new Product[this.productInBasket() + 1];
	double[] tempQuantity = new double[this.productInBasket() + 1];

	for (int i = 0; i < this.products.length; i++) {
	    tempProduct[i] = this.products[i];
	    tempQuantity[i] = this.quantity[i];
	}

	tempProduct[tempProduct.length - 1] = product;
	tempQuantity[tempQuantity.length - 1] = quantity;

	this.products = tempProduct;
	this.quantity = tempQuantity;
    }

    private void decreaseQuantity(Product product, double quantity) {
	for (int i = 0; i < this.products.length; i++) {
	    if (this.products[i].equals(product)) {
		this.quantity[i] -= quantity;
	    }
	}
    }

    Product getProduct(int i) {
	return this.products[i];
    }

    double getQuantity(Product product) {
	for (int i = 0; i < this.products.length; i++) {
	    if (this.products[i].equals(product)) {
		return this.quantity[i];
	    }
	}
	return -1;
    }

    private void increaseQuantity(Product product, double quantity) {
	for (int i = 0; i < this.products.length; i++) {
	    if (this.products[i].equals(product)) {
		this.quantity[i] += quantity;
	    }
	}
    }

    int productInBasket() {
	return this.products.length;
    }

    void removeFromBasket(Product product, double quantity) {
	for (int i = 0; i < this.productInBasket(); i++) {
	    if (this.products[i].equals(product)) {
		if (this.getQuantity(product) <= quantity) {
		    this.removeProduct(product);
		} else {
		    this.decreaseQuantity(product, quantity);

		}
		break;
	    }
	}
    }

    private void removeProduct(Product product) {
	Product[] tempProducts = new Product[this.products.length - 1];
	double[] tempQuantity = new double[this.quantity.length - 1];

	int index = 0;
	for (int i = 0; i < this.products.length; i++) {
	    if (this.products[i].equals(product)) {
		continue;
	    } else {
		tempProducts[index] = this.products[i];
		tempQuantity[index] = this.quantity[i];
		index++;
	    }
	}

	this.products = tempProducts;
	this.quantity = tempQuantity;
    }
}
