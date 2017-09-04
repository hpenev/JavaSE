package restaurant.clients;

import java.util.ArrayList;
import java.util.Random;

import restaurant.menu.dishes.Dish;
import restaurant.menu.drinks.Drink;

public class Businessman extends Client {

    public Businessman(String name) {
	super(name);
	this.clientType = ClientType.BUSINESSMAN;
	this.money = 50;
    }

    @Override
    public void makeOrder() {
	super.makeOrder();
	ArrayList<Drink> businessmanDrinks = this.restorant.getBussinesDrinks();
	ArrayList<Dish> businessmanDishes = this.restorant.getBussinesDishes();
	Drink drinkToOrder = businessmanDrinks.get(new Random().nextInt(businessmanDrinks.size()));
	Dish dishToOrder = businessmanDishes.get(new Random().nextInt(businessmanDishes.size()));
	this.waiter.order(this, drinkToOrder, dishToOrder);
    }

}
