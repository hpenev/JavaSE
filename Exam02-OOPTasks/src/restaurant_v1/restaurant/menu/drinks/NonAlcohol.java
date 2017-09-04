package restaurant_v1.restaurant.menu.drinks;

import restaurant_v1.restaurant.Restaurant.SectionType;
import restaurant_v1.restaurant.menu.IVegan;

public class NonAlcohol extends Drinks implements IVegan {

    public NonAlcohol(String name) {
	super(SectionType.NONALCOHOL, name, 2);
    }

}
