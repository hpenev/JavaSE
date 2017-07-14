package warGame;

public class Player {
    private String name;
    private Card[] cards;

    public Player(String name) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	    System.out.println("Player created");
	} else {
	    System.out.println("Invalid player name");
	}
    }

}
