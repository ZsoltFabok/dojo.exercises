package dojo.dependency;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

public class GamerTest {
	FakeOutputHandler fakeOut;
	FakeInputHandler fakeIn;
	private String nl = System.getProperty("line.separator");
	
	@Before
	public void before() {
		fakeOut = new FakeOutputHandler();
		fakeIn = new FakeInputHandler();
	}
	
	@Test
	public void test() {
		//Given: this input
		fakeIn.setLine("1,15");
		
		//When: we play a game
		new Gamer(new FizzBuzz(), fakeIn, fakeOut).play();
		
		//Then: the output should be
		String expected = "fizz buzz: "+ nl + "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz  ";
		assertEquals(expected, fakeOut.toString());
	}
	
	// Class that captures and concatenates lines from System.out
	class FakeOutputHandler extends PrintStream {
		private StringBuilder sb = new StringBuilder();
		private String nl = System.getProperty("line.separator");

		public FakeOutputHandler() {
			super(System.out);
		}
		
		@Override
		public PrintStream printf(String format, Object... objects) {
			for(Object object : objects) {
				sb.append(object);
				sb.append(" ");
			}
			return null;
		}
		
		@Override
		public void println(String string) {
			sb.append(string + nl);
		}
		
		public String toString () {
			return this.sb.toString();
		}
	}
	
	// Class that let's you set System.in programmatically
	class FakeInputHandler extends BufferedReader {
		private String line;
		
		public FakeInputHandler() {
			super(new InputStreamReader(System.in));
		}
		
		@Override
		public String readLine() {
			return line;
		}
		
		public void setLine(String line) {
			this.line = line;
		}
		
	}

}
