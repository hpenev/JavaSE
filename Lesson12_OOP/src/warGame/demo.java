package warGame;

public class demo {
    public static void main(String[] args) {
	Game game = new Game();
	game.printDeck(game.createCardDeck());

	Player p1 = new Player("Pesho");
	Player p2 = new Player("Gosho");

    }
}
