package dojo.factory;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.Test;


public class FarmerTest {
	@Test
	public void integrationTest() {
		OutputStream outputStream = new ByteArrayOutputStream();
		PrintStream testStdOut = new PrintStream(outputStream, true);
		PrintStream originalStdOut = System.out;
		System.setOut(testStdOut);

		Farmer.random = new FakeRandom(373);
		Farmer.main(new String[]{});
		assertEquals("Harvested 198 tons in 5 days"
				+ System.getProperty("line.separator"),
				outputStream.toString());

		System.setOut(originalStdOut);
	}
}

class FakeRandom extends Random {
	private static final long serialVersionUID = 1L;
	private final int number;

	public FakeRandom(int i) {
		this.number = i;
	}

	public int nextInt(int range) {
		return number;
	}
}
