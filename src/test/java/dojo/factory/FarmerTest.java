package dojo.factory;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.Test;

public class FarmerTest {

	@Test
	public void integrationTest() throws Exception {
		OutputStream outputStream = new ByteArrayOutputStream();
		PrintStream testStdOut = new PrintStream(outputStream, true);
		PrintStream originalStdOut = System.out;
		System.setOut(testStdOut);

		Farmer.random = new FakeRandom();
		Game.main(new String[] {});
		assertEquals("Harvested 198 tons in 5 days"
				+ System.getProperty("line.separator"), outputStream.toString());

		System.setOut(originalStdOut);
	}
}

class FakeRandom extends Random {
	private static final long serialVersionUID = 1L;

	@Override
	public int nextInt(int range) {
		return 373;
	}
}

class FakeWeather extends Weather {
	Water water = new Water(1);
	
	FakeWeather(Water water) {
		super(water);
		this.water = water;
	}

	FakeWeather() {
		super(null);
	}

	@Override
	public Water lastFall() {
		return water;
	}
}