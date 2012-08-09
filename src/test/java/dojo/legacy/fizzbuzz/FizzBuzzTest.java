package dojo.legacy.fizzbuzz;

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
	public void testFlipp() {
		assertArrayEquals(new String[]{"Flipp"}, game.play(7, 7));
	}
	
	@Test
	public void testFlopp() {
		assertArrayEquals(new String[]{"Flopp"}, game.play(11, 11));
	}
	
	@Test
	public void testFizzBuzz() {
		assertArrayEquals(new String[]{"FizzBuzz"}, game.play(15, 15));
	}
	
	@Test
	public void testFlippFizz() {
		assertArrayEquals(new String[]{"FlippFizz"}, game.play(21, 21));
	}
	
	@Test
	public void testFloppFizz() {
		assertArrayEquals(new String[]{"FloppFizz"}, game.play(33, 33));
	}
	
	@Test
	public void testFlippFlopp() {
		assertArrayEquals(new String[]{"FlippFlopp"}, game.play(77, 77));
	}
	
	@Test
	public void testNumbersInBetween() {
		assertArrayEquals(new String[]{"1", "2"}, game.play(1, 2));
	}
}
