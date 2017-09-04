package restaurant_v1.restaurant.menu.meals;

import java.util.Random;

import restaurant_v1.restaurant.Restaurant.SectionType;
import restaurant_v1.restaurant.menu.IMurta;

public class MainDish extends Meals implements IMurta {

    public MainDish(String name) {
	super(SectionType.MAIN_DISH, name, 9);
    }

    @Override
    public void setWeight(int weight) {
	if (weight >= 400 && weight <= 800) {
	    this.weight = weight;
	} else {
	    this.weight = new Random().nextInt(401) + 400;
	}

    }

}
