package dojo.dependency;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class GamerTest {

	@Test
	public void test() {
		ByteArrayInputStream inputStream = new ByteArrayInputStream("1,15".getBytes());
		System.setIn(inputStream);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream, true));
		
		new Gamer().play();

		String output = outputStream.toString();
		assertEquals("fizz buzz: \r\n1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz ", output);
	}

}
