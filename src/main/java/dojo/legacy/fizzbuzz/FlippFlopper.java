/**
 * 
 */
package dojo.legacy.fizzbuzz;

/**
 * @author eheijun
 *
 */
public class FlippFlopper implements Game {
	
	private static final int[] DIV = {7, 11};
	private static final String[] RESULT = {"Flipp", "Flopp"};

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
