package restaurant_v1.restaurant.menu.meals;

import restaurant_v1.restaurant.Restaurant.MenuType;
import restaurant_v1.restaurant.Restaurant.SectionType;
import restaurant_v1.restaurant.menu.Menu;

public abstract class Meals extends Menu {

    protected int weight;

    public Meals(SectionType section, String name, int price) {
	super(MenuType.MEAL, section, name, price);
	this.setWeight(weight);

    }

    protected abstract void setWeight(int weight);

}
