/**
 * 
 */
package dojo.legacy.fizzbuzz;

/**
 * @author eheijun
 *
 */
public class FizzBuzzer implements Game {

	private static final int[] DIV = {3, 5};
	private static final String[] RESULT = {"Fizz", "Buzz"};
	
	/*
	 * (non-Javadoc)
	 * @see dojo.legacy.fizzbuzz.GameParameters#getDivider(int)
	 */
	@Override
	public int getDivider(final int ind) {
		return DIV[ind];
	}

	/*
	 * (non-Javadoc)
	 * @see dojo.legacy.fizzbuzz.GameParameters#getText(int)
	 */
	@Override
	public String getText(final int ind) {
		return RESULT[ind];
	}


}
