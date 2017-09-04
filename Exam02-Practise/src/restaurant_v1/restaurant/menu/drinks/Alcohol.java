package restaurant_v1.restaurant.menu.drinks;

import restaurant_v1.restaurant.Restaurant.SectionType;
import restaurant_v1.restaurant.menu.IMurta;

public class Alcohol extends Drinks implements IMurta {

    public Alcohol(String name) {
	super(SectionType.ALCOHOL, name, 4);
    }

}
