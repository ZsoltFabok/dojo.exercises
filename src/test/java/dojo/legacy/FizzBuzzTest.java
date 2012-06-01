/**
 * 
 */
package dojo.legacy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author eheijun
 *
 */
public class FizzBuzzTest {

	private static FizzBuzz fizzBuzz; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		fizzBuzz = new FizzBuzz();
	}
	
	/**
	 * Test method for {@link dojo.legacy.FizzBuzz#play(int, int)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testPlayWith_0() {
		fizzBuzz.play(0, 0);
	}

	/**
	 * Test method for {@link dojo.legacy.FizzBuzz#play(int, int)}.
	 */
	@Test
	public void testPlayWith_1() {
		String[] result = fizzBuzz.play(1, 1);
		assertTrue(result.length == 1);
		assertTrue(result[0].equals("1"));	
	}

	/**
	 * Test method for {@link dojo.legacy.FizzBuzz#play(int, int)}.
	 */
	@Test
	public void testPlayWith_3() {
		String[] result = fizzBuzz.play(3, 3);
		assertTrue(result.length == 1);
		assertTrue(result[0].equals("Fizz"));	
	}

	/**
	 * Test method for {@link dojo.legacy.FizzBuzz#play(int, int)}.
	 */
	@Test
	public void testPlayWith_5() {
		String[] result = fizzBuzz.play(5, 5);
		assertTrue(result.length == 1);
		assertTrue(result[0].equals("Buzz"));	
	}

	/**
	 * Test method for {@link dojo.legacy.FizzBuzz#play(int, int)}.
	 */
	@Test
	public void testPlayWith_15() {
		String[] result = fizzBuzz.play(15, 15);
		assertTrue(result.length == 1);
		assertTrue(result[0].equals("FizzBuzz"));	
	}

	/**
	 * Test method for {@link dojo.legacy.FizzBuzz#play(int, int)}.
	 */
	@Test
	public void testPlayWith_101() {
		String[] result = fizzBuzz.play(101, 101);
		assertTrue(result.length == 1);
		assertTrue(result[0].equals("101"));	
	}

	/**
	 * Test method for {@link dojo.legacy.FizzBuzz#play(int, int)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testPlayWith_15to10() {
		fizzBuzz.play(15, 10);
	}

	/**
	 * Test method for {@link dojo.legacy.FizzBuzz#play(int, int)}.
	 */
	@Test
	public void testPlayWith_10to15() {
		String[] result = fizzBuzz.play(10, 15);
		assertTrue(result.length == 6);
		assertArrayEquals(result, new String[] {"Buzz", "11", "Fizz", "13", "14", "FizzBuzz"});
	}

}
