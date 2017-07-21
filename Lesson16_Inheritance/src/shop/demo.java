package shop;

public class demo {
    public static void main(String[] args) {
	Magazine metro = new Magazine("Metro", "address", 1000);

	ProductKG meat = new ProductKG("Meat", 7.5, 1.5);
	ProductKG cheese = new ProductKG("Cheese", 12.5, 1.5);
	ProductKG fish = new ProductKG("Fish", 3.4, 1.5);

	ProductPcs beer = new ProductPcs("Beer", 1, 100);
	ProductPcs book = new ProductPcs("Book", 1, 100);
	ProductPcs chair = new ProductPcs("Chair", 20, 20);

	metro.addProduct(meat);
	metro.addProduct(cheese);
	metro.addProduct(fish);
	metro.addProduct(beer);
	metro.addProduct(book);
	metro.addProduct(chair);

	metro.revision();

	Buyer buyer = new Buyer(metro, 100, 10);
	buyer.addStockInBasket(beer, 20);
	buyer.addStockInBasket(chair, 20);
	buyer.addStockInBasket(book, 20);

	buyer.pay();
	metro.revision();
    }
}
