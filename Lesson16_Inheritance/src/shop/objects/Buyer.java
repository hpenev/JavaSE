package shop.objects;

public class Buyer {
    private Shop shop;
    private int cash;
    private int countCanCarry;
    private Basket basket;
    // Максимален брой артикули, които може да купи.

    public Buyer(int cash, int countCanCarry) {
	this.cash = cash;
	this.countCanCarry = countCanCarry;
    }

    public void addProductInBasket(Product product, double quantity) {
	this.basket.addInBasket(product, quantity);
	this.shop.decreaseQuantity(product, quantity);
    }

    public void removeProductInBasket(Product product, double quantity) {
	this.basket.removeFromBasket(product, quantity);
	this.shop.increaseQuantity(product, quantity);
    }

    public void enterInShop(Shop shop) {
	this.shop = shop;
	basket = new Basket();
    }

    public int getCash() {
	return cash;
    }

    public void leaveShop(Shop shop) {
	pay();
	this.basket = null;
	this.shop = null;
    }

    private void pay() {
	double moneyToPay = 0;
	for (int i = 0; i < this.basket.productInBasket(); i++) {
	    Product currentProduct = this.basket.getProduct(i);
	    moneyToPay += currentProduct.getPrice() * this.basket.getQuantity(currentProduct);
	}

	this.cash -= moneyToPay;
	this.shop.receivePay(moneyToPay);
    }

    public void seeWhatsInTheBasket() {
	for (int i = 0; i < this.basket.productInBasket(); i++) {
	    Product currentProduct = this.basket.getProduct(i);
	    System.out.println(currentProduct.getName() + " - " + this.basket.getQuantity(currentProduct));

	}
    }
}
