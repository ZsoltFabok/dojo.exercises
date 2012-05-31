package dojo.factory;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.Test;

public class IntegrationTest {

	@Test
	public void integrationTest() throws Exception {
		OutputStream outputStream = new ByteArrayOutputStream();
		PrintStream testStdOut = new PrintStream(outputStream, true);
		PrintStream originalStdOut = System.out;
		System.setOut(testStdOut);
		Main.random = new FakeRandom(20);
		Main.main(new String[] {});
		assertEquals("Harvested 10 tons in 5 days"
				+ System.getProperty("line.separator"), outputStream.toString());
		System.setOut(originalStdOut);
	}
}

class FakeRandom extends Random{

	private static final long serialVersionUID = 1L;
	private int fakeRandomNumber;
	
	public FakeRandom(int fakeRandomNumber) {
		this.fakeRandomNumber = fakeRandomNumber;
	}

	@Override
	protected int next(int bits) {
		return fakeRandomNumber;
	}
}