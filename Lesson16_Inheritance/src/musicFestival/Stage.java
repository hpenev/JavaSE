package musicFestival;

public class Stage {
    public static void main(String[] args) {
	Group TheBeatles = new Group("The Beatles");
	Group LedZeppelin = new Group("Led Zeppelin");
	Group PinkFloyd = new Group("Pink Floyd");
	Group TheRollingStones = new Group("The Rolling Stones");

	Act[] acts = {
		new Act(20, 21, TheBeatles),
		new Act(21, 22, LedZeppelin),
		new Act(22, 23, PinkFloyd),
		new Act(23, 24, TheRollingStones)
	};

	Festival festival = new Festival("Sofia", "01.08.2017", 20, acts);
	System.out.println(festival.toString());

	System.out.println("Festival Starts: ");
	festival.startFest();

    }
}
