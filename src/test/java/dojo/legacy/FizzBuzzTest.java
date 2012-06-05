package dojo.legacy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void shouldReturnOneForOne() {
		assertArrayEquals(new String[]{"1"}, fizzBuzz.play(1, 1));
	}
	
	@Test
	public void shouldReturnTwoForTwo() {
		assertArrayEquals(new String[]{"2"}, fizzBuzz.play(2, 2));
	}
	
	@Test
	public void shouldReturnFizzForThree() {
		assertArrayEquals(new String[]{"Fizz"}, fizzBuzz.play(3, 3));
	}
	
	@Test
	public void shouldReturnFizzForSix() {
		assertArrayEquals(new String[]{"Fizz"}, fizzBuzz.play(6, 6));
	}
	
	@Test
	public void shouldReturnBuzzForFive() {
		assertArrayEquals(new String[]{"Buzz"}, fizzBuzz.play(5, 5));
	}
	
	@Test
	public void shouldReturnBuzzForTen() {
		assertArrayEquals(new String[]{"Buzz"}, fizzBuzz.play(10, 10));
	}
	
	@Test
	public void shouldReturnFizzBuzzForFifteen() {
		assertArrayEquals(new String[]{"FizzBuzz"}, fizzBuzz.play(15, 15));
	}
	
	@Test
	public void shouldReturnFizzBuzzForThirty() {
		assertArrayEquals(new String[]{"FizzBuzz"}, fizzBuzz.play(30, 30));
	}
	
	@Test
	public void shouldReturnNumbersInAProperSequence() {
		assertArrayEquals(new String[]{"Buzz", "11", "Fizz", "13", "14"}, fizzBuzz.play(10, 14));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionForZeroAsAStartParameter() {
		fizzBuzz.play(0, 1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionWhenStopIsGreaterThanStart() {
		fizzBuzz.play(2, 1);
	}
}
