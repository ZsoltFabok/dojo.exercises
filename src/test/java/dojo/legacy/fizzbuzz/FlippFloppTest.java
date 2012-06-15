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
public class FlippFloppTest {

	private GameEngine flippFlopp; 
	
	@Before
	public void setUp() throws Exception {
		final Game game = GameFactory.getGame(GameType.FLIPPFLOPP);
		flippFlopp = new GameEngine(game);
	}
	
	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testPlayWith_0() {
		flippFlopp.play(0, 0);
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_1() {
		final String[] result = flippFlopp.play(1, 1 );
		assertArrayEquals(result, new String[] {"1"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_3() {
		final String[] result = flippFlopp.play(3, 3);
		assertArrayEquals(result, new String[] {"3"});		
	}
	
	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_5() {
		final String[] result = flippFlopp.play(5, 5);
		assertArrayEquals(result, new String[] {"5"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_7() {
		final String[] result = flippFlopp.play(7, 7);
		assertArrayEquals(result, new String[] {"Flipp"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_11() {
		final String[] result = flippFlopp.play(11, 11);
		assertArrayEquals(result, new String[] {"Flopp"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_15() {
		final String[] result = flippFlopp.play(15, 15);
		assertArrayEquals(result, new String[] {"15"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_21() {
		final String[] result = flippFlopp.play(21, 21);
		assertArrayEquals(result, new String[] {"Flipp"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_77() {
		final String[] result = flippFlopp.play(77, 77);
		assertArrayEquals(result, new String[] {"FlippFlopp"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_101() {
		final String[] result = flippFlopp.play(101, 101);
		assertArrayEquals(result, new String[] {"101"});		
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testPlayWith_15to10() {
		flippFlopp.play(77, 66);
	}

	/**
	 * Test method for {@link dojo.legacy.GameEngine#play(int, int)}.
	 */
	@Test
	public void testPlayWith_66to77() {
		final String[] result = flippFlopp.play(66, 77);
		assertArrayEquals(result, new String[] {"Flopp", "67", "68", "69", "Flipp", "71", "72", "73", "74", "75", "76", "FlippFlopp"});
	}

}
