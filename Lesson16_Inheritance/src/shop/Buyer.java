package shop;

public class Buyer {
    private Magazine magazine;
    private int cash;
    private int countCanCarry;
    private Product[] productsInBasket;
    private double[] quantity;

    Buyer(Magazine magazine, int cash, int countCanCarry) {
	this.magazine = magazine;
	this.cash = cash;
	this.countCanCarry = countCanCarry;
    }

    void addStockInBasket(Product product, double quantity) {
	if (this.productsInBasket == null) {
	    this.productsInBasket = new Product[0];
	    this.quantity = new double[0];
	}

	boolean hasProductInBasket = false;

	for (int i = 0; i < productsInBasket.length; i++) {
	    if (productsInBasket[i].equals(product)) {
		this.quantity[i] += quantity;
		hasProductInBasket = true;
	    }
	}

	if (!hasProductInBasket) {
	    Product[] productsTemp = new Product[productsInBasket.length + 1];
	    double[] quantityTemp = new double[productsInBasket.length + 1];

	    for (int i = 0; i < productsInBasket.length; i++) {
		productsTemp[i] = this.productsInBasket[i];
		quantityTemp[i] = this.quantity[i];
	    }

	    productsTemp[productsTemp.length - 1] = product;
	    quantityTemp[quantityTemp.length - 1] = quantity;

	    this.productsInBasket = productsTemp;
	    this.quantity = quantityTemp;
	}

	for (int i = 0; i < this.magazine.getProducts().length; i++) {
	    if (this.magazine.getProducts()[i].equals(product)) {
		this.magazine.getProducts()[i].decreseQuantity(quantity);
		break;
	    }
	}
    }

    void removeStockInCard(Product product) {

    }

    void pay() {
	double moneyToPay = 0;
	for (int i = 0; i < productsInBasket.length; i++) {
	    moneyToPay += productsInBasket[i].getPrice() * quantity[i];
	}

	this.cash -= moneyToPay;
	this.magazine.receivePay(moneyToPay);
    }
}
