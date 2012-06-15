package dojo.legacy.fizzbuzz;


public class GameFactory {
	
	public static Game getGame(GameType gameType) {
		if (GameType.FLIPPFLOPP.equals(gameType)) {
			return new FlippFlopper();
		} else if (GameType.FIZZBUZZ.equals(gameType)) {
			return new FizzBuzzer();
		} 
		return null;
	}

}
