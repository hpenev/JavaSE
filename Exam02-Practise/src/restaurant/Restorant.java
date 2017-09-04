package restaurant;

import java.util.ArrayList;
import java.util.Random;

import restaurant.menu.dishes.Dish;
import restaurant.menu.drinks.Drink;

public class Restorant {
    private String name;
    private String adres;
    private double money;
    ArrayList<Waiter> waiters;
    ArrayList<Dish> dishes;
    ArrayList<Drink> drinks;

    public Restorant(String name, String adres, double money) {
	this.name = name;
	this.adres = adres;
	this.money = money;
	this.waiters = new ArrayList<>();
	this.dishes = generateDishes(10);
	this.drinks = generateDrinks(20);
    }

    private ArrayList<Drink> generateDrinks(int number) {
	ArrayList<Drink> result = new ArrayList<>();

	return result;
    }

    private ArrayList<Dish> generateDishes(int number) {
	ArrayList<Dish> result = new ArrayList<>();

	return result;
    }

    public Waiter getRandomWaiter() {
	return this.waiters.get(new Random().nextInt(this.waiters.size()));
    }

    public void addWaiter(Waiter waiter) {
	this.waiters.add(waiter);
    }

    public ArrayList<Drink> getBussinesDrinks() {
	ArrayList<Drink> bussinessDrinks = new ArrayList<>();
	for (Drink drink : this.drinks) {
	    if (drink.isAlcohol()) {
		bussinessDrinks.add(drink);
	    }
	}
	return bussinessDrinks;
    }

    public ArrayList<Dish> getBussinesDishes() {
	ArrayList<Dish> bussinessDishes = new ArrayList<>();
	for (Dish dish : this.dishes) {
	    if (dish.isMainDish()) {
		bussinessDishes.add(dish);
	    }
	}
	return bussinessDishes;
    }

}
