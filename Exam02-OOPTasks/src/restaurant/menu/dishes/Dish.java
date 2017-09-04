package restaurant.menu.dishes;

public abstract class Dish {

    private String name;
    protected double price;
    protected double weight;
    protected String dishType;

    public Dish(String name) {
	this.name = name;
    }

    public boolean isMainDish() {
	return false;
    }

    public boolean isSalad() {
	return false;
    }

    public boolean isDessert() {
	return false;
    }
}
