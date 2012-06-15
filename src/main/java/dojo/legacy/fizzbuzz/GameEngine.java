package dojo.legacy.fizzbuzz;

public class GameEngine {
	
	private final Game game;
	
	public GameEngine(final Game game) {
		this.game = game;
	}

	public String[] play(final int start, final int stop) {
		if (start <= 0 || stop < start) {
			throw new IllegalArgumentException();
		}
		final int length = stop - start + 1;
		final String[] array = new String[length];
		for (int ind = 0; ind < length; ind++) {
			final int currentNumber = start + ind;
			final StringBuffer buffer = new StringBuffer();
			if (currentNumber % game.getDivider(0) == 0) {
				buffer.append(game.getText(0));
			}
			if (currentNumber % game.getDivider(1) == 0) {
				buffer.append(game.getText(1));
			}
			if (buffer.length() == 0) {
				buffer.append(Integer.toString(currentNumber));
			}
			array[ind] = buffer.toString();
		}
		return array;
	}

}