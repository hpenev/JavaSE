package shop;

import shop.objects.Buyer;
import shop.objects.ProductPerKilo;
import shop.objects.ProductPerUnit;
import shop.objects.Shop;

public class demo {
    public static void main(String[] args) {
	Shop metro = new Shop("Metro", "address", 1000);

	ProductPerKilo meat = new ProductPerKilo("Meat", 7.5, 1.5);
	ProductPerKilo cheese = new ProductPerKilo("Cheese", 12.5, 1.5);
	ProductPerKilo fish = new ProductPerKilo("Fish", 3.4, 1.5);

	ProductPerUnit beer = new ProductPerUnit("Beer", 1, 100);
	ProductPerUnit book = new ProductPerUnit("Book", 1, 100);
	ProductPerUnit chair = new ProductPerUnit("Chair", 20, 20);

	metro.addProduct(meat);
	metro.addProduct(cheese);
	metro.addProduct(fish);
	metro.addProduct(beer);
	metro.addProduct(book);
	metro.addProduct(chair);

	Buyer buyer = new Buyer(500, 10);

	buyer.enterInShop(metro);

	buyer.addProductInBasket(beer, 20);
	buyer.addProductInBasket(chair, 20);
	buyer.addProductInBasket(book, 20);
	buyer.removeProductInBasket(beer, 19);

	buyer.seeWhatsInTheBasket();

	buyer.leaveShop(metro);

	System.out.println("Shop cash: " + metro.getCash());
	System.out.println("Buyer cash: " + buyer.getCash());

    }
}
