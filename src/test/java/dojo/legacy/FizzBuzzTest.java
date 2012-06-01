package dojo.legacy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz mGame;

	@Before
	public void before() {
		mGame = new FizzBuzz();
	}
	
	@Test(expected=IllegalArgumentException.class) 
	public void testArrayStartsFromZero() {
		mGame.play(0, 0);
	}
	
	@Test
	public void testArrayLengthMatches() {
		String[] array = mGame.play(1, 15);
		assertTrue(array.length==15);
	}
	
	@Test
	public void testFizz() {
		String[] array = mGame.play(3, 3);
		assertArrayEquals(new String[]{"Fizz"}, array);
	}
	
	@Test
	public void testBuzz() {
		String[] array = mGame.play(5, 5);
		assertArrayEquals(new String[]{"Buzz"}, array);
	}
	
	@Test
	public void testFizzBuzz() {
		String[] array = mGame.play(15, 15);
		assertArrayEquals(new String[]{"FizzBuzz"}, array);
	}
	
	@Test
	public void testNonMatching() {
		String[] array = mGame.play(1, 2);
		assertArrayEquals(new String[]{"1", "2"}, array);
	}
	
	@Test
	public void testMultipleOfBuzz() {
		String[] array = mGame.play(10, 10);
		assertArrayEquals(new String[]{"Buzz"}, array);
	}
	
	@Test
	public void testMultipleOfFizz() {
		String[] array = mGame.play(6, 6);
		assertArrayEquals(new String[]{"Fizz"}, array);
	}
	
	@Test
	public void testMultipleOfFizzBuzz() {
		String[] array = mGame.play(30, 30);
		assertArrayEquals(new String[]{"FizzBuzz"}, array);
	}
}
