/**
 * 
 */
package dojo.legacy.fizzbuzz;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * @author eheijun
 *
 */
public class FizzBuzzTest {

	private GameEngine fizzBuzz; 
	
	@Before
	public void setUp() throws Exception {
		final Game game = GameFactory.getGame(GameType.FIZZBUZZ);
		fizzBuzz = new GameEngine(game);
	}
	
	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testPlayWith_0() {
		fizzBuzz.play(0, 0);
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_1() {
		final String[] result = fizzBuzz.play(1, 1);
		assertArrayEquals(result, new String[] {"1"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_3() {
		final String[] result = fizzBuzz.play(3, 3);
		assertArrayEquals(result, new String[] {"Fizz"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_5() {
		final String[] result = fizzBuzz.play(5, 5);
		assertArrayEquals(result, new String[] {"Buzz"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_7() {
		final String[] result = fizzBuzz.play(7, 7);
		assertArrayEquals(result, new String[] {"7"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_11() {
		final String[] result = fizzBuzz.play(11, 11);
		assertArrayEquals(result, new String[] {"11"});		
	}
	
	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_15() {
		final String[] result = fizzBuzz.play(15, 15);
		assertArrayEquals(result, new String[] {"FizzBuzz"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_21() {
		final String[] result = fizzBuzz.play(21, 21);
		assertArrayEquals(result, new String[] {"Fizz"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_77() {
		final String[] result = fizzBuzz.play(77, 77);
		assertArrayEquals(result, new String[] {"77"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_101() {
		final String[] result = fizzBuzz.play(101, 101);
		assertArrayEquals(result, new String[] {"101"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testPlayWith_15to10() {
		fizzBuzz.play(15, 10);
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_10to15() {
		final String[] result = fizzBuzz.play(10, 15);
		assertArrayEquals(result, new String[] {"Buzz", "11", "Fizz", "13", "14", "FizzBuzz"});
	}

}
