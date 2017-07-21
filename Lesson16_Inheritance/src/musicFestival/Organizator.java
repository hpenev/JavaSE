package musicFestival;

public class Organizator {
    public static void main(String[] args) {
	Group TheBeatles = new Group("The Beatles");
	Group LedZeppelin = new Group("Led Zeppelin");
	Group PinkFloyd = new Group("Pink Floyd");

	Act[] acts = {
		new Act(20, 21, TheBeatles),
		new Act(21, 22, LedZeppelin),
		new Act(22, 23, PinkFloyd)
	};

	Festival festival = new Festival("Sofia", "21.07.2017", acts);
	System.out.println(festival.toString());

	festival.startFest();
    }
}
