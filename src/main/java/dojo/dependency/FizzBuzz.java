package dojo.dependency;

/**
 * <code>FizzBuzz</code> is simple game, where the players say the natural numbe
 * in ascending order, but replace every number
 * <ul>
 * <li>with <i>Fizz</i>, if the number can be divided by 3</li>
 * <li>with <i>Buzz</i>, if the number can be divided by 5</li>
 * <li>with <i>FizzBuzz</i>, if the number can be divided by 3 and 5</li>
 * </ul>
 * .
 */
public class FizzBuzz {

	/**
	 * Plays <i>fizz-buzz</i> game.
	 *
	 * @param start left side of the interval (included)
	 * @param stop right side of the interval (included)
	 * @return the <i>played</i> array.
	 * @Throws {@link IllegalArgumentException} if the parameter ranges are inco
	 * the start is bigger than the stop or any of them is equal or lower to zer
	 */
	public String[] play(int start, int stop) {
	    if (start > 0 && start <= stop) {
	        int length = stop - start + 1;
	        String[] returnValue = new String[length];
	        for (int i = 0; i < length; i++) {
	            returnValue[i] = evaluate(start + i);
	        }
	        return returnValue;
	    } else {
	        throw new IllegalArgumentException();
	    }
	}
	
	private String evaluate(int value) {
	    if (value % 15 == 0) {
	        return "FizzBuzz";
	    } else if (value % 5 == 0) {
	        return "Buzz";
	    } else if (value % 3 == 0) {
	        return "Fizz";
	    } else {
	        return Integer.toString(value);
	    }
	}
}
