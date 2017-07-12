package inClass;
public class demo {
    public static void main(String[] args) {
	Chocolate milka = new Chocolate();
	milka.color = "brown";
	milka.weight = 130;
	milka.cocoaPercentage = 14.1;

	Chocolate lindt = new Chocolate();
	lindt.cocoaPercentage = 40;
	lindt.weight = 1000;
	lindt.color = "black";

	Car vw = new Car();
	vw.model = "passat";
	vw.color = "urban gray";
	vw.currentSpeed = 55.5;
	vw.maxSpeed = 188.5;
	vw.year = 2004;

	Car ford = new Car();
	ford.model = "focus";
	ford.color = "black";
	ford.currentSpeed = 35;
	ford.maxSpeed = 140;
	ford.year = 2000;

	ford.currentSpeed = 80;
	ford.beep();
	Person hristo = new Person();
	hristo.age = 30;
	hristo.name = "hristo";

	ford.owner = hristo;

	Person maria = new Person();
	maria.friend = hristo;

	System.out.println(maria.friend.name);

    }
}
