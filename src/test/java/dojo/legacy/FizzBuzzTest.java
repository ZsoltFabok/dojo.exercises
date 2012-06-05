package dojo.legacy;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz game;

	@Before
	public void before() {
		game = new FizzBuzz();
	}
	
	@Test(expected=IllegalArgumentException.class) 
	public void testStartFromZero() {
		game.play(0, 0);
	}
	
	@Test(expected=IllegalArgumentException.class) 
	public void testEndSmallerThanStart() {
		game.play(1, 0);
	}
	
	@Test
	public void testFizz() {
		assertArrayEquals(new String[]{"Fizz"}, game.play(3, 3));
	}
	
	@Test
	public void testBuzz() {
		assertArrayEquals(new String[]{"Buzz"}, game.play(5, 5));
	}
	
	@Test
	public void testFizzBuzz() {
		assertArrayEquals(new String[]{"FizzBuzz"}, game.play(15, 15));
	}
	
	@Test
	public void testNumbersInBetween() {
		assertArrayEquals(new String[]{"1", "2"}, game.play(1, 2));
	}
	
	@Test
	public void testMultipleOfBuzz() {
		assertArrayEquals(new String[]{"Buzz"}, game.play(10, 10));
	}
	
	@Test
	public void testMultipleOfFizz() {
		assertArrayEquals(new String[]{"Fizz"}, game.play(6, 6));
	}
	
	@Test
	public void testMultipleOfFizzBuzz() {
		assertArrayEquals(new String[]{"FizzBuzz"}, game.play(30, 30));
	}
}
