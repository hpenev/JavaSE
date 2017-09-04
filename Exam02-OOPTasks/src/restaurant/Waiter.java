package restaurant;

import restaurant.clients.Businessman;
import restaurant.menu.dishes.Dish;
import restaurant.menu.drinks.Drink;

public class Waiter {
    private String name;
    private double tipMoney;
    private Restorant restaurant;

    public Waiter(String name) {
	this.name = name;
	this.tipMoney = 0;
    }

    public void order(Businessman businessman, Drink drinkToOrder, Dish dishToOrder) {

    }

}
