package musicFestival;

public class Stage {
    public static void main(String[] args) {
	Group g1 = new Group("group1", "22:00", "23:00");
	Group g2 = new Group("group2", "23:00", "00:00");
	Group g3 = new Group("group3", "00:00", "01:00");

	Group[] groups = { g1, g2, g3 };

	Festival festival = new Festival("Sofia", "12.05.2018", groups);
	System.out.println(festival.toString());

    }
}
