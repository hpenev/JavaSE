package restaurant_v1.restaurant.menu.drinks;

import restaurant_v1.restaurant.Restaurant.MenuType;
import restaurant_v1.restaurant.Restaurant.SectionType;
import restaurant_v1.restaurant.menu.Menu;

public abstract class Drinks extends Menu {

    public Drinks(SectionType section, String name, int price) {
	super(MenuType.DRINK, section, name, price);
    }

}
